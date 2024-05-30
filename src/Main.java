import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        System.out.println(curso);
        curso.setTitulo("curso java");
        curso.setDescricao("curso curto de java");
        curso.setCargaHoraria(8);


        Curso curso2 = new Curso();
        System.out.println(curso2);
        curso2.setTitulo("curso java");
        curso2.setDescricao("curso curto de js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria java descrição");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("------------------------------------------------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        devLucas.progredir();

        System.out.println("Conteúdos inscritos: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devLucas.getConteudosConcluidos());

        System.out.println("XP LUCAS: " + devLucas.calcularTotalXp());

        System.out.println("------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());

        System.out.println("XP JOAO: " + devJoao.calcularTotalXp());

        System.out.println("------------------------------------------------");

    }
}
