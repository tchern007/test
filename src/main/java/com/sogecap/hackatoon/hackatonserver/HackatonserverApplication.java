package com.sogecap.hackatoon.hackatonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sogecap.hackatoon.hackatonserver.rest.service.ServiceLogin;
import com.sogecap.hackatoon.hackatonserver.rest.session.InfoBanking;

@SpringBootApplication
public class HackatonserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackatonserverApplication.class, args);
	}
	
    @Bean
    public ServiceLogin serviceLogin() {
        return new ServiceLogin();
    }
    
    @Bean
    public InfoBanking session() {
        return new InfoBanking();
    }
	
	
}
