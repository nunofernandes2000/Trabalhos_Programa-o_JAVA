/*
Nuno Fernandes 21635
Pedro Andrade 21633

Trabalho nº3 PROGRAMAÇÃO
DWDM 1ºANO 21/22
*/

package Trabalho3;

public class Pessoa {
    private String nome;
    private char genero;
    private int anonascimento;
    private String apelido;

    public Pessoa() {
        nome = "Gervásio";
        apelido = "Anastácio";
        anonascimento = 2001;
        genero = 'M';
    }

    public Pessoa(String nome, String apelido, int anonascimento, char genero) {
        setNome(nome);
        setApelido(apelido);
        setAnonascimento(anonascimento);
        setGenero(genero);


    }

    private void setGenero(char genero) {
        if (genero == 'M' || genero == 'F') {
            this.genero = genero;
        } else {
        }
    }

    private void setAnonascimento(int anonascimento) {
        if (anonascimento > 1900 && anonascimento < 2018) {
            this.anonascimento = anonascimento;
        } else {
            System.out.println("erro");
        }
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public char getGenero() {
        return genero;
    }

    public int getaonascimento() {
        return anonascimento;
    }

    public String getnome() {
        return nome;
    }

    public String getapelido() {
        return apelido;
    }

    public int calculaIdade(int anonascimento) {
        int ano = 2022;
        int idadeatual = ano - anonascimento;
        return idadeatual;
    }

    public String toString() {
        if (genero == 'M' && 2022 > anonascimento) {
            return "Esta pessoa chama-se " + nome + " " + apelido + " nasceu a " + anonascimento + " e é do género Masculino";
        } else if (genero == 'F') {
            return "Esta pessoa chama-se " + nome + " " + apelido + " nasceu a " + anonascimento + " e é do género Feminino";
        } else
            return "Inseriu os dados de forma errada";
    }
}
