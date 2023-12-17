package com.prince.service;

import com.prince.model.Account;

public interface AccountService {
    Account createAccount(Account account);
    Account getLoggedInUser();
}
