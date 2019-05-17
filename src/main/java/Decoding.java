public class Decoding
{
    private String mCipherText;
    private String mDecrypted_Message;
    private  Integer mKey;
    private  char mAlphabet;

 public Decoding(String cipherText,Integer key){
     this.mCipherText = cipherText;
     this.mKey = key;

 }


    public Boolean setCodedText(String codedText){
       // this.mCipherText = codedText;
        if (!codedText.equals("")) {

            if (codedText != null){

                if(codedText.matches("[a-zA-Z]+")) {
                    this.mCipherText = codedText;
                    return true;
                }
            }
        }
        return false;

}
 public boolean setKey(Integer key) {
     if (key == (int) key) {
         if (key <= 25) {
             this.mKey = key;
             return true;
         } else {
             return false;
         }
     } else {
         return false;
     }
 }
 public String getmDecrypted_Message(){
        return mDecrypted_Message;
 }

    public String doDecode(){

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
