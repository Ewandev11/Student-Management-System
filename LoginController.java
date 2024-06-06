package controller;
import model.LoginModel;
import model.StudentModel;
import view.HomeView;
import view.LoginView;

public class LoginController {
    private LoginModel model;
    private LoginView view;

    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;

        view.addLoginListener(e -> login());
        view.addCancelListener(e -> cancel());
    }

    public LoginController(StudentModel model, LoginView loginView) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void login() {
        String username = view.getUsername();
        String password = view.getPassword();

        if (model.validateLogin(username, password)) {
            view.setVisible(false);
            HomeView homeView = new HomeView();
            HomeController homeController = new HomeController(homeView);
            homeController.showHome();
        } else {
            view.setErrorMsg("Incorrect USERNAME or PASSWORD");
        }
    }

    private void cancel() {
        System.exit(0);
    }

    public void showLogin() {
        view.setVisible(true);
    }
}
