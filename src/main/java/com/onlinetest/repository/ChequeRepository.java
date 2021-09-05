package com.onlinetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinetest.entity.exam.Cheque;

public interface ChequeRepository extends JpaRepository<Cheque, Long>{

}
