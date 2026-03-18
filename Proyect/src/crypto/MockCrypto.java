package crypto;
/**
 * Clase que simula operaciones criptográficas.
 *
 * No realiza cálculos reales, sino que devuelve resultados simulados
 * para permitir probar la lógica del intérprete sin usar criptografía real.
 */
public class MockCrypto {

    /**
     * Simula la función HASH160.
     *
     * @param input dato de entrada
     * @return hash simulado
     */public static String hash160(String input) {
        return "HASH160(" + input + ")";
    }


    /**
     * Simula la verificación de firma digital.
     *
     * @param signature firma
     * @param pubKey clave pública
     * @return true si la firma es válida, false en caso contrario
     */public static boolean checkSig(String signature, String pubKey) {
        return signature.equals("SIG(" + pubKey + ")");
    }
}

