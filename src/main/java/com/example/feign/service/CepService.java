package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.feign.model.CepResponse;

@FeignClient(name = "cepService", url = "http://api.postmon.com.br")
public interface CepService {
	
	@RequestMapping("/v1/cep/{cep}")
	CepResponse getCep(@PathVariable("cep") String cep);

}
