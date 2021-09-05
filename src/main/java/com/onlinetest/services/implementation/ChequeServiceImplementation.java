package com.onlinetest.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetest.entity.exam.Cheque;
import com.onlinetest.repository.ChequeRepository;
import com.onlinetest.services.ChequeService;

@Service
public class ChequeServiceImplementation implements ChequeService{

	@Autowired
	private ChequeRepository chequeRepository;
	
	@Override
	public Cheque addRequest(Cheque cheque) {
		return this.chequeRepository.save(cheque);
	}

	@Override
	public Cheque approveRequest(Cheque cheque) {
		return this.chequeRepository.save(cheque);
	}

}
