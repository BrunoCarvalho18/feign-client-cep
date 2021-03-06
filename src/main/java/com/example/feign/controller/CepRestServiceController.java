package com.example.feign.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.model.CepResponse;
import com.example.feign.service.CepService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("v1/ceps")
public class CepRestServiceController {
	
	 
	 private final CepService cepService;
	 
	 @ResponseStatus(HttpStatus.OK)
	 @RequestMapping(value = "/{cep}", method = RequestMethod.GET)
	 public CepResponse getCep(@PathVariable String cep) {
	 return cepService.getCep(cep);
	 }

}
