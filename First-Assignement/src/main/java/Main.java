
public class Main {
    public static void main(String[] args) {
        // Create encryption strategies

        EncryptionStrategy aesEncryptionStrategy = new AESEncryptionStrategy();
        EncryptionStrategy rsaEncryptionStrategy = new RSAEncryptionStrategy();
        EncryptionStrategy blowfishEncryptionStrategy = new BlowfishEncryptionStrategy();
        
        // Create encryption processor
        EncryptionProcessor encryptionProcessor = new EncryptionProcessor();

        // Encrypt data using AES encryption
        encryptionProcessor.setEncryptionStrategy(aesEncryptionStrategy);
        encryptionProcessor.encryptData("Hello, AES");
        

        // Encrypt data using RSA encryption
        encryptionProcessor.setEncryptionStrategy(rsaEncryptionStrategy);
        encryptionProcessor.encryptData("Hello, RSA");
        

        // Encrypt data using Blowfish encryption
        encryptionProcessor.setEncryptionStrategy(blowfishEncryptionStrategy);
        encryptionProcessor.encryptData("Hello, Blowfish");
        
    }
}