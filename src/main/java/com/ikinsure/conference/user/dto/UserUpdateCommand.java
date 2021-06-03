package com.ikinsure.conference.user.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * DTO class
 */
public class UserUpdateCommand {

    @NotNull(message = "Login cannot be empty")
    @NotEmpty(message = "Login cannot be empty")
    @Email(message = "Your email is not valid")
    private String email;

    @NotNull(message = "Login cannot be empty")
    @NotEmpty(message = "Login cannot be empty")
    @Size(min = 5, max = 32, message = "Your login is not valid")
    private String login;

    public UserUpdateCommand() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "UserCreateCommand{" +
                "email='" + email + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
