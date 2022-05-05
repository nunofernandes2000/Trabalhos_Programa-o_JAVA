/*
Nuno Fernandes 21635
Pedro Andrade 21633

Trabalho nº3 PROGRAMAÇÃO
DWDM 1ºANO 21/22

*/

package Trabalho3;

public class Aluno extends Pessoa {
    private int numaluno;
    private char codigocurso;
    private boolean bolseiro;
    private int anomatricula;

    public Aluno() {
        numaluno = 69420;
        codigocurso = 'M';
        bolseiro = false;
        anomatricula = 2021;
    }

    public Aluno(String nome, String apelido, char genero, int anonascimento, int numaluno, char codigcurso, boolean bolseiro, int anomatricula) {
        super(nome, apelido, anonascimento, genero);
        setnumaluno(numaluno);
        setanomatricula(anomatricula);
        setbolseiro(bolseiro);
        setcodigocurso(codigcurso);
    }

    public int getnumAluno() {
        return numaluno;
    }

    public char getcodigocurso() {
        return codigocurso;
    }

    public boolean getbolseiro() {
        return bolseiro;
    }

    public int getanomatricula() {
        return anomatricula;
    }

    private void setnumaluno(int numAluno) {
        this.numaluno = numAluno;
    }

    private void setcodigocurso(char codigoCurso) {
        if (codigoCurso == 'T' || codigoCurso == 'L' || codigoCurso == 'M') {
            this.codigocurso = codigoCurso;
        } else {

        }
    }

    private void setbolseiro(boolean bolseiro) {
        this.bolseiro = bolseiro;
    }

    private void setanomatricula(int anoMatricula) {
        if (anoMatricula >= 1999) {
            this.anomatricula = anoMatricula;
        } else {
        }
    }

    public void alteraAluno(char p_codigocurso, boolean p_bolseiro) {
        this.codigocurso = p_codigocurso;
        this.bolseiro = p_bolseiro;
    }

    public String toString() {
        if (bolseiro == true && codigocurso == 'T' && getGenero() == 'M') {
            return "O aluno nº " + numaluno + " é bolseiro e pretence ao um CTESP, tendo este feito a matrícula em " + anomatricula;
        } else if (bolseiro == true && codigocurso == 'L') {
            return "O aluno nº " + numaluno + " é bolseiro e pretence a uma Licenciatura, tendo este feito a matrícula em " + anomatricula;
        } else if (bolseiro == true && codigocurso == 'M') {
            return "O aluno nº " + numaluno + " é bolseiro e pretence a um Mestrado, tendo este feito a matrícula em " + anomatricula;
        } else if (bolseiro == false && codigocurso == 'T') {
            return "O aluno nº " + numaluno + " não é bolseiro e pretence ao um CTESP, tendo este feito a matrícula em " + anomatricula;
        } else if (bolseiro == false && codigocurso == 'L') {
            return "O aluno nº " + numaluno + " não é bolseiro e pretence a uma Licenciatura, tendo este feito a matrícula em " + anomatricula;
        } else if (bolseiro == false && codigocurso == 'M') {
            return "O aluno nº " + numaluno + " não é bolseiro e pretence a um Mestrado, tendo este feito a matrícula em " + anomatricula;
        } else {
            return "Erro na Atribuição de curso";
        }
    }


}
