import java.lang.Character;
public class Decoding
{
    private String mCipherText;
    private String mDecrypted_Message;
    private  Integer mKey;
    private  Character mAlphabet;

 public Decoding(String cipherText,Integer key){
     this.mCipherText = cipherText;
     this.mKey = key;

 }


    public void setCodedText(String codedText){
       // setter
        this.mCipherText = codedText;

 }

 public void setKey(Integer key) {
     this.mKey = key;
 }
 public String getmDecrypted_Message(){
        return mDecrypted_Message;
 }

    public String doDecode(String crypt,Integer mKey){

        mCipherText = mCipherText.toLowerCase();
        mDecrypted_Message="";

        for(int i = 0; i < mCipherText.length(); ++i){


            mAlphabet = mCipherText.charAt(i);


            if(mAlphabet >= 'a' && mAlphabet <= 'z'){

                mAlphabet = (char)(mAlphabet - mKey);

                if(mAlphabet < 'a'){
                    mAlphabet = (char)(mAlphabet + 'z' - 'a' + 1);
                }

                mDecrypted_Message += mAlphabet;
            }
            else {
                mDecrypted_Message += mAlphabet;
            }
        }

        return mDecrypted_Message;

    }
}
