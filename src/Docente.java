import java.util.ArrayList;

public class Docente {

    private int idDocente;
    private String nomeDocecnte;
    private ArrayList<Turma> turma = new ArrayList<>();

    public static int contadorDocente = 3;

    public Docente() {
    }

    public Docente(int idDocente, String nomeDocecnte) {
        this.idDocente = idDocente;
        this.nomeDocecnte = nomeDocecnte;
    }

    public ArrayList<Turma> getTurma() {
        return turma;
    }

    public void setTurma(ArrayList<Turma> turma) {
        this.turma = turma;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNomeDocecnte() {
        return nomeDocecnte;
    }

    public void setNomeDocecnte(String nomeDocecnte) {
        this.nomeDocecnte = nomeDocecnte;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "idDocente=" + idDocente +
                ", nomeDocecnte='" + nomeDocecnte + '\'' +
                "}\n";
    }
}
