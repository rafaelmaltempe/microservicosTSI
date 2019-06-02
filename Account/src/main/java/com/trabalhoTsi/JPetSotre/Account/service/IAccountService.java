package com.trabalhoTsi.JPetSotre.Account.service;

import com.trabalhoTsi.JPetSotre.Account.domain.Account;

public interface IAccountService {

    Account getAccount(String username);

    Account getAccount(String username, String password);

    /**
     * Insert account.
     *
     * @param account
     *          the account
     */
    void insertAccount(Account account);

    /**
     * Update account.
     *
     * @param account
     *          the account
     */
    void updateAccount(Account account);

}