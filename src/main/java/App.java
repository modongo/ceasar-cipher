import java.io.Console;
import java.lang.Character;

public class App {
    public static void main(String[] args) {
        Console mSc = System.console();

        //Section for User entry for encode
        System.out.println("Enter a Plaintext you want to encrypt: ");
        String plaintext = mSc.readLine();

        System.out.println("Enter encrypted key: ");
        String mKey = mSc.readLine();
        Integer key = Integer.parseInt(mKey);

        /** Encode Section.  **/
        //Create the encode object
        Encoding encode = new Encoding(plaintext,key);
        //Set the plaintext & key from user
        encode.setPlaintext(plaintext);
        encode.setKey(key);
        encode.doEncode();
        //display the crypt

        if(encode.getCrypt().equals(plaintext)){
            System.out.println(" No Encryption done: " +encode.getCrypt());
        }else{
            System.out.println(" The Crypt is: " +encode.getCrypt());
        }


        /**Section for User entry for decode**/
        System.out.println("Enter an encrypted message you want to decrypt: ");
        String ciphertext  = mSc.readLine();

        System.out.println("Enter decryption key: ");
        mKey = mSc.readLine();
        key = Integer.parseInt(mKey);

        Decoding decode = new Decoding(ciphertext,key);
        decode.setCodedText(ciphertext);
        decode.setKey(key);
        decode.doDecode(ciphertext,key);
        if(decode.getmDecrypted_Message().equals(ciphertext)){
            System.out.println("Your message was never encrypted. ");
        }else {
            System.out.println("The original Message was: " + decode.getmDecrypted_Message());
        }

    }
}
