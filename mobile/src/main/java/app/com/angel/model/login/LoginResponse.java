package app.com.angel.model.login;

import app.com.angel.model.error.ErrorResponse;

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
