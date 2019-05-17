import java.io.Console;

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
        try{ if(encode.setPlaintext(plaintext)){
            if(encode.setKey(key)){
                encode.doEncode();
                System.out.println(" The Crypt is: " +encode.getCrypt());
            }else {

                System.out.println("***Invalid key!!\n The Key must be between 1 - 25.*****");
                System.out.println("                                    ");
                System.out.println("...Please start again...");
                Runtime.getRuntime().halt(0);
            }

        }else {
            System.out.println("****Invalid Message!!\n The Message must be an alphabet******");
            System.out.println("                                    ");
            System.out.println("...Please start again.");
            Runtime.getRuntime().halt(0);

        }
        }catch (Exception e){

            System.out.println("Error occured. Please run the app again.");
        }



        //display the crypt


        //Section for User entry for decode
        System.out.println("Enter an encrypted message you want to decrypt: ");
        String ciphertext  = mSc.readLine();

        System.out.println("Enter decryption key: ");
        mKey = mSc.readLine();
        key = Integer.parseInt(mKey);

        Decoding decode = new Decoding(ciphertext,key);
      try {
          if(decode.setCodedText(ciphertext)){
              if(decode.setKey(key)){
                  decode.doDecode();
                  System.out.println("The original Message was: " + decode.getmDecrypted_Message());
              } else{
                  System.out.println("Invalid key.");
                  //Break
                  System.out.println("...Please start again.");
                  Runtime.getRuntime().halt(0);

              }
          } else {

              System.out.println("Invalid crypt. Your crypt must contain alphabetical letters only");
              System.out.println("...Please start again.");
              Runtime.getRuntime().halt(0);
          }
      }catch (Exception e){
          System.out.println("An error occured. Please  try again.");
      }




    }
}
