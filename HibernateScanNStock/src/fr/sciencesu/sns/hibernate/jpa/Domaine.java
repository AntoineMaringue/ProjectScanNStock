/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author antoi_000
 */
@javax.persistence.Entity
@Table(name = "domaines")
public class Domaine implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "domaines_id")        
    private Integer id;
    
    @Column(name = "domaines_nom")
    private String nom;
    
    //@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    //@JoinColumn(name="domaineId")
    @OneToMany(mappedBy="domaineId")
    Set<Association> associations;
    
    @OneToOne
    private SiteGeographique siteGeo;

    public Domaine() 
    {
        
    }

    public Domaine(String nom) 
    {
        this.nom = nom;
    }
    
    @Override
    public String toString()
    {
        return "";
    } 

    //Getters / Setters
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

    public Set<Association> getAssociations() {
        return associations;
    }

    public void setAssociations(Set<Association> associations) {
        this.associations = associations;
    }

    public SiteGeographique getSiteGeo() {
        return siteGeo;
    }

    public void setSiteGeo(SiteGeographique siteGeo) {
        this.siteGeo = siteGeo;
    }
    
}
