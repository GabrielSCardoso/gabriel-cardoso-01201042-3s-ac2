package com.bandtec.ac2.lutadorAc2.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Lutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min = 5, max = 12)
    private String nome;
    private double forcaGolpe = 0;
    private double vida = 100;
    private Integer concetracoesRealizadas = 0;
    private boolean vivo = true;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public Integer getConcetracoesRealizadas() {
        return concetracoesRealizadas;
    }

    public void setConcetracoesRealizadas(Integer concetracoesRealizadas) {
        this.concetracoesRealizadas = concetracoesRealizadas;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

}
