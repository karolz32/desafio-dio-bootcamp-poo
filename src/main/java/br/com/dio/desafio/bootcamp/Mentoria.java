package br.com.dio.desafio.bootcamp;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Getter
@Setter
public class Mentoria extends Conteudo{

    private String data;

    public Mentoria(String titulo, String descricao, String data) {
        this.titulo = getTitulo();
        this.descricao = getDescricao();
        this.data = data;
    }
    public Mentoria(String titulo, String descricao) {
        this.titulo = getTitulo();
        this.descricao = getDescricao();
        this.data = StringUtils.dateToString(LocalDate.now());
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descrição='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }


}
