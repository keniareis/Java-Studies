package org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.excecoes_personalizadas.model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    public DomainException(String msg){
        super(msg);
    }
}
