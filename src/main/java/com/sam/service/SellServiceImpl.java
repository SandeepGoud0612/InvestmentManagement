/**
 * SellServiceImpl
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

import com.sam.dao.SellDAO;
import com.sam.model.Sell;

/**
 * @author sandeep.
 *
 */
@Service
public class SellServiceImpl implements SellService {

	@Autowired
	private SellDAO sellDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.SellService#createSell(com.sam.model.Sell)
	 */
	@Override
	public Sell createSell(Sell sell) {
		return sellDAO.save(sell);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.SellService#getSellById(java.lang.Long)
	 */
	@Override
	public Sell getSellById(Long id) {
		return sellDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.SellService#getAllSells()
	 */
	@Override
	public List<Sell> getAllSells() {
		return sellDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.SellService#updateSell(java.lang.Long,
	 * com.sam.model.Sell)
	 */
	@Override
	public Sell updateSell(Long id, Sell sell) {
		return sellDAO.save(sell);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.SellService#deleteSell(java.lang.Long)
	 */
	@Override
	public void deleteSell(Long id) {
		sellDAO.delete(id);
	}

}
