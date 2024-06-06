package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.DBConnection;

public class LoginModel {
    private Connection con;
    private Statement stmt;

    public LoginModel() {
        con = DBConnection.connection();
    }

    public boolean validateLogin(String username, String password) {
        boolean isValid = false;
        try {
            stmt = con.createStatement();
            String query = "SELECT * FROM admin";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                if (username.equals(rs.getString(2)) && password.equals(rs.getString(3))) {
                    isValid = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return isValid;
    }
}
