package main.java.users;

import java.time.LocalDate;
import java.util.List;

public class Users {

    private String email;
    private LocalDate loginDate;
    private String team;

    public Users(String email, LocalDate loginDate, String team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
