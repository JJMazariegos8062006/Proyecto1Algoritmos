package App;

import interpreter.ScriptInterpreter;
import opcodes.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<OpCode> script = Arrays.asList(
                new PushData("SIG(MyPublicKey)"),
                new PushData("MyPublicKey"),
                new OpDup(),
                new OpHash160(),
                new PushData("HASH160(MyPublicKey)"),
                new OpEqualVerify(),
                new OpCheckSig()
        );

        boolean result = interpreter.execute(script);

        System.out.println("¿Transacción válida? " + result);
    }
}