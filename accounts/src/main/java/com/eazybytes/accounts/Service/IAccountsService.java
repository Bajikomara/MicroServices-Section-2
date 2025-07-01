package com.eazybytes.accounts.Service;

import com.eazybytes.accounts.dto.CustomerDto;
import org.springframework.stereotype.Service;


public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccountDetails(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);

}
