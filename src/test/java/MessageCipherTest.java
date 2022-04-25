import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageCipherTest {
    @Test
    public void cipherLetter_returnsCharPlusTwoPosition_C(){
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'C';
        assertEquals(expected, messageCipher.cipherLetter('A'));
    }

    @Test
    public void cipherLetter_returnsCharPlusTwoPosition_B(){
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'B';
        assertEquals(expected, messageCipher.cipherLetter('Z'));
    }

    @Test
    public void cipherWord_returnsCipherWord_DQA(){
        MessageCipher messageCipher = new MessageCipher();
        String expected = "DQA";
        assertEquals(expected, messageCipher.cipherWord("BOY"));
    }

    @Test
    public void cipherWord_lowercase_returnsCipherWord_DQA(){
        MessageCipher messageCipher = new MessageCipher();
        String expected = "DQA";
        assertEquals(expected, messageCipher.cipherWord("boy"));
    }
}
