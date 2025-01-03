import javax.swing.*;

public class EntradaDados {
    public static void main(String[] args) {

        String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
        String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
        double carroNumero = Double.parseDouble(carros);
        double pessoasNumero = Double.parseDouble(pessoas);
        int divCarro = (int) (carroNumero / pessoasNumero);
        int restoCarro = (int) (carroNumero % pessoasNumero);

        JOptionPane.showMessageDialog(null,"Divisão de carrros para pessoas foram " + divCarro + " para cada pessoa, e sobrou  " + restoCarro + " carros." );





    }
}
