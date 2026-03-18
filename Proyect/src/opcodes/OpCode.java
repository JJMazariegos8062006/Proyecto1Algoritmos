package opcodes;

import model.ScriptStack;
/**
 * Interfaz que define un opcode del sistema.
 * Cada opcode representa una operación que puede ejecutarse
 * dentro del script y trabaja sobre la pila principal.
 */
public interface OpCode {
    void execute(ScriptStack stack);
}