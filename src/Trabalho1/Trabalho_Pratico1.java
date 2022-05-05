package Trabalho1;
//Pedro Andrade Nº21633
//Nuno Fernandes Nº21635
//IT Índice de Transmissibilidade
//IC Incidência Cumulativa
//Decidimos meter o IC como double porque o número de casos por 100 mil habitantes pode não ser inteiro
//somaic é a variável que incrementa no IC
//Como não foi explicado o que aconteceria se o ic passa-se os*
//*240 nós interpretamos que iria ser considerado como risco vermelho e da mesma forma*
//*que nós fizemos o mesmo para um IT abaixo de 0,5 que decidimos descrever que não existe risco
//Nós também interpretamos os 0s como "inclusive"

import java.util.Scanner;

public class Trabalho_Pratico1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia = 1;
        double it = 0;
        double ic = 0, somaic;
        char option1 = 'n', option2 = 'n', option = 'n', option3 = 'S';
        System.out.println("Este programa simula as restrições da covid-19 e o seu nível de risco");
        while (option3 == 'S') {

            System.out.println("Sabe o IT e IC? True/False");
            boolean sabe = teclado.nextBoolean();
            if (sabe == true) {
                System.out.println("Indique o IT");
                /*do{
                it = teclado.nextDouble();
                if(it < 0 || it >= 1.5){
                    System.out.println("Insira os dados corretamente entre 0 a menos de 1.5");
                }
                }while(it < 0 || it >= 1.5);*/
                it = teclado.nextDouble();
                System.out.println("Indique o IC");
                ic = teclado.nextDouble();
            } else if (sabe == false) {


                dia = 1;
                while (dia <= 7) {
                    System.out.println("Insira o número de casos por cada 100 mil habitantes no dia " + dia);
                    somaic = teclado.nextDouble();
                    if (somaic >= 0) {
                        ic += somaic;
                        dia += 1;
                    } else {
                        System.out.println("Introduza um número de infetados maior ou igual a 0");
                    }


                }
                it = Math.random() * 1.5;
            }
            System.out.println("Pretende ver o índice de transmissibilidade e a incidência cumulativa? (S/N)");
            option = teclado.next().toUpperCase().charAt(0);
            switch (option) {
                case 'S':

                    System.out.println("Índice de transmissibilidade é de:" + " " + it);
                    System.out.println("Incidência cumulativa é de:" + " " + ic);
                    System.out.println("Pretende ver o nível de risco associado a este IT e a este IC? (S/N)");
                    option1 = teclado.next().toUpperCase().charAt(0);
                    switch (option1) {
                        case 'S':

                            if ((ic >= 0 && ic <= 120) && (it > 0.5 && it <= 1)) {

                                System.out.println("Nível de risco é verde");
                                System.out.println("\nPretende ver as medidas associadas a este nível de risco? (S/N)");
                                option2 = teclado.next().toUpperCase().charAt(0);
                                switch (option2) {
                                    case 'S':
                                        System.out.println("Não existem medidas para ajuntamentos em espaços públicos");
                                        System.out.println("Não existem medidas para a restauração");
                                        System.out.println("Não existem medidas para teletrabalho");
                                        break;

                                    default:
                                }
                            } else if ((ic > 120 && ic < 240) && (it > 0.5 && it <= 1) || (ic >= 0 && ic <= 120) && (it > 1 && it < 1.5)) {
                                System.out.println("Nível de risco é laranja");
                                System.out.println("\nPretende ver as medidas associadas a este nível de risco? (S/N)");
                                option2 = teclado.next().toUpperCase().charAt(0);
                                switch (option2) {
                                    case 'S':
                                        System.out.println("Ajuntamentos de 10 ou menos pessoas são permitidos");
                                        System.out.println("É permitida a entrada de grupos até 6 pessoas na restauração");
                                        System.out.println("Teletrabalho se possível");
                                        break;

                                    default:
                                }
                            } else if ((ic > 120 && ic < 240) && (it > 1 && it < 1.5)) {
                                System.out.println("Nível de risco é vermelho");
                                System.out.println("\nPretende ver as medidas associadas a este nível de risco? (S/N)");
                                option2 = teclado.next().toUpperCase().charAt(0);
                                switch (option2) {
                                    case 'S':
                                        System.out.println("Ajuntamentos de 6 ou menos pessoas são permitidos");
                                        System.out.println("Na restauração só se pode comer no exterior");
                                        System.out.println("Teletrabalho obrigatório");
                                        break;

                                    default:
                                }
                            } else if (it <= 0.5) {
                                System.out.println("Não existe nenhum nível de risco");
                                System.out.println("\nPretende ver as medidas associadas a este nível de risco? (S/N)");
                                option2 = teclado.next().toUpperCase().charAt(0);
                                switch (option2) {
                                    case 'S':
                                        System.out.println("Não existem medidas para ajuntamentos em espaços públicos");
                                        System.out.println("Não existem medidas para a restauração");
                                        System.out.println("Não existem medidas para teletrabalho");
                                        break;

                                    default:
                                }
                            } else if (ic >= 240) {
                                System.out.println("Nível de risco é vermelho");
                                System.out.println("\nPretende ver as medidas associadas a este nível de risco? (S/N)");
                                option2 = teclado.next().toUpperCase().charAt(0);
                                switch (option2) {
                                    case 'S':
                                        System.out.println("Ajuntamentos de 6 ou menos pessoas são permitidos");
                                        System.out.println("Na restauração só se pode comer no exterior");
                                        System.out.println("Teletrabalho obrigatório");
                                        break;

                                    default:
                                }
                            } else {
                                System.out.println("Nível de risco desconhecido/erro");

                            }
                            ;
                            break;
                        default:

                    }
                    ;
                    break;
                default:

            }

            System.out.println("\nPretende reintroduzir dados? (S/N)");
            option3 = teclado.next().toUpperCase().charAt(0);

        }
        System.out.println("\nObrigado por usar o programa");
    }
}
