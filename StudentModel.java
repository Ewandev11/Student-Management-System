package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentModel {
    private Connection con;

    public StudentModel() {
        con = DBConnection.connection();
    }

    public ResultSet getAllStudents() throws SQLException {
        String query = "SELECT * FROM student";
        PreparedStatement stmt = con.prepareStatement(query);
        return stmt.executeQuery();
    }

    public ResultSet getStudentsByGrade(String grade) throws SQLException {
        String query = "SELECT * FROM student WHERE grade = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, grade);
        return stmt.executeQuery();
    }

    public void addStudent(int id, String name, String gender, int age, String address, String grade, String guardian, int contact, Date birthday, Date admission) {
        try {
            String query = "INSERT INTO student (id, name, gender, age, address, grade, guardian, contact, birthday, admissionDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, gender);
            stmt.setInt(4, age);
            stmt.setString(5, address);

            
            int MAX_GRADE_LENGTH = 255; 
            if (grade.length() > MAX_GRADE_LENGTH) {
                grade = grade.substring(0, MAX_GRADE_LENGTH);
            }
            stmt.setString(6, grade);

            stmt.setString(7, guardian);
            stmt.setInt(8, contact);
            stmt.setDate(9, birthday);
            stmt.setDate(10, admission);

            stmt.execute();
            con.commit();
        } catch (SQLException e) {
            // Handle the data truncation exception
            System.err.println("Data truncation: " + e.getMessage());
            
        }
    }

    public ResultSet searchStudent(int id) throws SQLException {
        String query = "SELECT * FROM student WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, id);
        return stmt.executeQuery();
    }

    public void updateStudent(int id, String name, String address, String grade, int age, Date birthday, String gender, Date admission, String guardian, int contact) throws SQLException {
        String query = "UPDATE student SET name = ?, gender = ?, age = ?, address = ?, grade = ?, guardian = ?, contact = ?, birthday = ?, admissionDate = ? WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, gender);
        stmt.setInt(3, age);
        stmt.setString(4, address);
        stmt.setString(5, grade);
        stmt.setString(6, guardian);
        stmt.setInt(7, contact);
        stmt.setDate(8, birthday);
        stmt.setDate(9, admission);
        
        stmt.setInt(10, id);
        stmt.executeUpdate();
        con.commit();
    }

    public void deleteStudent(int id) throws SQLException {
        String query = "DELETE FROM student WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        con.commit();
    }
}
