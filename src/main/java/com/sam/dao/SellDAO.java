/**
 * SellDAO
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Sell;

/**
 * @author sandeep.
 *
 */
@Repository
public interface SellDAO extends JpaRepository<Sell, Long> {

}