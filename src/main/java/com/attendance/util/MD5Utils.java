package com.attendance.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MD5Utils {
	
	private static Logger logger = LoggerFactory.getLogger(MD5Utils.class);

    private static MessageDigest md5Digest;

    private final static char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    static {
        try {
            md5Digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            logger.error("md5 算法错误", e);
        }
    }

    public static String md5(String s) {
        byte[] btInput = s.getBytes();
        md5Digest.update(btInput);
        byte[] md = md5Digest.digest();

        char str[] = new char[md.length * 2];
        int k = 0;
        for (byte b : md) {
            str[k++] = hexDigits[b >>> 4 & 0xf];
            str[k++] = hexDigits[b & 0xf];
        }
        return new String(str);
    }

}
