/**
 * UserAccountController
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

import com.sam.model.UserAccount;
import com.sam.service.UserAccountService;

/**
 * @author sandeep.
 *
 */
@RestController
@RequestMapping(value = "/useraccounts")
public class UserAccountController {

	@Autowired
	private UserAccountService userAccountService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserAccount> createUserAccount(@RequestBody final UserAccount userAccount) {
		UserAccount newUserAccount = userAccountService.createUserAccount(userAccount);
		return new ResponseEntity<>(newUserAccount, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserAccount> getUserAccountById(@PathVariable final Long id) {
		UserAccount userAccount = userAccountService.getUserAccountById(id);
		return new ResponseEntity<>(userAccount, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UserAccount>> getAllUserAccounts() {
		List<UserAccount> userAccounts = userAccountService.getAllUserAccounts();
		return new ResponseEntity<List<UserAccount>>(userAccounts, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserAccount> updateUserAccount(@PathVariable final Long id,
			@RequestBody final UserAccount userAccount) {
		UserAccount userAccountUpdated = userAccountService.updateUserAccount(id, userAccount);
		return new ResponseEntity<UserAccount>(userAccountUpdated, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteUserAccount(@PathVariable final Long id) {
		userAccountService.deleteUserAccount(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
