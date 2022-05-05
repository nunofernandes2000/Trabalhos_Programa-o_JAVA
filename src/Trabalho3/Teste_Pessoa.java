/*
Nuno Fernandes 21635
Pedro Andrade 21633

Trabalho nº3 PROGRAMAÇÃO
DWDM 1ºANO 21/22
Falta proteger a idade mas sem o utilizar o set da idade fica complicado
*/

package Trabalho3;

import java.util.Scanner;

public class Teste_Pessoa {
    public static void main(String[] args) {
        char genero;
        int anonascimento;
        String nome, apelido;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o Ano em que nasceu esta pessoa");
        anonascimento = teclado.nextInt();
        System.out.println("Qual o Género desta pessoa M/F");
        genero = teclado.next().toUpperCase().charAt(0);
        System.out.println("Qual o Primeiro nome desta pessoa");
        nome = teclado.next();
        System.out.println("Qual o Apelido desta pessoa");
        apelido = teclado.next();
        Pessoa pessoa = new Pessoa(nome, apelido, anonascimento, genero);

        int anos = pessoa.calculaIdade(anonascimento);

        System.out.println("Esta pessoa têm " + pessoa.calculaIdade(pessoa.getaonascimento()) + " anos");
        System.out.println(pessoa.toString() + " tendo esta " + anos + " anos");
        System.out.println("A pessoa é do Género " + pessoa.getGenero());
        System.out.println("A pessoa nasceu no ano " + pessoa.getaonascimento());
        System.out.println("A pessoa chama-se " + pessoa.getnome());
        System.out.println("A pessoa têm como apelido " + pessoa.getapelido());
        System.out.println("A pessoa têm " + pessoa.calculaIdade(anonascimento) + " anos");

        System.out.println("\n");
        Pessoa pessoa2 = new Pessoa("Manel", "Anastacio", 2001, 'M');
        System.out.println("Esta pessoa têm " + pessoa2.calculaIdade(pessoa.getaonascimento()) + " anos");
        System.out.println(pessoa2.toString());
        System.out.println("A pessoa é do Género " + pessoa2.getGenero());
        System.out.println("A pessoa nasceu no ano " + pessoa2.getaonascimento());
        System.out.println("A pessoa chama-se " + pessoa2.getnome());
        System.out.println("A pessoa têm como apelido " + pessoa2.getapelido());
        System.out.println("A pessoa têm " + pessoa2.calculaIdade(anonascimento) + " anos");
    }


}

