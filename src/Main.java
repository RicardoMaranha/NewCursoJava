import Classes.Aluno;

import javax.swing.*;


public class Main {
    /*Variável Global*/
    static int idadeGlobal = 18;

    public static void main(String[] args) {
        /*Instaciar o aluno - Criar objeto na memoria do Java*/
        Aluno aluno1 = new Aluno();
        String strNome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        String strIdade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
        String strDataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
        String strNota1 = JOptionPane.showInputDialog(null,"Digite a primeira nota");
        String strNota2 = JOptionPane.showInputDialog(null,"Digite a segunda nota");
        String strNota3 = JOptionPane.showInputDialog(null,"Digite a terceira nota");
        String strNota4 = JOptionPane.showInputDialog(null,"Digite a quarta nota");
        aluno1.setNome(strNome);
        aluno1.setIdade(Integer.parseInt(strIdade));
        aluno1.setDataNascimento(strDataNascimento);
        aluno1.setNota1(Double.parseDouble(strNota1));
        aluno1.setNota2(Double.parseDouble(strNota2));
        aluno1.setNota3(Double.parseDouble(strNota3));
        aluno1.setNota4(Double.parseDouble(strNota4));

        System.out.println("O nome é :" + aluno1.getNome());
        System.out.println(aluno1.getIdade() + " anos ");
        System.out.println("Data de nascimento: " + aluno1.getDataNascimento());
        JOptionPane.showMessageDialog(null,aluno1.getMediaNota());
        JOptionPane.showMessageDialog(null,aluno1.getAlunoAprovado() == 0 ? "Aprovado" : aluno1.getAlunoAprovado() == 1 ? "Recuperação" : "Reprovado");

    }
}