package opcodes;

import model.ScriptStack;
/**
 * Clase de pruebas para el intérprete.
 *
 * Contiene casos de prueba para verificar el correcto funcionamiento
 * de los opcodes y la ejecución de scripts.
 */
public class PushData implements OpCode {

    private String value;

    public PushData(String value) {
        this.value = value;
    }

    @Override
    public void execute(ScriptStack stack) {
        stack.push(value);
    }
}