package com.employee.rest;

import com.employee.dto.AccountsContactInfoDto;
import com.employee.service.IAccountService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountRestController {

    private IAccountService accountService;

    @Autowired
    public AccountRestController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/account")
    public ResponseEntity<AccountsContactInfoDto> getAccountSupportDetails(){
           AccountsContactInfoDto accountsContactInfoDto = accountService.fetchAccountsDetails();
           return ResponseEntity.status(HttpStatus.SC_OK).body(accountsContactInfoDto);

        }
}
