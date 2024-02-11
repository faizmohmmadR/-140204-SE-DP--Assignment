public class AESEncryptionStrategy implements EncryptionStrategy {
    @Override
    public String encrypt(String data) {
        // Code of RSA encryption algorithm 
        System.out.println("AES Encrypted: " + data);
        
        return data;
    }
}