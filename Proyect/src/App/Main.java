package App;

import interpreter.ScriptInterpreter;
import opcodes.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean trace = true;

        ScriptInterpreter interpreter = new ScriptInterpreter(trace);

        List<Object> script = new ArrayList<>();

        script.add("2");
        script.add("3");
        script.add(new OpAdd());
        script.add("5");
        script.add(new OpEqual());

        boolean result = interpreter.execute(script);

        System.out.println("Resultado final: " + result);

    }
}
