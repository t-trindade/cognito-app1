package com.flexpag.cognitoapp1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class CallApp2Service {
    private final RestTemplate restTemplate;

    public String authApp2(String authorization) {
        var header = new HttpHeaders();
        header.set("Authorization", authorization);
        var entity = new HttpEntity<>(null, header);

        var response = restTemplate.exchange("http://localhost:8080/app2/api/conectar", HttpMethod.GET, entity, String.class);

        return response.getBody().replace("!!", "") .concat(" com o token do app1!!");
    }

    public String authApp2Admin(String authorization) {
        var header = new HttpHeaders();
        header.set("Authorization", authorization);
        var entity = new HttpEntity<>(null, header);

        var response = restTemplate.exchange("http://localhost:8080/app2/api/support/admin", HttpMethod.GET, entity, String.class);

        return response.getBody();
    }
}
