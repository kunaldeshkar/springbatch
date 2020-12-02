package com.kdr;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="forex-service", url="localhost:8000")
public interface CurrencyConversionProxy {

	@GetMapping("currency-exchange/from/{from}/to/{to}") 
	public CurrencyConversion getExchangeValue(
			@PathVariable("from") String from, @PathVariable("to") String to);
	
}
