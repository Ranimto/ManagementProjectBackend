package com.ordering.procurementFlow.authentication;

import com.ordering.procurementFlow.Models.Role;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AuthenticationRequest {
    private String email;
    private String password;
    private Role role;
}
