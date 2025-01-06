import Classes.Aluno;
import Classes.Disciplina;

import javax.swing.*;


public class Main {
    /*Variável Global*/
    static int idadeGlobal = 18;

    public static void main(String[] args) {
        /*Instaciar o aluno - Criar objeto na memoria do Java*/
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Cecília");
        aluno2.setNumeroCpf("12345678900");
        aluno1.setNumeroCpf("39539604826");
        aluno2.setIdade(4);
        aluno2.setDataNascimento("26/03/2020");
        String strNome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        String strIdade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
        String strDataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
        String strDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
        String strNota1 = JOptionPane.showInputDialog(null,"Digite a primeira nota");
        String strNota2 = JOptionPane.showInputDialog(null,"Digite a segunda nota");
        String strNota3 = JOptionPane.showInputDialog(null,"Digite a terceira nota");
        String strNota4 = JOptionPane.showInputDialog(null,"Digite a quarta nota");
        aluno1.setNome(strNome);
        aluno1.setIdade(Integer.parseInt(strIdade));
        aluno1.setDataNascimento(strDataNascimento);

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina(strDisciplina);
        disciplina1.setNota1(Double.parseDouble(strNota1));
        disciplina1.setNota2(Double.parseDouble(strNota2));
        disciplina1.setNota3(Double.parseDouble(strNota3));
        disciplina1.setNota4(Double.parseDouble(strNota4));

        aluno1.getDisciplinasAluno().add(disciplina1);


        JOptionPane.showMessageDialog(null,aluno1.getDisciplinaMedia());
        JOptionPane.showMessageDialog(null,aluno1.getMediaNota());
        JOptionPane.showMessageDialog(null,aluno1.getAlunoAprovado() == 0 ? "Aprovado" : aluno1.getAlunoAprovado() == 1 ? "Recuperação" : "Reprovado");
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());

        if(aluno1.equals(aluno2)){
            System.out.println("Aluno é o mesmo");
        } else {
            System.out.println("Aluno diferente");
        }
    }
}