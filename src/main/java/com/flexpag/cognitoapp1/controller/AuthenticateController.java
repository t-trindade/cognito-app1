package com.flexpag.cognitoapp1.controller;

import com.flexpag.cognitoapp1.service.CallApp2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("hasAuthority('IT/INTERNAL')")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class AuthenticateController {

    private final CallApp2Service callApp2Service;

    @GetMapping("/autenticar")
    public String auth() {
        return "Sou App1 e estou autenticado!!";
    }

    @GetMapping("/autenticar/app2")
    public String callApp2(@RequestHeader("Authorization") String authorization) {
        return callApp2Service.authApp2(authorization);
    }

    @GetMapping("/nao-autenticar/app2")
    public String callApp2Admin(@RequestHeader("Authorization") String authorization) {
        return callApp2Service.authApp2Admin(authorization);
    }
}
