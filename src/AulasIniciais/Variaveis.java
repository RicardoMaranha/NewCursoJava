package AulasIniciais;

public class Variaveis {

    public static void  main(String[] args){
        /*Tipo double, para numeros com ponto flutuante de alta precisão */
        double nota1 = 10;
        double nota2 = 8;
        double nota3 = 4;
        double nota4 = 8;
        double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua nota média é: " + mediaFinal);
        /*Tipo char - para apenas um character*/
        char sexo = 'M';

        System.out.println(sexo);

        if(sexo == 'F'){
            System.out.println("Sexo feminino!");
        }
        else if(sexo == 'M'){
            System.out.println("Sexo masculino!");
        }
        else{
            System.out.println("Valor inválido!");
        }

        /*Tipo String, para textos*/
               
    }
}
