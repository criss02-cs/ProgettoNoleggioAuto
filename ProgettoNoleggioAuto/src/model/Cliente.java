package model;

import java.util.Date;

public class Cliente {
    private Integer idCliente;
    private String nome;
    private String cognome;
    private Integer noleggioAlKm;
    private Date dataN;
    private Integer nPatente;

    public Cliente(Integer idCliente, String nome, String cognome, Integer noleggioAlKm, Date dataN, Integer nPatente) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.noleggioAlKm = noleggioAlKm;
        this.dataN = dataN;
        this.nPatente = nPatente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getNoleggioAlKm() {
        return noleggioAlKm;
    }

    public void setNoleggioAlKm(Integer noleggioAlKm) {
        this.noleggioAlKm = noleggioAlKm;
    }

    public Date getDataN() {
        return dataN;
    }

    public void setDataN(Date dataN) {
        this.dataN = dataN;
    }

    public Integer getnPatente() {
        return nPatente;
    }

    public void setnPatente(Integer nPatente) {
        this.nPatente = nPatente;
    }
}
