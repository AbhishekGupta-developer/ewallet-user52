package com.myorganisation.ewallet.user52.service.resource;

import com.myorganisation.ewallet.user52.domain.User;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    public String userName;
    @Email(message = "Email is not valid")
    public String email;
    public String phoneNumber;
    public String password;

    public User toUser() {
        return User.builder().userName(userName).email(email).passwordHash(password).phoneNumber(phoneNumber).build();
    }

}
