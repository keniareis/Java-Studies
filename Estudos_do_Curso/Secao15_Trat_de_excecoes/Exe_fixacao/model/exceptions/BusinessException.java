package org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.Exe_fixacao.model.exceptions;

import java.io.Serial;

public class BusinessException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;
    public BusinessException(String msg){
        super(msg);
    }
}
