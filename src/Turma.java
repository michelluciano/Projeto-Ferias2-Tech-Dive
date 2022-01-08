import java.util.ArrayList;
import java.util.Date;

public class Turma {

    private int id;
    private String nomeTurma;
    private int qtdAlunos;
    private String assunto;
    private String dataInicio;
    private Docente docente ;
    public static int contadorTurma = 3;

    public Turma() {
    }

    public Turma(int id, String nomeTurma, int qtdAlunos, String assunto, String dataInicio) {
        this.id = id;
        this.nomeTurma = nomeTurma;
        this.qtdAlunos = qtdAlunos;
        this.assunto = assunto;
        this.dataInicio = dataInicio;
    }

    public Turma(int id, String nomeTurma, int qtdAlunos, String assunto, String dataInicio, Docente docente) {
        this.id = id;
        this.nomeTurma = nomeTurma;
        this.qtdAlunos = qtdAlunos;
        this.assunto = assunto;
        this.dataInicio = dataInicio;
        this.docente = docente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", nomeTurma='" + nomeTurma + '\'' +
                ", qtdAlunos=" + qtdAlunos +
                ", assunto='" + assunto + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", docente=" + docente +
                "}\n";
    }
}
