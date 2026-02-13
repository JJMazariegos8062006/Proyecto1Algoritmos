package crypto;

public class MockCrypto {


    public static String hash160(String input) {
        return "HASH160(" + input + ")";
    }


    public static boolean checkSig(String signature, String pubKey) {
        return signature.equals("SIG(" + pubKey + ")");
    }
}

