package com.helper;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HMACUtils {
	
	public static String hmacWithJava(String data, String key)
			  throws NoSuchAlgorithmException, InvalidKeyException {
			    SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "HmacSHA256");
			    Mac mac = Mac.getInstance("HmacSHA256");
			    mac.init(secretKeySpec);
			    return bytesToHex(mac.doFinal(data.getBytes()));
			}
	
	public static String bytesToHex(byte[] byteArray)
    {
        String hex = "";
        for (byte i : byteArray) {
            hex += String.format("%02X", i);
        }
        return hex;
    }

}
