package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;  

public class MD5 {
	//获得明文密码对应的32位加密密文string
	 public static String parseStrToMd5L32(String str){  
	        String reStr = null;  
	        try {  
	            MessageDigest md5 = MessageDigest.getInstance("MD5");  
	            byte[] bytes = md5.digest(str.getBytes());	        
	            StringBuffer stringBuffer = new StringBuffer();  
	            for (byte b : bytes){  
	                int bt = b&0xff;  
	                if (bt < 16){  
	                    stringBuffer.append(0);  
	                }   
	                stringBuffer.append(Integer.toHexString(bt));  
	            }  
	            reStr = stringBuffer.toString();  
	        } catch (NoSuchAlgorithmException e) {  
	            e.printStackTrace();  
	        }  
	        return reStr;  
	    }  
	 
}
