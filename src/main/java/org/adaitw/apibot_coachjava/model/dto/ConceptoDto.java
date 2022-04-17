package org.adaitw.apibot_coachjava.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConceptoDto {
    private long id_concepto;
    private String nombre_concepto;
    private int numero_concepto;
    private int id_capitulo;

    public long getId_concepto() {
        return id_concepto;
    }

    public void setId_concepto(long id_concepto) {
        this.id_concepto = id_concepto;
    }

    public String getNombre_concepto() {
        return nombre_concepto;
    }

    public void setNombre_concepto(String nombre_concepto) {
        this.nombre_concepto = nombre_concepto;
    }

    public int getNumero_concepto() {
        return numero_concepto;
    }

    public void setNumero_concepto(int numero_concepto) {
        this.numero_concepto = numero_concepto;
    }

    public int getId_capitulo() {
        return id_capitulo;
    }

    public void setId_capitulo(int id_capitulo) {
        this.id_capitulo = id_capitulo;
    }
}
