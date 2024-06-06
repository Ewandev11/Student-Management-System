package controller;

import java.sql.ResultSet;
import model.StudentModel;
import view.AllStudentsView;
import net.proteanit.sql.DbUtils;
import view.HomeView;
import view.StudentView;

public class AllStudentsController {
    private StudentModel model;
    private AllStudentsView view;

    public AllStudentsController(StudentModel model, AllStudentsView view) {
        this.model = model;
        this.view = view;
        initController();
        updateTable();
    }

    public AllStudentsController(AllStudentsView view) {
        this.model = new StudentModel(); // Ensure model is initialized
        this.view = view;
        initController();
        updateTable();
    }

    private void initController() {
        view.addGradeActionListener(e -> updateTable()); //Lambda 
        view.addMainMenuButtonListener(e -> goToMainMenu());
        view.addEditorAddButtonListener(e -> goToEditorAdd());
    }

    private void updateTable() {
        try {
            ResultSet rs;
            if ("All".equals(view.getSelectedGrade())) {
                rs = model.getAllStudents();
            } else {
                rs = model.getStudentsByGrade(view.getSelectedGrade());
            }
            view.setTableModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void goToMainMenu() {
        view.setVisible(false);
        HomeView homeView = new HomeView();
        HomeController homeController = new HomeController(homeView);
        homeController.showHome();
    }

    private void goToEditorAdd() {
        view.setVisible(false);
        StudentView studentView = new StudentView();
        StudentModel studentModel = new StudentModel();
        StudentController studentController = new StudentController(studentModel, studentView);
        studentController.showStudent();
    }

    public void showAllStudents() {
        view.setVisible(true);
    }
}
