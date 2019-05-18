import java.lang.Character;
public class Encoding {
    private String mPlaintext;
    private  String mEncrypted_Message;
    private int mKey;
    private  Character mAlphabet;
    private Character mEncyptedChar;
public Encoding(String plaintext,Integer key){
    this.mPlaintext = plaintext;
    this.mKey = key;
}

    //setter
    public void setPlaintext(String userText) {
        // Set the user message
        this.mPlaintext = userText;
    }

    //setter
    public  Boolean setKey(Integer key){

        if(key == (int)key){
            if(key <= 25){
                this.mKey = key;
                return true;
            }
            return false;
        }
        return true;
    }

    //getter

    public String getCrypt(){
        return this.mEncrypted_Message;

    }

    public String doEncode() {

        mEncrypted_Message = "";
        for (int i = 0; i < mPlaintext.length(); i++) {

            // mAlphabet
            String mplainIndex = String.valueOf(mPlaintext.charAt(i));
            if (mplainIndex.matches("[a-zA-Z]+")) {
                mEncyptedChar = (char) (mPlaintext.charAt(i) + mKey);
                if (mplainIndex.matches("[a-z]+")) {
                    if (mEncyptedChar > 'z') {
                        mEncrypted_Message += (char) (mPlaintext.charAt(i) - (26 - mKey));
                    }
                   else{
                            mEncrypted_Message += mEncyptedChar;
                        }

                    } else if (mplainIndex.matches("[A-Z]+")) {
                        if (mEncyptedChar > 'Z') {
                            mEncrypted_Message += (char) (mPlaintext.charAt(i) - (26 - mKey));
                        }
                       else{
                                mEncrypted_Message += mEncyptedChar;
                            }
                        }
                    } else {
                        mEncrypted_Message += mPlaintext.charAt(i);
                    }

                }
                return mEncrypted_Message;
            }
           }










