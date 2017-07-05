package com.sogecap.hackatoon.hackatonserver.rest.session;

public class InfoBanking {

	
	public final static Session getInfos()
	{
		
		Session session = new Session();
		session.setBanque("socgen.31.fr.fr");
		session.setMasterKey("t3tkc1hnkl3fc5vqo1y5wga0gwb0mgmwe1m52fuz");
		session.setPass("Tooto!1245MMM");
		session.setUrl("https://socgen-p-api.openbankproject.com/");
		session.setUserId("51bd3941-09f0-436b-83e0-c73cefe9a5ac");
		session.setUserName("bilno");
		//open Banking
//		String[] infoconnexion = {"https://apisandbox.openbankproject.com/","toto","OpenBank!0","x15jn4szqaitjc3yz3ukdjg4dkjo54p05rwdu0cg"};

		//Hackaton SG
//		String[] infoconnexion = {"https://socgen-k-api.openbankproject.com/","toto","OpenBank!0","ml3uy5gfodrrcigkalvaujinwwemjl1yhifwd0ue"};
		
			
		return session;
			
	}
	
}
