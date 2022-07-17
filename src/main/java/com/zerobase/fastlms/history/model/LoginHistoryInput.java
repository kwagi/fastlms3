package com.zerobase.fastlms.history.model;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Data
public class LoginHistoryInput {

    private String userId;
    private LocalDateTime loginDt;
    private String accessIp;
    private String userAgent;
}
