import javax.swing.*;

public class Condicional {
    public static void main(String[] args) {
        char sexo = 'M';
        String nome = "Ricardo";
        double nota1 = 10;
        double nota2 = 10;
        double nota3 = 4;
        double nota4 = 4;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
    /*Exemplos de condicional if, else, else If*/
        if(sexo == 'F'){
            System.out.println("Sexo: Feminino" );
        } else if(sexo == 'M') {
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Valor inválido");
        }

        if(media >= 7 && nome.equals("Ricardo")){
            System.out.println("Aprovado");
        } else if(media >= 4 && media < 7 && nome.equals("Ricardo")){
            System.out.println("Recuperação");
        } else if (media < 4 && nome.equals("Ricardo")) {
            System.out.println("Reprovado");
        } else{
            System.out.println("Aluno não encontrado!");
        }

        /* Operadores Ternários*/
        System.out.println("Teste operador ternário:");
        String saidaResultado;
        /*Não recomendado para validações complexo, por deixar o código mais confuso*/

        saidaResultado = (media >= 7 && nome == "Ricardo") ? "Aprovado" : (media < 7 && media >= 4 && nome == "Ricardo") ? "Recuperação" : (media < 4 && nome == "Ricardo") ? "Reprovado" : "Aluno não encontrado" ;

        System.out.println(saidaResultado);

        /*Condições Aninhadas*/
        System.out.println("Condições aninhadas: ");
        if(nome == "Ricardo"){
            System.out.println("Aluno Ricardo encontrado");
            if(media >= 7){
                System.out.println("Aluno Aprovado");
            } else if (media < 7 && media <= 4 ){
                System.out.println("Aluno em Recuperação");
            } else {
                System.out.println("Aluno Reprovado");
            }
        } else{
            System.out.println("Aluno não encontrado!");
        }

        int dia = 7;
        /*Switch Case*/
        System.out.println("Teste switch case");

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Dia útil");
                break;
        }

        /*Operadores relacionais*/

        if(nota1 == nota2){
            System.out.println("As notas 1 e 2 são iguais:");
        }
        if(nota1 != nota2){
            System.out.println("As notas 1 e 2 são diferentes");
            if(nota1 > nota2){
                System.out.println("A nota 1 é maior que a nota 2");
            }else{
                System.out.println(("nota 1 é menor que a nota 2"));
            }

        }
    }
}
