package com.onlinetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetest.entity.exam.Cheque;
import com.onlinetest.services.ChequeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/cheque")
public class ChequeController {
	
	@Autowired
	private ChequeService chequeservice;
	
	@PostMapping("/")
	public ResponseEntity<Cheque> saveRequest(@RequestBody Cheque cheque){
		return ResponseEntity.ok(this.chequeservice.addRequest(cheque));
	}
	
	@PutMapping("/")
	public ResponseEntity<Cheque> approveRequest(@RequestBody Cheque cheque){
		return ResponseEntity.ok(this.chequeservice.approveRequest(cheque));
	}

}
