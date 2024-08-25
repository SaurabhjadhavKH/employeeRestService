package com.employee.dto;

import java.util.List;
import java.util.Map;

public class AccountsContactInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

    public AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
        this.message = message;
        this.contactDetails = contactDetails;
        this.onCallSupport = onCallSupport;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Map<String, String> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<String> getOnCallSupport() {
        return onCallSupport;
    }

    public void setOnCallSupport(List<String> onCallSupport) {
        this.onCallSupport = onCallSupport;
    }
}
