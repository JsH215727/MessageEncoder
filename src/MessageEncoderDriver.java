
import java.util.Scanner;

public class MessageEncoderDriver {
    public static void main (String[]args){
       Scanner input = new Scanner (System.in);
        System.out.println("Please enter the message to be encoded");
        String test = input.next();
        String test2= test;
        ShuffleCipher shuffle = new ShuffleCipher(1);
        test=shuffle.encode(test);
        shuffle.decode(test);
        
        SubstitutionCipher sub = new SubstitutionCipher(2);
        sub.encode(test2);
        sub.decode(test2);
        
      
       
    }
}
