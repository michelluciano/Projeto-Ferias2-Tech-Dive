import java.util.ArrayList;

public class Docente {

    private int idDocente;
    private String nomeDocecnte;
    private ArrayList<Turma> turmaDocente = new ArrayList<>();
    public static int contadorDocente = 3;

    public Docente() {
    }

    public Docente(int idDocente, String nomeDocecnte) {
        this.idDocente = idDocente;
        this.nomeDocecnte = nomeDocecnte;
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

    public ArrayList<Turma> getTurmaDocente() {
        return turmaDocente;
    }

    public void setTurmaDocente(ArrayList<Turma> turmaDocente) {
        this.turmaDocente = turmaDocente;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "idDocente=" + idDocente +
                ", nomeDocecnte='" + nomeDocecnte + '\'' +
                ", turmaDocente=" + turmaDocente +
                "}\n";
    }
}
