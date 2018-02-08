/**
 * CoinService
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Coin;

/**
 * @author sandeep.
 *
 */
public interface CoinService {

	Coin createCoin(final Coin coin);

	Coin getCoinById(final Long id);

	List<Coin> getAllCoins();

	Coin updateCoin(final Long id, final Coin coin);

	void deleteCoin(final Long id);

}
