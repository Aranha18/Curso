package br.senai.sp.curso;

import java.util.Scanner;

public class Curso {
    public static void main(String[] args) {

        boolean loop = false;
        while (!loop) {


            Scanner sc = new Scanner(System.in);

            System.out.print("Ola aluno qual seu nome?");
            String nome = sc.nextLine();

            System.out.print(nome + " Qual seu curso?");
            String curso = sc.nextLine();

            System.out.print(nome + " Qual o nome do seu professor?");
            String professor = sc.nextLine();

            System.out.print(nome + " Qual sua frequencia nas aulas do(a) " + professor + "?");
            int frequencia = sc.nextInt();

            System.out.print(nome + " Suas notas nesse na aula do " + professor + "?");
            Float[] notas = new Float[2];
            notas[0] = sc.nextFloat();
            notas[1] = sc.nextFloat();

            Float media = (notas[0] + notas[1]) / 2;

            System.out.println("Seu nome= " + nome);
            System.out.println("Nome do curso= " + curso);
            System.out.println("Nome do professor= " + professor);
            System.out.println("Sua Frequencia= " + frequencia + "%");
            System.out.println("Sua media= " + media);

            if (frequencia >= 75 && media >= 7 || media >= 6 && frequencia>= 90) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println("Deseja encerrar S/N?");
            String encerra = sc.next().toUpperCase();
            if (encerra.equals("S")){
                loop=true;
            }
        }
    }
}
