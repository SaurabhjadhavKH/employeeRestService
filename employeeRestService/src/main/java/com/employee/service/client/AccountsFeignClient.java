package com.employee.service.client;

import com.employee.dto.AccountsContactInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("accounts")
public interface AccountsFeignClient {

    @GetMapping("/api/contact-info")
    public ResponseEntity<AccountsContactInfoDto> getContactInfo();
}
