/**
 * CoinController
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

import com.sam.model.Coin;
import com.sam.service.CoinService;

/**
 * @author sandeep.
 *
 */
@RestController
@RequestMapping(value = "/coins")
public class CoinController {

	@Autowired
	private CoinService coinService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Coin> createCoin(@RequestBody final Coin coin) {
		Coin coinNew = coinService.createCoin(coin);
		return new ResponseEntity<Coin>(coinNew, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Coin> getCoinById(@PathVariable final Long id) {
		Coin coin = coinService.getCoinById(id);
		return new ResponseEntity<Coin>(coin, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Coin>> getAllCoins() {
		List<Coin> coins = coinService.getAllCoins();
		return new ResponseEntity<List<Coin>>(coins, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Coin> updateCoin(@PathVariable final Long id, @RequestBody final Coin coin) {
		Coin coinUpdated = coinService.updateCoin(id, coin);
		return new ResponseEntity<Coin>(coinUpdated, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteCoin(@PathVariable final Long id) {
		coinService.deleteCoin(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
