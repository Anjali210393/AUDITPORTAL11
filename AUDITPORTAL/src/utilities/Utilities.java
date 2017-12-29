package utilities;

import java.util.Random;

public class Utilities 
{
      public static String genPassword()
      {
    	  //System.out.println("Generating password using random() : ");
          
   
          int len=8;        
          String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          String Small_chars = "abcdefghijklmnopqrstuvwxyz";
          String numbers = "0123456789";
          String symbols = "!@#$%^&*_=+-/.?<>)";
   
   
          String values = Capital_chars + Small_chars +
                          numbers + symbols;
   
          // Using random method
          Random rndm_method = new Random();
   
          char[] pass = new char[len];
   
          for (int i = 0; i < len; i++)
          {
              pass[i] =
                values.charAt(rndm_method.nextInt(values.length()));
   
          }
          String password=new String(pass);
          System.out.print("Your new password is : "+password);
          return password;
      }
}
