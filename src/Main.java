import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        System.out.println(curso);
        curso.setTitulo("curso java");
        curso.setDescricao("curso curto de java");
        curso.setCargaHoraria(8);
        System.out.println(curso);

    }
}
