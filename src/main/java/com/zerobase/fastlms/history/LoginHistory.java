package com.zerobase.fastlms.history;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LoginHistory {
    @Id
    private String userId;

    private LocalDateTime loginDt;
    private String accessIP;
    private String userAgent;
}
