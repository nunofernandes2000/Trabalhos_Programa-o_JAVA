/*
Nuno Fernandes 21635
Pedro Andrade 21633

Trabalho nº3 PROGRAMAÇÃO
DWDM 1ºANO 21/22
Falta proteger o ano da matricula mas sem o utilizar o set da idade fica complicado
*/

package Trabalho3;

import java.util.Scanner;

public class Teste_Aluno {
    public static void main(String[] args) {
        char genero, codigocurso;
        int anonascimento, ano, numaluno, anomatricula, anos;
        String nome, apelido;

        nome = "Pedro";
        apelido = "Anastácio";
        genero = 'M';
        anonascimento = 2001;

        boolean bolseiro;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o Numero do Aluno");
        numaluno = teclado.nextInt();
        System.out.println("Qual o Ano da Matricula deste aluno");
        anomatricula = teclado.nextInt();
        System.out.println("O aluno é bolseiro? True/False");
        bolseiro = teclado.nextBoolean();
        codigocurso = 'T';
        Aluno AlunoT = new Aluno(nome, apelido, genero, anonascimento, numaluno, codigocurso, bolseiro, anomatricula);
        Pessoa pessoa = new Pessoa(nome, apelido, anonascimento, genero);

        System.out.println(AlunoT.toString());
        System.out.println(pessoa.toString());
        System.out.println();
        System.out.println("Nº Aluno " + AlunoT.getnumAluno());
        System.out.println("É " + AlunoT.getbolseiro() + " que o aluno seja bolseiro");
        System.out.println("O aluno têm o código curso " + AlunoT.getcodigocurso());
        System.out.println("O aluno fez a matricula no ano " + AlunoT.getanomatricula());
        System.out.println("O aluno Nº " + AlunoT.getnumAluno() + " vai ingressar numa licenciatura vai poder usufruir de bolsa?\n");
        bolseiro = teclado.nextBoolean();
        AlunoT.alteraAluno('L', bolseiro);
        System.out.println(AlunoT.toString() + " tendo este anteriormente pertencido a um CTESP" + "\n");

        nome = "Ana";
        apelido = "Cacho";
        genero = 'F';
        anonascimento = 1998;

        System.out.println("Qual o Numero do Aluno");
        numaluno = teclado.nextInt();
        System.out.println("Qual o Ano da Matricula deste aluno");
        anomatricula = teclado.nextInt();
        System.out.println("O aluno é bolseiro? True/False");
        bolseiro = teclado.nextBoolean();
        codigocurso = 'L';
        Aluno AlunoL = new Aluno(nome, apelido, genero, anonascimento, numaluno, codigocurso, bolseiro, anomatricula);
        Pessoa pessoa2 = new Pessoa(nome, apelido, anonascimento, genero);

        System.out.println(AlunoL.toString());
        System.out.println(pessoa2.toString());
        System.out.println();
        System.out.println("Nº Aluno " + AlunoL.getnumAluno());
        System.out.println("É " + AlunoL.getbolseiro() + " que o aluno seja bolseiro");
        System.out.println("O aluno têm o código curso " + AlunoL.getcodigocurso());
        System.out.println("O aluno fez a matricula no ano " + AlunoL.getanomatricula());

        nome = "Paulo";
        apelido = "Palhaço";
        genero = 'm';
        anonascimento = 1993;

        System.out.println("Qual o Numero do Aluno");
        numaluno = teclado.nextInt();
        System.out.println("Qual o Ano da Matricula deste aluno");
        anomatricula = teclado.nextInt();
        System.out.println("O aluno é bolseiro? True/False");
        bolseiro = teclado.nextBoolean();
        codigocurso = 'L';
        Aluno AlunoM = new Aluno(nome, apelido, genero, anonascimento, numaluno, codigocurso, bolseiro, anomatricula);
        Pessoa pessoa3 = new Pessoa(nome, apelido, anonascimento, genero);

        System.out.println(AlunoM.toString());
        System.out.println(pessoa3.toString());
        System.out.println();
        System.out.println("Nº Aluno " + AlunoM.getnumAluno());
        System.out.println("É " + AlunoM.getbolseiro() + " que o aluno seja bolseiro");
        System.out.println("O aluno têm o código curso " + AlunoM.getcodigocurso());
        System.out.println("O aluno fez a matricula no ano " + AlunoM.getanomatricula());
    }

}

