package com.example.BODEGASTCCAPI.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "zonas")
public class ZonaBodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_zona")
    private  Long idZona;
    @Column(name = "nombre_zona", nullable = false)
    private String nombreZona;
    @Column(name = "capacidad_maxima_volumen", nullable = false)
    private Double capacidadMaximaVolumen;
    @Column(name = "capacidad_maxima_peso", nullable = false)
    private Double capacidadMaximaPeso;
    @Column(name = "capacidad_volumen_ocupado", nullable = false)
    private Double capacidadVolumenOcupado;
    @Column(name = "capacidad_peso_ocupado", nullable = false)
    private Double capacidadPesoOcupado;

    public ZonaBodega() {
    }

    public ZonaBodega(Long idZona, String nombreZona, Double capacidadMaximaVolumen, Double capacidadMaximaPeso, Double capacidadVolumenOcupado, Double capacidadPesoOcupado) {
        this.idZona = idZona;
        this.nombreZona = nombreZona;
        this.capacidadMaximaVolumen = capacidadMaximaVolumen;
        this.capacidadMaximaPeso = capacidadMaximaPeso;
        this.capacidadVolumenOcupado = capacidadVolumenOcupado;
        this.capacidadPesoOcupado = capacidadPesoOcupado;
    }

    public Long getIdZona() {
        return idZona;
    }

    public void setIdZona(Long idZona) {
        this.idZona = idZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public Double getCapacidadMaximaVolumen() {
        return capacidadMaximaVolumen;
    }

    public void setCapacidadMaximaVolumen(Double capacidadMaximaVolumen) {
        this.capacidadMaximaVolumen = capacidadMaximaVolumen;
    }

    public Double getCapacidadMaximaPeso() {
        return capacidadMaximaPeso;
    }

    public void setCapacidadMaximaPeso(Double capacidadMaximaPeso) {
        this.capacidadMaximaPeso = capacidadMaximaPeso;
    }

    public Double getCapacidadVolumenOcupado() {
        return capacidadVolumenOcupado;
    }

    public void setCapacidadVolumenOcupado(Double capacidadVolumenOcupado) {
        this.capacidadVolumenOcupado = capacidadVolumenOcupado;
    }

    public Double getCapacidadPesoOcupado() {
        return capacidadPesoOcupado;
    }

    public void setCapacidadPesoOcupado(Double capacidadPesoOcupado) {
        this.capacidadPesoOcupado = capacidadPesoOcupado;
    }
}
