package br.com.marques.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
  public UserFoundException() {
    super("User já existe no banco de dados");
  }

}
