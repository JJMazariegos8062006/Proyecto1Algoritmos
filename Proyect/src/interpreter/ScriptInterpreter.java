package interpreter;

import model.ScriptStack;

import java.util.List;
import opcodes.OpCode;
/**
 * Clase principal del intérprete de Bitcoin Script.
 *
 * Esta clase recibe una lista de instrucciones (script) y las ejecuta
 * en orden utilizando una pila. Se encarga de identificar si cada elemento
 * es un opcode o un dato, y ejecutarlo correctamente.
 *
 * El resultado final es verdadero si la ejecución termina sin errores
 * y el valor final en la pila es true.
 */
public class ScriptInterpreter {

    private ScriptStack stack = new ScriptStack();

    /**
     * Ejecuta un script de Bitcoin.
     *
     * @param script Lista de instrucciones a ejecutar.
     * @return true si el script es válido, false en caso contrario.
     */public boolean execute(List<OpCode> script) {

        try {
            for (OpCode op : script) {
                op.execute(stack);
                stack.printStack();
            }

            return !stack.isEmpty() && !stack.pop().equals("0");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
