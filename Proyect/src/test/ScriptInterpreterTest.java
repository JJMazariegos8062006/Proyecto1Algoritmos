package test;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import interpreter.ScriptInterpreter;

import static org.junit.jupiter.api.Assertions.*;

public class ScriptInterpreterTest {

    @Test
    void testOpDupSuccess() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<String> script = Arrays.asList(
                "A",
                "OP_DUP",
                "OP_EQUAL"
        );

        boolean result = interpreter.execute(script);

        assertTrue(result);
    }

    @Test
    void testOpEqualTrue() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<String> script = Arrays.asList(
                "5",
                "5",
                "OP_EQUAL"
        );

        boolean result = interpreter.execute(script);

        assertTrue(result);
    }

    @Test
    void testOpEqualFalse() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<String> script = Arrays.asList(
                "5",
                "6",
                "OP_EQUAL"
        );

        boolean result = interpreter.execute(script);

        assertFalse(result);
    }

    @Test
    void testStackEmptyError() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<String> script = Arrays.asList(
                "OP_DUP"
        );

        boolean result = interpreter.execute(script);

        assertFalse(result);
    }

    @Test
    void testCheckSigValid() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<String> script = Arrays.asList(
                "SIG(MyPublicKey)",
                "MyPublicKey",
                "OP_CHECKSIG"
        );

        boolean result = interpreter.execute(script);

        assertTrue(result);
    }

    @Test
    void testCheckSigInvalid() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<String> script = Arrays.asList(
                "SIG(fakeKey)",
                "MyPublicKey",
                "OP_CHECKSIG"
        );

        boolean result = interpreter.execute(script);

        assertFalse(result);
    }
}