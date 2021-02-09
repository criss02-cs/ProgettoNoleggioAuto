package model;
public class Auto {
    private String targa;
    private String marca;
    private String modello;
    private Integer fkIdCategoria;
    private String nomeCategoria;

    public Auto(String targa, String marca, String modello, Integer fkIdCategoria, String nomeCategoria) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.fkIdCategoria = fkIdCategoria;
        this.nomeCategoria = nomeCategoria;
    }
    public Auto(String targa, String marca, String modello, Integer fkIdCategoria) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.fkIdCategoria = fkIdCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getFkIdCategoria() {
        return fkIdCategoria;
    }

    public void setFkIdCategoria(Integer fkIdCategoria) {
        this.fkIdCategoria = fkIdCategoria;
    }
}
