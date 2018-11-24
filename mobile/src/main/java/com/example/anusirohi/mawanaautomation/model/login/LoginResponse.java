package com.example.anusirohi.mawanaautomation.model.login;

import com.example.anusirohi.mawanaautomation.model.error.ErrorResponse;

public class LoginResponse {

    private LoginData loginData;
    private ErrorResponse errorResponse;
    private String status;

    public LoginData getLoginData() {
        return loginData;
    }

    public void setLoginData(LoginData loginData) {
        this.loginData = loginData;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
