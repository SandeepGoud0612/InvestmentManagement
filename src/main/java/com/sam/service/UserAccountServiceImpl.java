/**
 * UserAccountServiceImpl
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

import com.sam.dao.UserAccountDAO;
import com.sam.model.UserAccount;

/**
 * @author sandeep.
 *
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountDAO userAccountDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.UserAccountService#createUserAccount(com.sam.model.
	 * UserAccount)
	 */
	@Override
	public UserAccount createUserAccount(UserAccount userAccount) {
		return userAccountDAO.save(userAccount);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.UserAccountService#getUserAccountById(java.lang.Long)
	 */
	@Override
	public UserAccount getUserAccountById(Long id) {
		return userAccountDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.UserAccountService#getAllUserAccounts()
	 */
	@Override
	public List<UserAccount> getAllUserAccounts() {
		return userAccountDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.UserAccountService#updateUserAccount(java.lang.Long,
	 * com.sam.model.UserAccount)
	 */
	@Override
	public UserAccount updateUserAccount(Long id, UserAccount userAccount) {
		return userAccountDAO.save(userAccount);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.UserAccountService#deleteUserAccount(java.lang.Long)
	 */
	@Override
	public void deleteUserAccount(Long id) {
		userAccountDAO.delete(id);
	}

}
