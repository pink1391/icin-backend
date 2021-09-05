package com.onlinetest.services;

import com.onlinetest.entity.exam.Cheque;

public interface ChequeService {
	
	public Cheque addRequest(Cheque cheque);
	
	public Cheque approveRequest(Cheque cheque);

}
