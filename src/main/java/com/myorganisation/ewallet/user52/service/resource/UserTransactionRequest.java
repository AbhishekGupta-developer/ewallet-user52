package com.myorganisation.ewallet.user52.service.resource;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserTransactionRequest {

    private Long receiverId;
    private Double amount;
    private String description;
}
