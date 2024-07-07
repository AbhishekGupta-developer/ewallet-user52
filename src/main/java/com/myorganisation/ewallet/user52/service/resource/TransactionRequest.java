package com.myorganisation.ewallet.user52.service.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private Long senderId;
    private Long receiverId;
    private Double amount;
    private String description;


}
