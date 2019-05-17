import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void main() {
        Encoding encode = new Encoding("z",1);
        Decoding decode = new Decoding("a",1);
        assertEquals(encode.getCrypt(),decode.getmDecrypted_Message());
    }
}