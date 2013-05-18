/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author antoi_000
 */
@javax.persistence.Entity
@Table(name = "sites_geo")
public class SiteGeographique implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sites_geo_id")
    private Integer id;
    
    @Column(name = "sites_geo_nom")
    private String nom;
    
    @Column(name = "sites_geo_pays")
    private String pays;
    
    @Column(name = "sites_geo_region")
    private String region;
    
    @Column(name = "sites_geo_dep")
    private String departement; 
    
    @OneToMany(mappedBy="siteGeo")
    Set<Domaine> domaines;
    
    @OneToMany(mappedBy="site")
    Set<Stock> stocks;
    
    

    public SiteGeographique() {
    }

    public SiteGeographique(String nom, String pays, String region, String departement) {
        this.nom = nom;
        this.pays = pays;
        this.region = region;
        this.departement = departement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Set<Domaine> getDomaines() {
        return domaines;
    }

    public void setDomaines(Set<Domaine> domaines) {
        this.domaines = domaines;
    }

    public Set<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }

    
    
    
    
}
