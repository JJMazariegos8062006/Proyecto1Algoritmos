package interpreter;

import model.ScriptStack;
import crypto.MockCrypto;

import java.util.List;

public class ScriptInterpreter {

    private ScriptStack stack = new ScriptStack();

    public boolean execute(List<String> script) {

        try {
            for (String token : script) {

                switch (token) {

                    case "OP_DUP":
                        stack.push(stack.peek());
                        break;

                    case "OP_DROP":
                        stack.pop();
                        break;

                    case "OP_EQUAL":
                        String a = stack.pop();
                        String b = stack.pop();
                        stack.push(a.equals(b) ? "1" : "0");
                        break;

                    case "OP_EQUALVERIFY":
                        String x = stack.pop();
                        String y = stack.pop();
                        if (!x.equals(y)) {
                            throw new RuntimeException("OP_EQUALVERIFY falló");
                        }
                        break;

                    case "OP_HASH160":
                        String value = stack.pop();
                        stack.push(MockCrypto.hash160(value));
                        break;

                    case "OP_CHECKSIG":
                        String pubKey = stack.pop();
                        String sig = stack.pop();
                        stack.push(MockCrypto.checkSig(sig, pubKey) ? "1" : "0");
                        break;

                    default:
                        // Si no es opcode, es dato literal
                        stack.push(token);
                        break;
                }

                stack.printStack(); // Modo trace básico
            }

            return !stack.isEmpty() && !stack.pop().equals("0");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}

