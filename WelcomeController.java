package controller;

import model.LoginModel;
import view.WelcomeView;
import model.ProgressModel;
import view.LoginView;

public class WelcomeController {
    private ProgressModel model;
    private WelcomeView view;

    public WelcomeController(ProgressModel model, WelcomeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateProgress() {
        view.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                model.setProgress(i);
                view.setProgressValue(model.getProgress());
            }
            view.setVisible(false);
           
            LoginView loginView = new LoginView();
            LoginModel loginModel = new LoginModel();
            LoginController loginController = new LoginController(loginModel, loginView);
            loginController.showLogin();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
