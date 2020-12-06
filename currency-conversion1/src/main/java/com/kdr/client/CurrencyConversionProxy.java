package com.kdr.client;

import com.kdr.CurrencyConversion;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "forex-service")
@RibbonClient(name = "forex-service")
public interface CurrencyConversionProxy {

	@GetMapping("currency-exchange/from/{from}/to/{to}") 
	public CurrencyConversion getExchangeValue(
			@PathVariable("from") String from, @PathVariable("to") String to);
	
}
