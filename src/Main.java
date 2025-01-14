import Classes.Aluno;
import Classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    /*Variável Global*/
    static int idadeGlobal = 18;

    public static void main(String[] args) {
        /*Instaciar o aluno - Criar objeto na memoria do Java*/

        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        for(int ind = 0; ind<= 2; ind++) {
            Aluno aluno1 = new Aluno();
            /*aluno2.setNumeroCpf("12345678900");
            aluno1.setNumeroCpf("39539604826");
            aluno2.setIdade(4);
            aluno2.setDataNascimento("26/03/2020");*/
            String strNome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            /*String strIdade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
            String strDataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");*/

            aluno1.setNome(strNome);
            for (int i = 0; i < 2; i++) {
                Disciplina disciplina1 = new Disciplina();
                String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + (i + 1) + ": ");
                String strNota1 = JOptionPane.showInputDialog("Digite a 1° nota:");
                String strNota2 = JOptionPane.showInputDialog("Digite a 2° nota:");
                String strNota3 = JOptionPane.showInputDialog("Digite a 3° nota:");
                String strNota4 = JOptionPane.showInputDialog("Digite a 4° nota:");

                disciplina1.setDisciplina(nomeDisciplina);
                disciplina1.setNota1(Double.parseDouble(strNota1));
                disciplina1.setNota2(Double.parseDouble(strNota2));
                disciplina1.setNota3(Double.parseDouble(strNota3));
                disciplina1.setNota4(Double.parseDouble(strNota4));

                aluno1.getDisciplinasAluno().add(disciplina1);
            }

            listaAlunos.add(aluno1);

            /*aluno1.setIdade(Integer.parseInt(strIdade));
            aluno1.setDataNascimento(strDataNascimento);*/

            }
            for (Aluno aluno : listaAlunos){
                System.out.println(aluno.getNome());
                int i = 0;
                for (Disciplina disciplina : aluno.getDisciplinasAluno()){
                    System.out.println("Disciplina :"+aluno.getDisciplinasAluno().get(i).getDisciplina() + " Média: " + aluno.getDisciplinasAluno().get(i).getMedia());
                    i += 1;
                }
            }
        for (int pos=0; pos < listaAlunos.size(); pos++){
            Aluno aluno = listaAlunos.get(pos);
            if (aluno.getNome().equalsIgnoreCase("Ricardo")){
                listaAlunos.remove(pos);
            }
        }

        for(Aluno aluno : listaAlunos){
            System.out.println(aluno.getNome());
        }
        }

    }
