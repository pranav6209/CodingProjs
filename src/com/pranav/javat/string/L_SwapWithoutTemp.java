package com.pranav.javat.string;

public class L_SwapWithoutTemp {  
    public static void main(String args[]) {  
        String a = "Pranav";  
        String b = "Patel";  
        		
        System.out.println("Strings Before swap: " + a + " " + b);  
        
        a = a + b;  
        // consider here length of a after a+b
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("Strings After : " + a + " " + b);  
        
        /*
         * Swap to int
         * http://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/
         * 
         */
        
        int c=20;
        int d=40;
        
        c=c+d; //c=60
        
        d=c-d;//d=60-40=20
        c=c-d;//c=60-20=40
        
        System.out.println("Int After Swap  c:"+c +"  d:"+d);
        
    }  
}  