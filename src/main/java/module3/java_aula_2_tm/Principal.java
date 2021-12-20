package module3.java_aula_2_tm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Gabriel Amurim", LocalDate.now(), 1, "1°");
        Estudante estudante2 = new Estudante("Rodrigo Franco", LocalDate.now(), 2, "2°");
        Estudante estudante3 = new Estudante("Nathalia Dantas", LocalDate.now(), 3, "3°");
        Estudante estudante4 = new Estudante("Aderson vieira", LocalDate.now(), 4, "1°");

        Disciplina disciplina1 = new Disciplina("Java", 60);
        Disciplina disciplina2 = new Disciplina("programação orientada a objeto", 48);
        Disciplina disciplina3 = new Disciplina("programação orientada a objeto", 24);
        Disciplina disciplina4 = new Disciplina("programação orientada a objeto", 36);

        List<Estudante> estudantes1 = new ArrayList<>();
        estudantes1.add(estudante1);
        estudantes1.add(estudante2);

        List<Estudante> estudantes2 = new ArrayList<>();
        estudantes2.add(estudante3);
        estudantes2.add(estudante4);

        List<Disciplina> diciplinas1 = new ArrayList<>();
        diciplinas1.add(disciplina1);
        diciplinas1.add(disciplina2);

        List<Disciplina> diciplinas2 = new ArrayList<>();
        diciplinas2.add(disciplina3);
        diciplinas2.add(disciplina4);

        Turma turma1 = new Turma("1°", 123, diciplinas1, estudantes1);
        Turma turma2 = new Turma("2°", 456, diciplinas2, estudantes2);

        System.out.println(turma1);
        System.out.println("==================================");
        System.out.println(turma2);
    }
}
