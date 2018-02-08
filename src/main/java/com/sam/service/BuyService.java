/**
 * BuyService
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Buy;

/**
 * @author sandeep.
 *
 */
public interface BuyService {

	Buy createBuy(final Buy buy);

	Buy getBuyById(final Long id);

	List<Buy> getAllBuys();

	Buy updateBuy(final Long id, final Buy buy);

	void deleteBuy(final Long id);

}
