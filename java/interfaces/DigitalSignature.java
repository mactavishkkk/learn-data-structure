package interfaces;

public interface DigitalSignature extends Authenticate {

    long hash();
    
}
