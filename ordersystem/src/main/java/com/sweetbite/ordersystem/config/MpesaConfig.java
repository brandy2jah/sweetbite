package com.sweetbite.ordersystem.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mpesa")
public class MpesaConfig {
    private String apiKey;
    private String apiSecret;

    // Getters and Setters
    public String getApiKey() {
        return apiKey;
    }
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    public String getApiSecret() {
        return apiSecret;
    }
    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }
}


