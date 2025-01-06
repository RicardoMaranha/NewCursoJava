package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* Classe para representar aluno */
public class Aluno {

        private String nome;
        private int idade;
        private String dataNascimento;
        private String registroGeral;
        private String numeroCpf;
        private String nomeMae;
        private String nomePai;
        private String dataMatricula;
        private String nomeEscola;
        private String serieMatriculado;

        private List<Disciplina> disciplinasAluno = new ArrayList<Disciplina>();

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public String getDataNascimento() {
                return dataNascimento;
        }

        public void setDataNascimento(String dataNascimento) {
                this.dataNascimento = dataNascimento;
        }

        public String getRegistroGeral() {
                return registroGeral;
        }

        public void setRegistroGeral(String registroGeral) {
                this.registroGeral = registroGeral;
        }

        public String getNumeroCpf() {
                return numeroCpf;
        }

        public void setNumeroCpf(String numeroCpf) {
                this.numeroCpf = numeroCpf;
        }

        public String getNomeMae() {
                return nomeMae;
        }

        public void setNomeMae(String nomeMae) {
                this.nomeMae = nomeMae;
        }

        public String getNomePai() {
                return nomePai;
        }

        public void setNomePai(String nomePai) {
                this.nomePai = nomePai;
        }

        public String getDataMatricula() {
                return dataMatricula;
        }

        public void setDataMatricula(String dataMatricula) {
                this.dataMatricula = dataMatricula;
        }

        public String getNomeEscola() {
                return nomeEscola;
        }

        public void setNomeEscola(String nomeEscola) {
                this.nomeEscola = nomeEscola;
        }

        public String getSerieMatriculado() {
                return serieMatriculado;
        }

        public void setSerieMatriculado(String serieMatriculado) {
                this.serieMatriculado = serieMatriculado;
        }

        public List<Disciplina> getDisciplinasAluno() {
                return disciplinasAluno;
        }

        public void setDisciplinasAluno(List<Disciplina> disciplinasAluno) {
                this.disciplinasAluno = disciplinasAluno;
        }

        public double getMediaNota() {

                double media = 0.0;

                for (Disciplina disciplina : disciplinasAluno){
                        media = (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
                }

                return  media ;
        }

        public int getAlunoAprovado() {
                if(getMediaNota() >= 7){
                        return 0; /*Aprovado*/
                } else if (getMediaNota() < 7 && getMediaNota() >= 4) {
                        return 1; /*Recuperação*/
                } else {
                        return 2; /*Reprovado*/
                }
        }

        public  String getDisciplinaMedia(){
                String nomeDisciplina = "";
                String media = "";
                for (Disciplina disciplina : disciplinasAluno){
                        nomeDisciplina = disciplina.getDisciplina();
                }
                return nomeDisciplina;
        }


        @Override
        public String toString() {
                return "Aluno{" +
                        "nome='" + nome + '\'' +
                        ", idade=" + idade +
                        ", dataNascimento='" + dataNascimento + '\'' +
                        ", registroGeral='" + registroGeral + '\'' +
                        ", numeroCpf='" + numeroCpf + '\'' +
                        ", nomeMae='" + nomeMae + '\'' +
                        ", nomePai='" + nomePai + '\'' +
                        ", dataMatricula='" + dataMatricula + '\'' +
                        ", nomeEscola='" + nomeEscola + '\'' +
                        ", serieMatriculado='" + serieMatriculado + '\'' +
                        ", disciplinasAluno=" + disciplinasAluno +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;
                Aluno aluno = (Aluno) o;
                return Objects.equals(numeroCpf, aluno.numeroCpf);
        }

        @Override
        public int hashCode() {
                return Objects.hashCode(numeroCpf);
        }
}
