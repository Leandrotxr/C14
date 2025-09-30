package br.inatel.cdg.compras;

public class NumeroNegativoException extends RuntimeException {
    public NumeroNegativoException(String message) {
        super(message);
    }

  public NumeroNegativoException(String msg, Throwable cause){
    super(msg, cause);
  }
}
