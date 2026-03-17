package test;

import interpreter.ScriptInterpreter;
import opcodes.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ScriptInterpreterTest {

    @Test
    void testOpDupSuccess() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<OpCode> script = Arrays.asList(
                new PushData("A"),
                new OpDup(),
                new OpEqual()
        );

        boolean result = interpreter.execute(script);

        assertTrue(result);
    }

    @Test
    void testOpEqualTrue() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<OpCode> script = Arrays.asList(
                new PushData("5"),
                new PushData("5"),
                new OpEqual()
        );

        boolean result = interpreter.execute(script);

        assertTrue(result);
    }

    @Test
    void testOpEqualFalse() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<OpCode> script = Arrays.asList(
                new PushData("5"),
                new PushData("6"),
                new OpEqual()
        );

        boolean result = interpreter.execute(script);

        assertFalse(result);
    }

    @Test
    void testStackEmptyError() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<OpCode> script = Arrays.asList(
                new OpDup()
        );

        boolean result = interpreter.execute(script);

        assertFalse(result);
    }

    @Test
    void testCheckSigValid() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<OpCode> script = Arrays.asList(
                new PushData("SIG(MyPublicKey)"),
                new PushData("MyPublicKey"),
                new OpCheckSig()
        );

        boolean result = interpreter.execute(script);

        assertTrue(result);
    }

    @Test
    void testCheckSigInvalid() {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<OpCode> script = Arrays.asList(
                new PushData("SIG(fakeKey)"),
                new PushData("MyPublicKey"),
                new OpCheckSig()
        );

        boolean result = interpreter.execute(script);

        assertFalse(result);
    }
}