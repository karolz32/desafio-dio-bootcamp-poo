package br.com.dio.desafio.bootcamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = getTitulo();
        this.descricao = getDescricao();
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descrição='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
