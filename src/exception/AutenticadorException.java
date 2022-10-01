package exception;

import java.io.Serial;

public class AutenticadorException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public AutenticadorException(String mensagem) {
        super(mensagem);
    }

}