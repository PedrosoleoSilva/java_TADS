package TDE06;

public class Materia {
    private int id;
    private String nmMateria;
    private String linguagem;

    public Materia(int id, String nmMateria, String linguagem) {
        this.id = id;
        this.nmMateria = nmMateria;
        this.linguagem = linguagem;
    }

    public String getNmMateria() {
        return nmMateria;
    }

    public void setNmMateria(String nmMateria) {
        this.nmMateria = nmMateria;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", nmMateria='" + nmMateria + '\'' +
                ", linguagem='" + linguagem + '\'' +
                '}';
    }
}
