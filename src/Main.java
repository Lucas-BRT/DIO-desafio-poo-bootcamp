import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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



        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
