
package controller;

import model.LoginModel;
import view.AllStudentsView;
import view.HomeView;
import view.LoginView;

public class HomeController {
    private HomeView view;

    public HomeController(HomeView view) {
        this.view = view;

        view.addLogoutListener(e -> logout());
        view.addStudentListener(e -> viewStudents());
    }

    private void logout() {
        view.setVisible(false);
        LoginModel loginModel = new LoginModel();
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginModel, loginView);
        loginController.showLogin();
    }

    private void viewStudents() {
    view.setVisible(false);
    AllStudentsView allStudentsView = new AllStudentsView();
    AllStudentsController allStudentsController = new AllStudentsController(allStudentsView);
    allStudentsController.showAllStudents();
}

    public void showHome() {
        view.setVisible(true);
    }
}
