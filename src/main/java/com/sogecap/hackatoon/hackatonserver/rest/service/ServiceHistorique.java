package com.sogecap.hackatoon.hackatonserver.rest.service;

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
import com.sogecap.hackatoon.hackatonserver.rest.model.Transaction;
import com.sogecap.hackatoon.hackatonserver.rest.model.Transactions;
import com.sogecap.hackatoon.hackatonserver.rest.modelihm.HistoriqueIhm;
import com.sogecap.hackatoon.hackatonserver.rest.modelihm.TransactionIhm;
import com.sogecap.hackatoon.hackatonserver.rest.session.InfoBanking;

@RestController
@EnableAutoConfiguration
public class ServiceHistorique {

	
	@Autowired
	private ServiceLogin serviceLogin;
	

	@RequestMapping("/historique/{compte}")
	public HistoriqueIhm getTransactionParCompte(@PathVariable String compte)
	{
		HistoriqueIhm hitorique = null;
        RestTemplate restTemplate = new RestTemplate();
        try 
        {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("Authorization", "DirectLogin token=\""+serviceLogin.getLoginTicket()+"\"");
            
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            
            String urlGet = InfoBanking.getInfos().getUrl()+"obp/v3.0.0/my/banks/"+InfoBanking.getInfos().getBanque()+"/accounts/"+compte+"/transactions";
            System.out.println("call : "+urlGet);
            ResponseEntity<Transactions> response = restTemplate.exchange(urlGet, HttpMethod.GET, entity, Transactions.class);
            
            if (!CollectionUtils.isEmpty(response.getBody().getTransactions()))
            {
            	hitorique = new HistoriqueIhm();
            	
            	for (int i=0;i<response.getBody().getTransactions().size();i++)
            	{
            		Transaction transaction = response.getBody().getTransactions().get(i);
            		
            		if (i==0)
            		{
            			hitorique.setAvoirActuel(transaction.getDetails().getNew_balance().getAmount());
            		}
            		
            		TransactionIhm trans = new TransactionIhm();
            		trans.setMontant(transaction.getDetails().getValue().getAmount());

            		hitorique.getTransactions().add(trans);
            	}
            }

        }
        catch (Exception eek) {
        	eek.printStackTrace();
        }
        
        return hitorique;
	}
	
	
	
}
