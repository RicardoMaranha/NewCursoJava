package AulasIniciais;

public class Condicional {
    public static void main(String[] args) {
        char sexo = 'M';

        if(sexo == 'F'){
            System.out.println("Sexo: Feminino" );
        } else if(sexo == 'M') {
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Valor inválido");
        }
    }
}