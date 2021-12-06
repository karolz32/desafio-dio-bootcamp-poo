package br.com.dio.desafio.bootcamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();
}