package com.pranav.javat.string;

public class RemoveAllSpace11 {  
    public static void main(String[] args) {  
        String str = "India     Is My    Country";  
        //1st way  // using built in method  
        String noSpaceStr = str.replaceAll("\\s", ""); 
        System.out.println(noSpaceStr);  
        //2nd way  
        char[] strArray = str.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') ){  
                stringBuffer.append(strArray[i]);  
            }  
        }  
        String noSpaceStr2 = stringBuffer.toString();  
        System.out.println(noSpaceStr2);  
    }  
}  
