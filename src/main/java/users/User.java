package main.java.users;

import java.time.LocalDate;

class User {

    private String email;
    private LocalDate loginDate;
    private String department;

    User(String email, LocalDate loginDate, String department) {
        this.email = email;
        this.loginDate = loginDate;
        this.department = department;
    }

    String getEmail() {
        return email;
    }

    LocalDate getLoginDate() {
        return loginDate;
    }

    String getDepartment() {
        return department;
    }
}
