/**
 * InvestmentService
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Investment;

/**
 * @author sandeep.
 *
 */
public interface InvestmentService {

	Investment createInvestment(final Investment investment);

	Investment getInvestmentById(final Long id);

	List<Investment> getAllInvestments();

	Investment updateInvestment(final Long id, final Investment investment);

	void deleteInvestment(final Long id);

}
