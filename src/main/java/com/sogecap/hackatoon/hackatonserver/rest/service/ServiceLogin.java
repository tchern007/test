package com.sogecap.hackatoon.hackatonserver.rest.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sogecap.hackatoon.hackatonserver.rest.model.Login;
import com.sogecap.hackatoon.hackatonserver.rest.session.InfoBanking;

public class ServiceLogin {

	public String getLoginTicket()
	{
        RestTemplate restTemplate = new RestTemplate();
        try 
        {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("Authorization", "DirectLogin username=\""+InfoBanking.getInfos().getUserName()+"\", password=\""+InfoBanking.getInfos().getPass()+"\", consumer_key=\""+InfoBanking.getInfos().getMasterKey()+"\"");
            
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            ResponseEntity<Login> response = restTemplate.exchange(InfoBanking.getInfos().getUrl()+"my/logins/direct", HttpMethod.GET, entity, Login.class);
            System.out.println("token : "+response.getBody().getToken());
            return response.getBody().getToken();
        }
        catch (Exception eek) {
        	eek.printStackTrace();
        }
        
        return null;
	}


}
