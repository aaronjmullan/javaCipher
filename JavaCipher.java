package javacipher;

import java.util.Scanner;
/**
 * @author Aaron Mullan
 * email: aaron.mullan213@gmail.com
 * github: github.com/aaronjmullan
 */
public class JavaCipher {
    
    public static void main(String[] args) {
       
        // declared a scanner that asks the user for a string and a number
        // then calls the method Cipher and passes the string and the number
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the string of text to be encrypted");
        String textEncrypt = getInput.nextLine();
        System.out.println("Enter the number to encrypt the text by");
        int numEncrypt = getInput.nextInt();
        getInput.close();
          
        Cipher(textEncrypt, numEncrypt);
    }
    public static void Cipher(String textEncrypt, int numEncrypt) {

        // method that is passed parameter that are given in the main method
        // this method will shift the string of text that is entered by the number the user enters
        // if the number is greater than 26 it will look back round
        String Encryptedtext = "";
        int textEncryptLen = textEncrypt.length();
        
        for (int i = 0; i < textEncryptLen ; i++) {
            char charEncrypt = (char)(textEncrypt.charAt(i) + numEncrypt);
            if (charEncrypt > 'z') {
                Encryptedtext += (char)(textEncrypt.charAt(i) - (26-numEncrypt));
            } else {
                Encryptedtext += (char)(textEncrypt.charAt(i) + numEncrypt);
            }
        }
        System.out.println(Encryptedtext);
    }
}
