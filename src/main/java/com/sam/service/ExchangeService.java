/**
 * ExchangeService
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Exchange;

/**
 * @author sandeep.
 *
 */
public interface ExchangeService {

	Exchange createExchange(final Exchange exchange);

	Exchange getExchangeById(final Long id);

	List<Exchange> getAllExchanges();

	Exchange updateExchange(final Long id, final Exchange exchange);

	void deleteExchange(final Long id);

}
