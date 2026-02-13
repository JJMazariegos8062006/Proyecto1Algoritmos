package App;

import interpreter.ScriptInterpreter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ScriptInterpreter interpreter = new ScriptInterpreter();

        List<String> script = Arrays.asList(
                "SIG(MyPublicKey)",
                "MyPublicKey",
                "OP_DUP",
                "OP_HASH160",
                "HASH160(MyPublicKey)",
                "OP_EQUALVERIFY",
                "OP_CHECKSIG"
        );

        boolean result = interpreter.execute(script);

        System.out.println("¿Transacción válida? " + result);
    }
}
