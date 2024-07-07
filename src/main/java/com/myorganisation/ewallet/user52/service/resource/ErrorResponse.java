package com.myorganisation.ewallet.user52.service.resource;

import lombok.Data;

import java.util.Map;

@Data
public class ErrorResponse {
    Map<String, String> error;
}
