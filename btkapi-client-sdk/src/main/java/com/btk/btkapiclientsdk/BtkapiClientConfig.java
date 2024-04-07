package com.btk.btkapiclientsdk;

import com.btk.btkapiclientsdk.client.BtkApiClient;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
@ConfigurationProperties("btkapi.client")
@ComponentScan
public class BtkapiClientConfig {

    private String accessKey;

    private String secretKey;
    @Bean
    public BtkApiClient btkApiClient() {
        return new BtkApiClient(accessKey, secretKey);
    }


}
