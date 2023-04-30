package TDE06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        List<Materia> listMateria = new ArrayList<>();

        listMateria.add(new Materia(0,"POG","JAVA"));
        listMateria.add(new Materia(1,"POO","PHP"));
        listMateria.add(new Materia(2,"BANCO","SQL"));

        System.out.println("Digite o seu nome");
        aluno.setNmAluno(scanner.next());

        System.out.println("Digite o seu RA");
        aluno.setNrRa(scanner.next());


        System.out.println("Digite o cod da materia ");
        listMateria.forEach(materia -> {
            System.out.printf("\nCOD = %d Materia = %s Linguagem = %s\n",
                    materia.getId(), materia.getNmMateria(), materia.getLinguagem());
        });


        aluno.getMaterias().add(listMateria.get(scanner.nextInt()));

        System.out.println("Digite o cod da materia ");
        listMateria.forEach(materia -> {
            System.out.printf("\nCOD = %d Materia = %s Linguagem = %s\n",
                    materia.getId(), materia.getNmMateria(), materia.getLinguagem());
        });
        aluno.getMaterias().add(listMateria.get(scanner.nextInt()));

//        aluno.setMaterias(listMateria.get(scanner.nextInt()));


        System.out.println("NOME................."+aluno.getNmAluno());
        System.out.println("RA..................."+aluno.getNrRa());

        aluno.getMaterias().forEach(materia -> {
            System.out.println("MATERIA.............."+materia.getNmMateria());
            System.out.println("LINGUAGEM............"+materia.getLinguagem());
        });

//
//        for (int i = 0; i < listMateria.size() ; i++) {
//            System.out.printf("\nCOD = %d Materia = %s Linguagem = %s",i, listMateria.get(i).getNmMateria(),
//                    listMateria.get(i).getLinguagem());
//        }

    }
}
