package org.example;

public class UserRegistration {
    private String username,password,email, phone_number;

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phone_number;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number=phone_number;
    }
}
