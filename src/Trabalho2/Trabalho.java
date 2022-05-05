/*
Nuno Fernandes 21635
Pedro Andrade 21633

Trabalho nº2 PROGRAMAÇÃO
DWDM 1ºANO 21/22
*/

package Trabalho2;

import java.util.Locale;
import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horastotal[] = new int[7];
        int horasjogo1[] = new int[7];
        int horasjogo2[] = new int[7];
        String nomejogo1 = " ";
        String nomejogo2 = " ";
        String gamertag = " ";
        int limitetotal = 9, limitejogo1 = 9, limitejogo2 = 9, totaltudo = 0, total1 = 0, total2 = 0, a = 7, b = 7;
        char quero = 'F';
        System.out.println("Qual é a tua GamerTag");
        gamertag = teclado.nextLine();
        System.out.println("Qual o nome do jogo 1");
        nomejogo1 = teclado.nextLine();
        System.out.println("Qual o nome do jogo 2");
        nomejogo2 = teclado.nextLine();
        do {
            System.out.println("Pretende introduzir um limite personalizado de horas ou prefere o limite predefinido? S/N");
            quero = teclado.next().toUpperCase().charAt(0);
        } while (quero != 'N' && quero != 'S');
        if (quero == 'S') {
            System.out.println("Qual o limite total de horas que pretende impor?");
            limitetotal = teclado.nextInt();
            System.out.println("Qual o limite total de horas que pretende impor a jogar " + nomejogo1);
            limitejogo1 = teclado.nextInt();
            System.out.println("Qual o limite total de horas que pretende impor a jogar " + nomejogo2);
            limitejogo2 = teclado.nextInt();
        } else {
        }

        String dia[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo", " "};

        for (int i = 0; i <= 6; i++) {
            switch (i) {
                case 0, 1, 2, 3, 4:
                    System.out.println(gamertag + " quantas horas jogou " + nomejogo1 + " na " + dia[i]);
                    do {
                        horasjogo1[i] = teclado.nextInt();
                        if ((horasjogo1[i] < 0) || (horasjogo1[i] > 24)) {
                            System.out.println("Introduza os valores corretamente!");
                        }
                    } while ((horasjogo1[i] < 0) || (horasjogo1[i] > 24));
                    total1 += horasjogo1[i];
                    if (limitejogo1 <= total1 && a > i) {
                        a = i;
                    }

                    break;
                case 5, 6:
                    System.out.println(gamertag + " quantas horas jogou " + nomejogo1 + " no " + dia[i]);
                    do {
                        horasjogo1[i] = teclado.nextInt();
                        if ((horasjogo1[i] < 0) || (horasjogo1[i] > 24)) {
                            System.out.println("Introduza os valores corretamente!");
                        }
                    } while ((horasjogo1[i] < 0) || (horasjogo1[i] > 24));

                    total1 += horasjogo1[i];

                    if (limitejogo1 <= total1 && a > i) {
                        a = i;
                    }

                    ;
                    break;

            }
            for (int e = i; e <= 6; ) {
                switch (e) {
                    case 0, 1, 2, 3, 4:
                        System.out.println(gamertag + " quantas horas jogou " + nomejogo2 + " na " + dia[e]);
                        do {
                            horasjogo2[e] = teclado.nextInt();

                            total2 += horasjogo2[e];
                            if ((horasjogo2[e] < 0) || (horasjogo2[e] > 24)) {
                                System.out.println("Introduza os valores corretamente!");
                            }
                        } while ((horasjogo1[i] < 0) || (horasjogo1[i] > 24));
                        if (limitejogo2 <= total2 && b > e) {
                            b = e;
                        }

                        ;
                        break;
                    case 5, 6:
                        System.out.println(gamertag + " quantas horas jogou " + nomejogo2 + " no " + dia[e]);
                        do {
                            horasjogo2[e] = teclado.nextInt();
                            total2 += horasjogo2[e];
                            if ((horasjogo2[e] < 0) || (horasjogo2[e] > 24)) {
                                System.out.println("Introduza os valores corretamente!");
                            }
                        } while ((horasjogo1[i] < 0) || (horasjogo1[i] > 24));
                        if (limitejogo2 <= total2 && b > e) {
                            b = e;
                        }

                        ;
                        break;
                }
                horastotal[e] = horasjogo2[e] + horasjogo1[i];
                e = 7;

            }
        }


        totaltudo = total1 + total2;
        if (totaltudo >= (limitetotal * 1.3)) {
            System.out.println(gamertag + " " + "tu passaste o teu limite total semanal de horas de videojogos\n");
        } else {
        }
        if (total1 >= (limitejogo1 * 1.1)) {
            System.out.println(dia[a] + " " + gamertag + " " + "tu passaste o teu limite semanal de horas no " + nomejogo1 + "\n");
        } else {
        }
        if (total2 >= (limitejogo2 * 1.1)) {
            System.out.println(dia[b] + " " + gamertag + " " + "tu passaste o teu limite semanal de horas no " + nomejogo2 + "\n");

        }
        quero = 'F';
        do {
            System.out.println("Pretende consultar os dados sobre o " + gamertag + "? S/N");
            quero = teclado.next().toUpperCase().charAt(0);
        } while (quero != 'N' && quero != 'S');
        char quero4 = 'S';

        if (quero4 == 'S') {
            do {

                if (quero == 'S') {
                    char quero2 = 'F';
                    do {
                        System.out.println("Pretende consultar o numero de horas totais de um determinado jogo ou de ambos? S/N");
                        quero2 = teclado.next().toUpperCase().charAt(0);
                    } while (quero2 != 'N' && quero2 != 'S');
                    switch (quero2) {
                        case 'S':
                            System.out.println("Se pretende ver os dados do total de horas do " + nomejogo1 + " prima 1");
                            System.out.println("Se pretende ver os dados do total de horas do " + nomejogo2 + " prima 2");
                            System.out.println("Se pretende ver os dados do total de horas de ambos os jogos prima 3");
                            System.out.println("Se pretende ver TODOS os dados disponiveis prima 4");
                            System.out.println("Se pretende sair prima 5");
                            int quero3 = teclado.nextInt();
                            switch (quero3) {
                                case 1:
                                    System.out.println("Foram jogadas " + total1 + " horas de " + nomejogo1 + " num espaço de uma semana");
                                    break;
                                case 2:
                                    System.out.println("Foram jogadas " + total2 + " horas de " + nomejogo2 + " num espaço de uma semana");
                                    break;
                                case 3:
                                    System.out.println("Foram jogadas " + totaltudo + " horas num espaço de uma semana");
                                    break;
                                case 4:
                                    System.out.println("Foram jogadas " + total1 + " horas de " + nomejogo1 + " num espaço de uma semana");
                                    System.out.println("Foram jogadas " + total2 + " horas de " + nomejogo2 + " num espaço de uma semana");
                                    System.out.println("Foram jogadas " + totaltudo + " horas num espaço de uma semana");
                                    break;
                                case 5:
                                    ;
                                    break;
                                default:
                                    ;
                                    break;

                            }
                            ;
                            break;
                        case 'N':
                            ;
                            break;
                        default:
                            ;
                            break;

                    }


                    char quero5 = 'F';
                    do {
                        System.out.println("Pretende consultar o numero de horas jogadas num determinado dia da semana de um respetivo jogo ou ambos? S/N");
                        quero5 = teclado.next().toUpperCase().charAt(0);
                    } while (quero5 != 'N' && quero5 != 'S');
                    switch (quero5) {
                        case 'S':
                            System.out.println("Se pretende ver os dados em relação a um dia da semana insira o seu respetivo numero do dia semana");
                            int quero6 = teclado.nextInt();
                            switch (quero6) {
                                case 1:
                                    System.out.println(horastotal[0] + " Foram as horas jogadas no total" + " na " + dia[0]);
                                    System.out.println(horasjogo1[0] + " Foram as horas totais jogados de " + nomejogo1 + " na " + dia[0]);
                                    System.out.println(horasjogo2[0] + " Foram as horas totais jogados de " + nomejogo2 + " na " + dia[0]);
                                    break;

                                case 2:
                                    System.out.println(horastotal[1] + " Foram as horas jogadas no total" + " na " + dia[1]);
                                    System.out.println(horasjogo1[1] + " Foram as horas totais jogados de " + nomejogo1 + " na " + dia[1]);
                                    System.out.println(horasjogo2[1] + " Foram as horas totais jogados de " + nomejogo2 + " na " + dia[1]);
                                    break;

                                case 3:
                                    System.out.println(horastotal[2] + " Foram as horas jogadas no total" + " na " + dia[2]);
                                    System.out.println(horasjogo1[2] + " Foram as horas totais jogados de " + nomejogo1 + " na " + dia[2]);
                                    System.out.println(horasjogo2[2] + " Foram as horas totais jogados de " + nomejogo2 + " na " + dia[2]);
                                    break;
                                case 4:
                                    System.out.println(horastotal[3] + " Foram as horas jogadas no total" + " na " + dia[3]);
                                    System.out.println(horasjogo1[3] + " Foram as horas totais jogados de " + nomejogo1 + " na " + dia[3]);
                                    System.out.println(horasjogo2[3] + " Foram as horas totais jogados de " + nomejogo2 + " na " + dia[3]);
                                    break;
                                case 5:
                                    System.out.println(horastotal[4] + " Foram as horas jogadas no total" + " na " + dia[4]);
                                    System.out.println(horasjogo1[4] + " Foram as horas totais jogados de " + nomejogo1 + " na " + dia[4]);
                                    System.out.println(horasjogo2[4] + " Foram as horas totais jogados de " + nomejogo2 + " na " + dia[4]);
                                    break;
                                case 6:
                                    System.out.println(horastotal[5] + " Foram as horas jogadas no total" + " na " + dia[5]);
                                    System.out.println(horasjogo1[5] + " Foram as horas totais jogados de " + nomejogo1 + " na " + dia[5]);
                                    System.out.println(horasjogo2[5] + " Foram as horas totais jogados de " + nomejogo2 + " na " + dia[5]);
                                    break;
                                case 7:
                                    System.out.println(horastotal[6] + " Foram as horas jogadas no total" + " na " + dia[6]);
                                    System.out.println(horasjogo1[6] + " Foram as horas totais jogados de" + nomejogo1 + " na " + dia[6]);
                                    System.out.println(horasjogo2[6] + " Foram as horas totais jogados de" + nomejogo2 + " na " + dia[6]);
                                    break;
                            }
                        case 'N':
                            ;
                            break;
                        default:
                            ;
                            break;


                    }
                } else {
                }
                do {
                    System.out.println("Quer reconsultar os dados sobre o " + gamertag + "? S/N");
                    quero4 = teclado.next().toUpperCase().charAt(0);
                } while (quero4 != 'N' && quero != 'S');
            } while (quero4 == 'S');

        }

    }
}