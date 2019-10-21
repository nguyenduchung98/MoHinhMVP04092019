package nguyenduchung.ndh.mohinhmvp04092019;

public class MainPresenter {

    private LoginModel loginModel;

    public MainPresenter() {
        this.loginModel = new LoginModel();
    }

    public void validateLogin(String user, String pass) {
        loginModel.checkLogin(user,pass);

    }
}
