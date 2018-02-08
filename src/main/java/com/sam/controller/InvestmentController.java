/**
 * InvestmentController
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

import com.sam.model.Investment;
import com.sam.service.InvestmentService;

/**
 * @author sandeep.
 *
 */
@RestController
@RequestMapping(value="/investments")
public class InvestmentController {
	
	@Autowired
	private InvestmentService investmentService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Investment> createInvestment(@RequestBody final Investment investment) {
		Investment newInvestment = investmentService.createInvestment(investment);
		return new ResponseEntity<>(newInvestment, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Investment> getInvestmentById(@PathVariable final Long id) {
		Investment investment = investmentService.getInvestmentById(id);
		return new ResponseEntity<>(investment, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Investment>> getAllInvestments() {
		List<Investment> investments = investmentService.getAllInvestments();
		return new ResponseEntity<List<Investment>>(investments, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Investment> updateInvestment(@PathVariable final Long id,
			@RequestBody final Investment investment) {
		Investment investmentUpdated = investmentService.updateInvestment(id, investment);
		return new ResponseEntity<Investment>(investmentUpdated, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteInvestment(@PathVariable final Long id) {
		investmentService.deleteInvestment(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}


}
