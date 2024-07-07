package com.myorganisation.ewallet.user52.service.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletResponse {

    private String userId;
    private String balance;
    private String type;
    private LocalDateTime lastUpdated;
}
