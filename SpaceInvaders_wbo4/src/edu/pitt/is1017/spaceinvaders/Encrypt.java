package edu.pitt.is1017.spaceinvaders;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	public Encrypt(){
		
	}
	public String encryptSHA256(String pass) throws NoSuchAlgorithmException{
			
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(pass.getBytes());
			byte byteData[] = md.digest();
			StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        System.out.println("Hex format : " + sb.toString());						
		
		return sb.toString(); 
	}
}
