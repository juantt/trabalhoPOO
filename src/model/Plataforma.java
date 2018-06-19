/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ReturnOfPc
 */
public class Plataforma {
    private Integer codPlat;
    private String nomePlat;
    private String detalhePlat;

    public Integer getCodPlat() {
        return codPlat;
    }

    public void setCodPlat(Integer codPlat) {
        this.codPlat = codPlat;
    }

    public String getNomePlat() {
        return nomePlat;
    }

    public void setNomePlat(String nomePlat) {
        this.nomePlat = nomePlat;
    }

    public String getDetalhePlat() {
        return detalhePlat;
    }

    public void setDetalhePlat(String detalhePlat) {
        this.detalhePlat = detalhePlat;
    }
}
