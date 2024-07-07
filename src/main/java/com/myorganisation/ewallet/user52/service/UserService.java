package com.myorganisation.ewallet.user52.service;

import com.myorganisation.ewallet.user52.service.resource.UserRequest;
import com.myorganisation.ewallet.user52.service.resource.UserResponse;
import com.myorganisation.ewallet.user52.service.resource.UserTransactionRequest;

public interface UserService {

    public void addUser(UserRequest userRequest);
    public UserResponse getUser(String userId);
    public void deleteUser(String userId);
    public UserResponse updateUser(UserRequest userRequest, String userId);
    public void performTransaction(UserTransactionRequest userTransactionRequest, String userId);
    public void updateBalance(UserTransactionRequest userTransactionRequest, String userId);
}
