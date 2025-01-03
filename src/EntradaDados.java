import javax.swing.*;

public class EntradaDados {
    public static void main(String[] args) {

        String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
        String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
        double carroNumero = Double.parseDouble(carros);
        double pessoasNumero = Double.parseDouble(pessoas);
        int divCarro = (int) (carroNumero / pessoasNumero);
        int restoCarro = (int) (carroNumero % pessoasNumero);

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver a divisão?");
        System.out.println(resposta);

        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "Divisão de carrros para pessoas foram " + divCarro + " para cada pessoa, e sobrou  " + restoCarro + " carros.");
        } else if (resposta == 1) {
            JOptionPane.showMessageDialog(null, "Programa encerrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Programa cancelado!");
        }
    }
}
