/**
 * SellController
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sam.model.Sell;
import com.sam.service.SellService;

/**
 * @author sandeep.
 *
 */
@RestController
@RequestMapping(value="/sells")
public class SellController {
	
	@Autowired
	private SellService sellService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sell> createSell(@RequestBody final Sell sell) {
		Sell newSell = sellService.createSell(sell);
		return new ResponseEntity<>(newSell, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sell> getSellById(@PathVariable final Long id) {
		Sell sell = sellService.getSellById(id);
		return new ResponseEntity<>(sell, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Sell>> getAllSells() {
		List<Sell> sells = sellService.getAllSells();
		return new ResponseEntity<List<Sell>>(sells, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sell> updateSell(@PathVariable final Long id,
			@RequestBody final Sell sell) {
		Sell sellUpdated = sellService.updateSell(id, sell);
		return new ResponseEntity<Sell>(sellUpdated, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteSell(@PathVariable final Long id) {
		sellService.deleteSell(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}


}
