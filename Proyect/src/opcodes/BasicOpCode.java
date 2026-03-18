package opcodes;

import java.util.Deque;
/**
 * Interfaz para operaciones básicas del script.
 * Estas operaciones trabajan directamente sobre la estructura
 * interna de la pila (Deque) y no retornan valor.
 */
public interface BasicOpCode {

    boolean execute(Deque<String> stack);

}
