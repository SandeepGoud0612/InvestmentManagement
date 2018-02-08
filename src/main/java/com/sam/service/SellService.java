/**
 * SellService
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Sell;

/**
 * @author sandeep.
 *
 */
public interface SellService {

	Sell createSell(final Sell sell);

	Sell getSellById(final Long id);

	List<Sell> getAllSells();

	Sell updateSell(final Long id, final Sell sell);

	void deleteSell(final Long id);

}
