package com.system.test;

import java.security.Key;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class AesExample {

    public static final String ALGO = "AES";
    public byte[] keyValue;

    public AesExample(String key) {
        keyValue = key.getBytes();
    }

    public String encrypt(String Data) throws Exception {

        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);

        return encryptedValue;
    }

    public String decrypt(String encryptedData) throws Exception {

        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decorderValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decorderValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;

    }

    public Key generateKey() throws Exception {

        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
    }
    public static void main(String[] args) {
        AesExample ob = new AesExample("1v39ept1vuhaqqsr");
        try {
            String name = "Vageesh$#123";
            String encdata = ob.encrypt(name);
            System.out.println("encrypted Data : "+encdata);
            String decdata = ob.decrypt("OWleJKMd8iF5PVK5Vsxhmw==");
            System.out.println("plain text : "+decdata);
            
        } catch (Exception ex) {
            Logger.getLogger(AesExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
