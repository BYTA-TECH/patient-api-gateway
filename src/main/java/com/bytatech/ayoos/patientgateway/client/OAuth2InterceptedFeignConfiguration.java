package com.bytatech.ayoos.patientgateway.client;

import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;import org.springframework.context.annotation.Configuration;

import com.bytatech.ayoos.patientgateway.security.oauth2.AuthorizationHeaderUtil;

@Configuration
public class OAuth2InterceptedFeignConfiguration {

    @Bean(name = "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) {
        return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
    }
}
