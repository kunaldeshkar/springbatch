package com.kdr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {

	@Value("${server.port}")
	int port;
	
	@Autowired
	ExcahngeRepository exchangeRepository;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, 
			@PathVariable String to) {
		
		ExchangeValue exValue = exchangeRepository.findByFromAndTo(from, to);
		
		exValue.setPort(port);
		
		return exValue;
	}
}
