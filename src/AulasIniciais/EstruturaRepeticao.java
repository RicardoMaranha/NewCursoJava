package AulasIniciais;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        /*While e Do While*/
        int numero = 0;
        while (numero <= 10) {
            System.out.println("Numero: " + numero);
            numero++;
        }
        System.out.println("******************");
        System.out.println("Usando Do While!!!");
        System.out.println("******************");
        do{
            System.out.println("Numero: " + numero);
            numero--;
        } while (numero >= 0);
        System.out.println(numero);

        /* for */

        for(int i=0; i<=10; i++){
            System.out.println("Indice: " + i);
        }

        /* for + break */
        int numeroBusca = 1;
        System.out.println("Numero de busca: " + numeroBusca);
        for(int i = 10; i >= 0; i--){
            System.out.println("Indice: " + i);
            if(i == numeroBusca){
                System.out.println("Encontrei o numero: " + numeroBusca);
                System.out.println("Estou parando de executar");
                break;
            }
        }

        /* for + continue */
        System.out.println("for + continue: ");
        for(int i = 0; i<= 10; i++){
            System.out.println("Indice: " + i);
            if (i == 5 || i == 8 || i == 10){
                System.out.println("Encontrei o numero: " + i);
                continue;
            }
        }
    }
}
