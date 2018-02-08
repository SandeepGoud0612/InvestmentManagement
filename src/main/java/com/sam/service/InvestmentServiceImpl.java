/**
 * InvestmentServiceImpl
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InvestmentDAO;
import com.sam.model.Investment;

/**
 * @author sandeep.
 *
 */
@Service
public class InvestmentServiceImpl implements InvestmentService {

	@Autowired
	private InvestmentDAO investmentDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sam.service.InvestmentService#createInvestment(com.sam.model.Investment)
	 */
	@Override
	public Investment createInvestment(Investment investment) {
		return investmentDAO.save(investment);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.InvestmentService#getInvestmentById(java.lang.Long)
	 */
	@Override
	public Investment getInvestmentById(Long id) {
		return investmentDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.InvestmentService#getAllInvestments()
	 */
	@Override
	public List<Investment> getAllInvestments() {
		return investmentDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.InvestmentService#updateInvestment(java.lang.Long,
	 * com.sam.model.Investment)
	 */
	@Override
	public Investment updateInvestment(Long id, Investment investment) {
		return investmentDAO.save(investment);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.InvestmentService#deleteInvestment(java.lang.Long)
	 */
	@Override
	public void deleteInvestment(Long id) {
		investmentDAO.delete(id);
	}

}
