package nguyenduchung.ndh.mohinhmvp04092019;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginModel {
    private ResponseModel responseModel;
    public  LoginModel(ResponseModel responseModel){
        this.responseModel = responseModel;
    }
    String regexEmail= "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public void checkLogin(String user, String pass) {
        boolean  isEmail=Pattern.matches(regexEmail,user);
        if(user.length() <=0 && pass.length() <= 0){
            responseModel.parameterIsNull();
        }else if(!isEmail){
            responseModel.imCorrectEmail();
        }else{
            if(user.equals("hung@gmail.com") && pass.equals("123")){
                responseModel.loginSuccess();
            }else{
                responseModel.loginFail();
            }
        }

    }
}
