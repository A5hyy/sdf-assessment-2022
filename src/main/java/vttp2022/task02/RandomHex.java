package vttp2022.task02;

import java.io.*;
import java.util.Random; 
  
class GFG {
    public static void main(String[] args)
    {
          // Random instance
        Random r = new Random();
        int n = r.nextInt();
        
        // n stores the random integer in defcimal form
        String Hexadecimal = Integer.toHexString(n);
        
        // toHexString(n) converts n to hexadecimal form
        System.out.println("Random Hexadecimal Byte: "
                           + Hexadecimal);
    }
}