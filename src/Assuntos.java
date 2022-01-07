public class Assuntos {

    private Turma turma;
    private int idAssunto;
    private String descAssunto;
    public static int contadorTransacoes = 0;

    public Assuntos() {
    }

    public Assuntos(Turma turma, int idAssunto, String descAssunto) {
        this.turma = turma;
        this.idAssunto = idAssunto;
        this.descAssunto = descAssunto;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getIdAssunto() {
        return idAssunto;
    }

    public void setIdAssunto(int idAssunto) {
        this.idAssunto = idAssunto;
    }

    public String getDescAssunto() {
        return descAssunto;
    }

    public void setDescAssunto(String descAssunto) {
        this.descAssunto = descAssunto;
    }
}
