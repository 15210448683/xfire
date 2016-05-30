package com.moon.xfire.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.xfire.client.Client;

public class MathServiceClient {
	/**
     * @param args
     * @throws Exception 
     * @throws MalformedURLException 
     */
    public static void main(String[] args) throws MalformedURLException, Exception {
        Client client = new Client(new URL("http://localhost:8080/xfireDemo/services/MathService?wsdl"));
        Object[] result = client.invoke("add",new Object[]{2,3});
        System.out.println(result[0]);		
    
    }
}
