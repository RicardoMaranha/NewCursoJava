import javax.swing.*;

public class CalculoMedia {
    public static void main(String[] args) {
        String nota1 = JOptionPane.showInputDialog("Digite a nota 1: ");
        String nota2 = JOptionPane.showInputDialog("Digite a nota 2: ");
        String nota3 = JOptionPane.showInputDialog("Digite a nota 3: ");
        String nota4 = JOptionPane.showInputDialog("Digite a nota 4: ");

        double dnota1 = Double.parseDouble(nota1);
        double dnota2 = Double.parseDouble(nota2);
        double dnota3 = Double.parseDouble(nota3);
        double dnota4 = Double.parseDouble(nota4);

        double media = (dnota1+dnota2+dnota3+dnota4) / 4;

        JOptionPane.showMessageDialog(null,"A média é: " + media);

        if(media >= 7){
            JOptionPane.showMessageDialog(null,"O Aluno está aprovado!");
        } else if (media < 7 && media >= 5) {
            JOptionPane.showMessageDialog(null,"O aluno está de recuperação!");
        } else {
            JOptionPane.showMessageDialog(null,"O aluno está reprovado!");
        }
    }
}
