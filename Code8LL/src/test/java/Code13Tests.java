import Code13.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Code13Tests {
    @Test
    public void testValidateBrackets() {
        assertTrue(Main.validateBrackets("{}"));
        assertTrue(Main.validateBrackets("{}(){}"));
        assertTrue(Main.validateBrackets("()[[Extra Characters]]"));
        assertTrue(Main.validateBrackets("(){}[[]]"));
        assertTrue(Main.validateBrackets("{}{Code}[Fellows](())"));
        assertFalse(Main.validateBrackets("[({}]"));
        assertFalse(Main.validateBrackets("(]"));
        assertFalse(Main.validateBrackets("{(})"));
        assertFalse(Main.validateBrackets("{")); // error unmatched opening { remaining.
        assertFalse(Main.validateBrackets(")")); // error closing ) arrived without corresponding opening.
        assertFalse(Main.validateBrackets("[}")); // error closing }. Doesn’t match opening (.
    }
}
