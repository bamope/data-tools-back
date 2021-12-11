package com.trasnporte.company.demo.datajpa;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdEmpresa")
    private long IdEmpresa;

    @Column(name = "TipEmpresa")
    private long TipEmpresa;

    @Column(name = "NitEmpresa")
    private long NitEmpresa;

    @Column(name = "NomEmpresa")
    private String NomEmpresa;

    @Column(name = "DirEmpresa")
    private String DirEmpresa;

    @Column(name = "CodCiudad")
    private long CodCiudad;

    @Column(name = "CodDepartamento")
    private long CodDepartamento;

    @Column(name = "CodPais")
    private long CodPais;

    @Column(name = "TelEmpresa")
    private long TelEmpresa;

    public Company() {
    }

    public long getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(long IdEmpresa) {
        this.IdEmpresa = IdEmpresa;
    }

    public long getTipEmpresa() {
        return TipEmpresa;
    }

    public void setTipEmpresa(long TipEmpresa) {
        this.TipEmpresa = TipEmpresa;
    }

    public long getNitEmpresa() {
        return NitEmpresa;
    }

    public void setNitEmpresa(long NitEmpresa) {
        this.NitEmpresa = NitEmpresa;
    }

    public String getNomEmpresa() {
        return NomEmpresa;
    }

    public void setNomEmpresa(String NomEmpresa) {
        this.NomEmpresa = NomEmpresa;
    }

    public String getDirEmpresa() {
        return DirEmpresa;
    }

    public void setDirEmpresa(String DirEmpresa) {
        this.DirEmpresa = DirEmpresa;
    }

    public long getCodCiudad() {
        return CodCiudad;
    }

    public void setCodCiudad(long CodCiudad) {
        this.CodCiudad = CodCiudad;
    }

    public long getCodDepartamento() {
        return CodDepartamento;
    }

    public void setCodDepartamento(long CodDepartamento) {
        this.CodDepartamento = CodDepartamento;
    }

    public long getCodPais() {
        return CodPais;
    }

    public void setCodPais(long CodPais) {
        this.CodPais = CodPais;
    }

    public long getTelEmpresa() {
        return TelEmpresa;
    }

    public void setTelEmpresa(long TelEmpresa) {
        this.TelEmpresa = TelEmpresa;
    }

    public Company(long TipEmpresa, long NitEmpresa, String NomEmpresa, String DirEmpresa, long CodCiudad, long CodDepartamento, long CodPais, long TelEmpresa) {
        this.TipEmpresa = TipEmpresa;
        this.NitEmpresa = NitEmpresa;
        this.NomEmpresa = NomEmpresa;
        this.DirEmpresa = DirEmpresa;
        this.CodCiudad = CodCiudad;
        this.CodDepartamento = CodDepartamento;
        this.CodPais = CodPais;
        this.TelEmpresa = TelEmpresa;
    }    

    @Override
    public String toString() {
        return "Company{" + "IdEmpresa=" + IdEmpresa + ", TipEmpresa=" + TipEmpresa + ", NitEmpresa=" + NitEmpresa + ", NomEmpresa=" + NomEmpresa + ", DirEmpresa=" + DirEmpresa + ", CodCiudad=" + CodCiudad + ", CodDepartamento=" + CodDepartamento + ", CodPais=" + CodPais + ", TelEmpresa=" + TelEmpresa + '}';
    }

}
