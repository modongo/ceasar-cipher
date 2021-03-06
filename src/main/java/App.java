import java.io.Console;

public class App {
    public static void main(String[] args) {
        boolean runner = true;
        Console mSc = System.console();
        while(runner) {
            int key;
            try {
                //Section for User entry for encode
                    System.out.println("                                       ");
                   System.out.println("                                       ");
                    System.out.println("<<<< Enter a Plaintext message you want to encrypt: >>>>  ");
                    String plaintext = mSc.readLine();

               do {
                   System.out.println("                                       ");
                   System.out.println("<<<<  Enter encryption key: >>>>>  ");
                   String mKey = mSc.readLine();
                   key = Integer.parseInt(mKey);
               } while ( key < 0 || key > 25);




                /** Encode Section.  **/
                //Create the encode object
                Encoding encode = new Encoding(plaintext, key);
                //Set the plaintext & key from user
                encode.setPlaintext(plaintext);
                encode.setKey(key);
                encode.doEncode();
                //display the crypt

                if (encode.getCrypt().equals(plaintext)) {
                    System.out.println("                                       ");
                    System.out.println("<<<    No Encryption done:   >>>  " + encode.getCrypt());
                    System.out.println("                                       ");
                } else {
                    System.out.println("The cipher is :>>>> " +encode.getCrypt()+" <<<<");

                }


                /**Section for User entry for decode**/
                System.out.println("                                       ");
                System.out.println("               LET'S NOW DECRYPT                        ");
                System.out.println("Enter an encrypted message you want to decrypt: ");
                System.out.println("                                       ");
                System.out.println("                                       ");
                String ciphertext = mSc.readLine();

               do {
                   System.out.println("                                       ");
                   System.out.println("Enter decryption key: ");
                    String mKey = mSc.readLine();
                   key = Integer.parseInt(mKey);
               } while ( key<0 || key > 25);

                Decoding decode = new Decoding(ciphertext, key);
                decode.setCodedText(ciphertext);
                decode.setKey(key);
                decode.doDecode(ciphertext, key);
                if (decode.getmDecrypted_Message().equals(ciphertext)) {
                    System.out.println("                                       ");
                    System.out.println("<<< Sorry, Your original message must have been just numbers. It was never.>>>");
                    System.out.println("                                       ");
                    System.out.println("                Thanks & Bye           ");
                    runner=false;
                    break;
                } else {
                    System.out.println("                                       ");
                    System.out.println("                                       ");
                    System.out.println("Original Msg: >> "+ decode.getmDecrypted_Message()+" << ");
                    System.out.println("                                       ");
                    System.out.println("                                       ");
                    System.out.println("                 Thanks & Bye!!                      ");
                    runner=false;
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("!!! Invalid!!!  The key must be [1-25]. ");
                System.out.println("               Start all over again                        ");
            }

        }
    }
}
