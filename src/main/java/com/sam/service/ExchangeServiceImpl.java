/**
 * ExchangeServiceImpl
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

import com.sam.dao.ExchangeDAO;
import com.sam.model.Exchange;

/**
 * @author sandeep.
 *
 */
@Service
public class ExchangeServiceImpl implements ExchangeService {

	@Autowired
	private ExchangeDAO exchangeDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExchangeService#createExchange(com.sam.model.Exchange)
	 */
	@Override
	public Exchange createExchange(Exchange exchange) {
		return exchangeDAO.save(exchange);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExchangeService#getExchangeById(java.lang.Long)
	 */
	@Override
	public Exchange getExchangeById(Long id) {
		return exchangeDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExchangeService#getAllExchanges()
	 */
	@Override
	public List<Exchange> getAllExchanges() {
		return exchangeDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExchangeService#updateExchange(java.lang.Long,
	 * com.sam.model.Exchange)
	 */
	@Override
	public Exchange updateExchange(Long id, Exchange exchange) {
		return exchangeDAO.save(exchange);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ExchangeService#deleteExchange(java.lang.Long)
	 */
	@Override
	public void deleteExchange(Long id) {
		exchangeDAO.delete(id);
	}

}
