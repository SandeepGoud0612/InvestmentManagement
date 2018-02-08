/**
 * UserAccountService
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.service;

import java.util.List;

import com.sam.model.UserAccount;

/**
 * @author sandeep.
 *
 */
public interface UserAccountService {

	UserAccount createUserAccount(final UserAccount userAccount);

	UserAccount getUserAccountById(final Long id);

	List<UserAccount> getAllUserAccounts();

	UserAccount updateUserAccount(final Long id, final UserAccount userAccount);

	void deleteUserAccount(final Long id);

}
