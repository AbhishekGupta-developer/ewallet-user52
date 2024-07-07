package com.myorganisation.ewallet.user52.service.resource;

import com.myorganisation.ewallet.user52.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {

    private String userName;
    private String email;
    private String phoneNumber;
    private String balance;

    public void setUser(User user) {
        this.userName = user.getUserName();
        this.email = user.getEmail();
        this.phoneNumber = user.getPhoneNumber();

    }

}
