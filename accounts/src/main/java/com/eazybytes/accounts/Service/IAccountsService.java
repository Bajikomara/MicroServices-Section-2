package com.eazybytes.accounts.Service;

import com.eazybytes.accounts.dto.CustomerDto;
import org.springframework.stereotype.Service;


public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
