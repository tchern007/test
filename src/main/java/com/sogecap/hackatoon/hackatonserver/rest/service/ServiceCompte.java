package com.sogecap.hackatoon.hackatonserver.rest.service;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sogecap.hackatoon.hackatonserver.rest.model.Account;
import com.sogecap.hackatoon.hackatonserver.rest.model.Accounts;
import com.sogecap.hackatoon.hackatonserver.rest.model.Login;
import com.sogecap.hackatoon.hackatonserver.rest.model.Transactions;
import com.sogecap.hackatoon.hackatonserver.rest.modelihm.CompteIhm;
import com.sogecap.hackatoon.hackatonserver.rest.modelihm.ComptesIhm;
import com.sogecap.hackatoon.hackatonserver.rest.session.InfoBanking;

@RestController
@EnableAutoConfiguration
public class ServiceCompte {


	
	@Autowired
	private ServiceLogin serviceLogin;
	

	@RequestMapping("/comptes")
	public ComptesIhm getMyAccount()
	{
		ComptesIhm comptesIhm = null;
        RestTemplate restTemplate = new RestTemplate();
        try 
        {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("Authorization", "DirectLogin token=\""+serviceLogin.getLoginTicket()+"\"");
            
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            
            String urlGet = InfoBanking.getInfos().getUrl()+"obp/v3.0.0/my/accounts";
            System.out.println("call : "+urlGet);
//            ResponseEntity<Account[]> response = restTemplate.exchange(urlGet, HttpMethod.GET, entity, Account[].class);
            ResponseEntity<String> response = restTemplate.exchange(urlGet, HttpMethod.GET, entity, String.class);
            
            System.out.println("");
//            if (!ArrayUtils.isEmpty(response.getBody()))
//            {
//            	comptesIhm = new ComptesIhm();
//            	
//            	for (Account account : response.getBody())
//            	{
//            		CompteIhm compteIhm = new CompteIhm();
//            		
//            		compteIhm.setId(account.getId());
//            		compteIhm.setLabel(account.getLabel());
//            		
//            	}
//            }
            

        }
        catch (Exception eek) {
        	eek.printStackTrace();
        }
        
        return comptesIhm;
	}
	
	@RequestMapping("/my/banks/{bank}/accounts/{account}/account")
	public Account getAccount(@PathVariable String bank,@PathVariable String account)
	{
        RestTemplate restTemplate = new RestTemplate();
        try 
        {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("Authorization", "DirectLogin token=\""+serviceLogin.getLoginTicket()+"\"");
            
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            
            String urlGet = InfoBanking.getInfos().getUrl()+"obp/v3.0.0/my/banks/"+bank+"/accounts/"+account+"/account";
            System.out.println("call : "+urlGet);
            ResponseEntity<Account> response = restTemplate.exchange(urlGet, HttpMethod.GET, entity, Account.class);
            
            
            return response.getBody();
        }
        catch (Exception eek) {
        	eek.printStackTrace();
        }
        
        return null;
	}
	
	@RequestMapping("/my/banks/{bank}/accounts/{account}/transactions")
	public Transactions getAllTransaction(@PathVariable String bank,@PathVariable String account)
	{
        RestTemplate restTemplate = new RestTemplate();
        try 
        {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("Authorization", "DirectLogin token=\""+serviceLogin.getLoginTicket()+"\"");
            
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            
            String urlGet = InfoBanking.getInfos().getUrl()+"obp/v3.0.0/my/banks/"+bank+"/accounts/"+account+"/transactions";
            System.out.println("call : "+urlGet);
            ResponseEntity<Transactions> response = restTemplate.exchange(urlGet, HttpMethod.GET, entity, Transactions.class);
            
            
            return response.getBody();
        }
        catch (Exception eek) {
        	eek.printStackTrace();
        }
        
        return null;
	}
	
}
