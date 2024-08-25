package com.employee.service;

import com.employee.dto.AccountsContactInfoDto;
import com.employee.service.client.AccountsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImpl implements IAccountService{

    private AccountsFeignClient accountsFeignClient ;

    @Autowired
    public AccountsServiceImpl(AccountsFeignClient accountsFeignClient) {
        this.accountsFeignClient = accountsFeignClient;
    }

    @Override
    public AccountsContactInfoDto fetchAccountsDetails() {

       return accountsFeignClient.getContactInfo().getBody();

    }
}
