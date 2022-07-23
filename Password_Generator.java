import java.util.*;

public class Password_Generator{
    public static void main(String[] args){
        int length = 10;
        System.out.println(password(length));
    }


    static char[] password(int len){
        System.out.println("Generating password using random(): ");
        System.out.println("Your new password is : ");
        String capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbols="!@#$%^&*_=+-/.?<>)";

        String values = capital_chars+small_chars+numbers+symbols;

        //Using Random method
        Random rndm= new Random();

        char[] new_password = new char[len];
        for(int i=0;i<len;i++){
            new_password[i]=values.charAt(rndm.nextInt(values.length()));
        }
        return new_password;
    }
}