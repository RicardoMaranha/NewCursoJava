import Classes.Aluno;


public class Main {
    /*Variável Global*/
    static int idadeGlobal = 18;

    public static void main(String[] args) {
        /*Instaciar o aluno - Criar objeto na memoria do Java*/
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ricardo");
        aluno1.setIdade(34);
        aluno1.setDataNascimento("12/12/1990");
        aluno1.setNota1(2);
        aluno1.setNota2(10);
        aluno1.setNota3(8);
        aluno1.setNota4(7);

        System.out.println("O nome é :" + aluno1.getNome());
        System.out.println(aluno1.getIdade() + " anos ");
        System.out.println("Data de nascimento: " + aluno1.getDataNascimento());
        System.out.println(aluno1.getMediaNota());

    }
}