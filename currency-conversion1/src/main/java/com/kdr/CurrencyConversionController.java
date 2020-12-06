package com.kdr;

import java.util.HashMap;
import java.util.Map;

import com.kdr.client.CurrencyConversionProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

@Autowired
CurrencyConversionProxy currencyConversionProxy;

	@GetMapping("/currency-convertor/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String from,
			@PathVariable String to, @PathVariable Long quantity) {
		
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CurrencyConversion> response =  new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", 
				CurrencyConversion.class, uriVariables);
		
		
		CurrencyConversion currencyConversion = response.getBody();
		
		return new CurrencyConversion(currencyConversion.getId(), from, to, 
				currencyConversion.getconversionMultiple(), quantity, 
				quantity * currencyConversion.getconversionMultiple(), 
				currencyConversion.getPort());
	}
	
	@GetMapping("/currency-convertor-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrencyFeign(@PathVariable String from,
			@PathVariable String to, @PathVariable Long quantity) {
		
		CurrencyConversion response = currencyConversionProxy.getExchangeValue(from, to);
		
		return new CurrencyConversion(response.getId(), from, to, 
				response.getconversionMultiple(), quantity, 
				quantity * response.getconversionMultiple(), 
				response.getPort());
	}
}
