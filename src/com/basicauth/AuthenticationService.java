package com.basicauth;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.xml.bind.DatatypeConverter;

public class AuthenticationService {
	
	public boolean authenticate (String authCredentials) {
		boolean authenticationStatus = false;
		if (null == authCredentials) {
			return authenticationStatus;
		}
		final String encodedUserPassword = authCredentials.replaceFirst("Basic"+ " ", "");	
		String usernameAndPassword = null;
		try {
			byte[] decodedBytes = DatatypeConverter.parseBase64Binary(encodedUserPassword);
			usernameAndPassword = new String(decodedBytes, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}		
		final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();
		
		// we have used fixed the userid and password. call some UserService/LDAP here
		authenticationStatus = "sampleuser".equals(username) && "samplepassword".equals(password);		
		
		return authenticationStatus;
	}

}
