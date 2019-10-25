package com.bytatech.ayoos.client;

import java.io.IOException;

import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import com.bytatech.ayoos.security.oauth2.AuthorizationHeaderUtil;
@Configuration
public class OAuth2InterceptedFeignConfiguration {

    @Bean(name = "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) throws IOException {
        return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
    }
}
