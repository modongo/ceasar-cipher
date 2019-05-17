public class Encoding {
    private String mPlaintext;
    private  String mEncrypted_Message;
    private int mKey;
    private  char mAlphabet;
public Encoding(String plaintext,Integer key){
    this.mPlaintext = plaintext;
    this.mKey = key;
}

    //setter
    public Boolean setPlaintext(String userText) {
        // Validate user input before setting
        if (!userText.equals("")) {

            if (userText.matches("[a-zA-Z]+")) {
                this.mPlaintext = userText;
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

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
            mAlphabet = mPlaintext.charAt(i);

            if (mAlphabet >= 'a' && mAlphabet <= 'z') {
                mAlphabet = (char) (mAlphabet + mKey);

                if (mAlphabet > 'z') {
                    mAlphabet = (char) (mAlphabet - 'z' + 'a' - 1);
                }

                mEncrypted_Message += mAlphabet;
            } else {
                mEncrypted_Message += mAlphabet;
            }
        }
        return mEncrypted_Message;
    }
}






