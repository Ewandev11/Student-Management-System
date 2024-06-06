package controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.StudentModel;
import view.HomeView;
import view.StudentView;

public class StudentController {

    private StudentModel model;
    private StudentView view;
    private HomeView homeView;
    
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
        this.view.submit.addActionListener(new SubmitListener());
        this.view.search.addActionListener(new SearchListener());
        this.view.update.addActionListener(new UpdateListener());
        this.view.delete.addActionListener(new DeleteListener());
        this.view.newStudent.addActionListener(new NewStudentListener());
        view.addMainMenuButtonListener(e -> goToMainMenu());
    }

    void showStudent() {
        view.setVisible(true);
    }
    
    private void goToMainMenu() {
        view.setVisible(false);
        HomeView homeView = new HomeView();
        HomeController homeController = new HomeController(homeView);
        homeController.showHome();
    }

    class SearchListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int id = Integer.parseInt(view.id.getText());
                ResultSet rs = model.searchStudent(id);
                if (rs.next()) {
                    view.name.setText(rs.getString("name"));
                    view.address.setText(rs.getString("address"));
                    view.grade.setSelectedItem(rs.getString("grade"));
                    view.age.setText(String.valueOf(rs.getInt("age")));
                    view.birthday.setText(rs.getDate("birthday").toString());
                    view.gender.setSelectedItem(rs.getString("gender"));
                    view.admission.setText(rs.getDate("admissionDate").toString());
                    view.guardian.setText(rs.getString("guardian"));
                    view.contact.setText(String.valueOf(rs.getInt("contact")));
                } else {
                    JOptionPane.showMessageDialog(null, "Student not found!");
                }
            } catch (HeadlessException | NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }

    class UpdateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int id = Integer.parseInt(view.id.getText());
                String name = view.name.getText();
                String address = view.address.getText();
                String grade = view.grade.getSelectedItem().toString();
                int age = Integer.parseInt(view.age.getText());
                Date birthday = Date.valueOf(view.birthday.getText());
                String gender = view.gender.getSelectedItem().toString();
                Date admission = Date.valueOf(view.admission.getText());
                String guardian = view.guardian.getText();
                int contact = Integer.parseInt(view.contact.getText());

                model.updateStudent(id, name, address, grade, age, birthday, gender, admission, guardian, contact);
                JOptionPane.showMessageDialog(null, "Student updated successfully!");
            } catch (HeadlessException | NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }

    class DeleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int id = Integer.parseInt(view.id.getText());
                model.deleteStudent(id);
                JOptionPane.showMessageDialog(null, "Student deleted successfully!");
            } catch (HeadlessException | NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }

    class NewStudentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.id.setText("");
            view.name.setText("");
            view.address.setText("");
            view.grade.setSelectedItem("");
            view.age.setText("");
            view.birthday.setText("");
            view.gender.setSelectedItem("");
            view.admission.setText("");
            view.guardian.setText("");
            view.contact.setText("");
        }
    }
    
    class SubmitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int id = Integer.parseInt(view.id.getText());
                String name = view.name.getText();
                String address = view.address.getText();
                String grade = view.grade.getSelectedItem().toString();
                int age = Integer.parseInt(view.age.getText());
                Date birthday = Date.valueOf(view.birthday.getText());
                String gender = view.gender.getSelectedItem().toString();
                Date admission = Date.valueOf(view.admission.getText());
                String guardian = view.guardian.getText();
                int contact = Integer.parseInt(view.contact.getText());

                model.addStudent(id, name, gender, age, address, grade, guardian, contact, birthday, admission);
                JOptionPane.showMessageDialog(null, "Student added successfully!");
            } catch (NumberFormatException | HeadlessException  ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }
   
}
