/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import fr.sciencesu.sns.hibernate.jpa.SiteGeographique;


public class SiteGeographiqueImpl extends SiteGeographique {

    public SiteGeographiqueImpl() {
    }

    public SiteGeographiqueImpl(String nom, String pays, String region, String departement) {
        super(nom, pays, region, departement);
    }
    
    public SiteGeographique getSiteGeo()
    {
        return this;
    }
    
}
