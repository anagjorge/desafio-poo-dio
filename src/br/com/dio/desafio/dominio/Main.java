package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(4);




        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso1);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ana:" + devAna.getConteudosConsluidos());
        System.out.println("XP:"+ devAna.calcularTotalXp());

        System.out.println("--------");

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jorge:" + devJorge.getConteudosInscritos());
        devJorge.progredir();
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("Conteudos Inscritos Jorge:" + devJorge.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jorge:" + devJorge.getConteudosConsluidos());
        System.out.println("XP:"+ devJorge.calcularTotalXp());



    }
}
