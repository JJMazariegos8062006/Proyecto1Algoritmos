package App;

import interpreter.ScriptInterpreter;
import opcodes.*;

import java.util.Arrays;
import java.util.List;
/**
 * Clase principal del programa.
 *
 * Se encarga de crear un script de ejemplo y ejecutar el intérprete
 * de Bitcoin Script. Muestra en consola si la transacción es válida o no.
 */
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