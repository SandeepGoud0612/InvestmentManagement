/**
 * BuyServiceImpl
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

import com.sam.dao.BuyDAO;
import com.sam.model.Buy;

/**
 * @author sandeep.
 *
 */
@Service
public class BuyServiceImpl implements BuyService {

	@Autowired
	private BuyDAO buyDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BuyService#createBuy(com.sam.model.Buy)
	 */
	@Override
	public Buy createBuy(Buy buy) {
		return buyDAO.save(buy);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BuyService#getBuyById(java.lang.Long)
	 */
	@Override
	public Buy getBuyById(Long id) {
		return buyDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BuyService#getAllBuys()
	 */
	@Override
	public List<Buy> getAllBuys() {
		return buyDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BuyService#updateBuy(java.lang.Long, com.sam.model.Buy)
	 */
	@Override
	public Buy updateBuy(Long id, Buy buy) {
		return buyDAO.save(buy);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BuyService#deleteBuy(java.lang.Long)
	 */
	@Override
	public void deleteBuy(Long id) {
		buyDAO.delete(id);
	}

}
