package main.java.users;

import java.time.LocalDate;

public class User {

    private String email;
    private LocalDate loginDate;
    private String department;

    public User(String email, LocalDate loginDate, String department) {
        this.email = email;
        this.loginDate = loginDate;
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
