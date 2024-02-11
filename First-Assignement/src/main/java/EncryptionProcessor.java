public class EncryptionProcessor {
    private EncryptionStrategy encryptionStrategy;
    
    public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public String encryptData(String data) {
        return encryptionStrategy.encrypt(data);
    }
}