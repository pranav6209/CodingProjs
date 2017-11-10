package com.pranav.javat.string;

public class SwapWithoutTemp13 {  
    public static void main(String args[]) {  
        String a = "Pranav";  
        String b = "Patel";  
        System.out.println("Before swap: " + a + " " + b);  
        
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
}  