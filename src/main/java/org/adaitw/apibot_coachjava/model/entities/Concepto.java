package org.adaitw.apibot_coachjava.model.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Setter
@Getter
@Table(name = "concepto")
@Entity
public class Concepto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_concepto", nullable = false)
    private Long id_concepto;

    public Long getId_concepto(){
        return id_concepto;
    }

    public void setId_concepto(Long id_concepto) {
        this.id_concepto = id_concepto;
    }

    @Column(name = "nombre_concepto")
    private String nombre_concepto;

    public String getNombre_concepto() {
        return nombre_concepto;
    }

    public void setNombre_concepto(String nombre_concepto) {
        this.nombre_concepto = nombre_concepto;
    }
    @Column (name = "contenido_concepto")
    private String contenido_concepto;


    public void setContenido_concepto(String contenido_concepto) {
        this.contenido_concepto = contenido_concepto;
    }
    public String getContenido_concepto() {
        return contenido_concepto;
    }
    @Column (name = "numero_concepto",length = 100, nullable = false)
    private String numero_concepto;


    public String getNumero_concepto() {
        return numero_concepto;
    }

    public void setNumero_concepto(String numero_concepto) {
        this.numero_concepto = numero_concepto;
    }
    @Column (name = "id_capitulo",length = 100, nullable = false)
    private String id_capitulo;

    public String getId_capitulo() {
        return id_capitulo;
    }

    public void setId_capitulo(String id_capitulo) {
        this.id_capitulo = id_capitulo;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Concepto concepto = (Concepto) o;
        return id_concepto != null && Objects.equals(id_concepto, concepto.id_concepto)
                && Objects.equals(nombre_concepto, concepto.nombre_concepto)
                && Objects.equals(numero_concepto, concepto.numero_concepto)
                && Objects.equals(contenido_concepto, concepto.contenido_concepto)
                && Objects.equals(id_capitulo, concepto.id_capitulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_concepto,nombre_concepto,numero_concepto,contenido_concepto,id_capitulo);
    }

    @Override
    public String toString() {
        return "Concepto{" +
                "id_concepto=" + id_concepto +
                ", nombre_concepto='" + nombre_concepto + '\'' +
                ", contenido_concepto='" + contenido_concepto + '\'' +
                ", numero_concepto='" + numero_concepto + '\'' +
                ", id_capitulo='" + id_capitulo + '\'' +
                '}';
    }
}