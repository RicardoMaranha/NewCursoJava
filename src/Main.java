import Classes.Aluno;

import javax.swing.*;


public class Main {
    /*Variável Global*/
    static int idadeGlobal = 18;

    public static void main(String[] args) {
        /*Instaciar o aluno - Criar objeto na memoria do Java*/
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ricardo");
        aluno1.setIdade(34);
        aluno1.setDataNascimento("12/12/1990");
        String strNota1 = JOptionPane.showInputDialog(null,"Digite a primeira nota");
        double dNota1 = Double.parseDouble(strNota1);
        String strNota2 = JOptionPane.showInputDialog(null,"Digite a segunda nota");
        double dNota2 = Double.parseDouble(strNota2);
        String strNota3 = JOptionPane.showInputDialog(null,"Digite a terceira nota");
        double dNota3 = Double.parseDouble(strNota3);
        String strNota4 = JOptionPane.showInputDialog(null,"Digite a quarta nota");
        double dNota4 = Double.parseDouble(strNota4);
        aluno1.setNota1(dNota1);
        aluno1.setNota2(dNota2);
        aluno1.setNota3(dNota3);
        aluno1.setNota4(dNota4);

        System.out.println("O nome é :" + aluno1.getNome());
        System.out.println(aluno1.getIdade() + " anos ");
        System.out.println("Data de nascimento: " + aluno1.getDataNascimento());
        JOptionPane.showMessageDialog(null,aluno1.getMediaNota());
        JOptionPane.showMessageDialog(null,aluno1.getAlunoAprovado() == 0 ? "Aprovado" : aluno1.getAlunoAprovado() == 1 ? "Recuperação" : "Reprovado");

    }
}