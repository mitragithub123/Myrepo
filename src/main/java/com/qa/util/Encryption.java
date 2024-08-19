package com.qa.util;

import org.apache.hc.client5.http.utils.Base64;

public class Encryption {

    public static String encryptPassword(String password) {
        byte[] encodedBytes = Base64.encodeBase64(password.getBytes());
        return new String(encodedBytes);
    }

    public static void main(String[] args) {
        String str = "123";

        String encodedString = encryptPassword(str);
        System.out.println("Encoded string is: " + encodedString);

        byte[] decodedString = Base64.decodeBase64(encodedString.getBytes());
        System.out.println("Decoded string is: " + new String(decodedString));
    }

}
