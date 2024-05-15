package br.com.riatladias.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //construtor com argumentos
public class ErrorMessageDTO {
    private String message;
    private String field;
}
