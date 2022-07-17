package com.zerobase.fastlms.history.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class LoginHistory {
    @Id
    private Long id;

    private String userId;
    private LocalDateTime loginDt;
    private String accessIp;
    private String userAgent;
}
