package com.example.acs.config;

import com.azure.communication.callautomation.CallAutomationClient;
import com.azure.communication.callautomation.CallAutomationClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureConfig {

    @Bean
    public CallAutomationClient callAutomationClient() {
        return new CallAutomationClientBuilder()
                .connectionString("YOUR_ACS_CONNECTION_STRING")
                .buildClient();
    }
}
