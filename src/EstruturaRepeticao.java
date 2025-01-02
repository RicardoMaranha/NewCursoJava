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

    }
}
