/**
 * CoinServiceImpl
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

import com.sam.dao.CoinDAO;
import com.sam.model.Coin;

/**
 * @author sandeep.
 *
 */
@Service
public class CoinServiceImpl implements CoinService {

	@Autowired
	private CoinDAO coinDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.CoinService#createCoin(com.sam.model.Coin)
	 */
	@Override
	public Coin createCoin(Coin coin) {
		return coinDAO.save(coin);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.CoinService#getCoinById(java.lang.Long)
	 */
	@Override
	public Coin getCoinById(Long id) {
		return coinDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.CoinService#getAllCoins()
	 */
	@Override
	public List<Coin> getAllCoins() {
		return coinDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.CoinService#updateCoin(java.lang.Long,
	 * com.sam.model.Coin)
	 */
	@Override
	public Coin updateCoin(Long id, Coin coin) {
		return coinDAO.save(coin);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.CoinService#deleteCoin(java.lang.Long)
	 */
	@Override
	public void deleteCoin(Long id) {
		coinDAO.delete(id);
	}

}
