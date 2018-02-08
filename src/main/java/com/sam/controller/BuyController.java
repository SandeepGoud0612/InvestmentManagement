/**
 * BuyController
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

import com.sam.model.Buy;
import com.sam.service.BuyService;

/**
 * @author sandeep.
 *
 */
@RestController
@RequestMapping(value="/buys")
public class BuyController {
	
	@Autowired
	private BuyService buyService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Buy> createBuy(@RequestBody final Buy buy) {
		Buy newBuy = buyService.createBuy(buy);
		return new ResponseEntity<>(newBuy, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Buy> getBuyById(@PathVariable final Long id) {
		Buy buy = buyService.getBuyById(id);
		return new ResponseEntity<>(buy, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Buy>> getAllBuys() {
		List<Buy> buys = buyService.getAllBuys();
		return new ResponseEntity<List<Buy>>(buys, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Buy> updateBuy(@PathVariable final Long id,
			@RequestBody final Buy buy) {
		Buy buyUpdated = buyService.updateBuy(id, buy);
		return new ResponseEntity<Buy>(buyUpdated, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteBuy(@PathVariable final Long id) {
		buyService.deleteBuy(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
