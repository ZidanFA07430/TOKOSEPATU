package Controller;
import View.LoginPage;

public class LoginController {
    int id;
    int password;

    public LoginController(){
        id = 1234;
        password = 5678;
    }

    public void loginadmin(int id1, int pw){

        if (id1 == id && pw == password) {
            System.out.println("BERHASIl");
        } else {
            System.out.println("GAGAL");
            LoginPage lgn = new LoginPage();
            lgn.login();
        }
    }
}
