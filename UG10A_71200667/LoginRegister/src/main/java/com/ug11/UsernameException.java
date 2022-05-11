package com.ug11;

public class UsernameException extends Exception{
    private int errCode;
    private String errMessage;
    public UsernameException(int errCode){
        super();
        this.errCode = errCode;
        if(errCode == 1){
            this.errMessage = "Input username tidak boleh kosong!";
        }
        else if(errCode == 2){
            this.errMessage = "Username minimal terdiri dari 6 karakter!";
        }
    }
    public UsernameException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode() {
        return this.errCode;
    }
    public String getErrorMessage(){
        return this.errMessage;
    }
}
