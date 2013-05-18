/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import fr.sciencesu.sns.hibernate.jpa.Produit;
import java.util.Calendar;


public class ProduitImpl extends Produit {

    public ProduitImpl() 
    {
    }

    public ProduitImpl(String nom, Double prix, String unite, Double contenance, String provenance) {
        super(nom, prix, unite, contenance, provenance);
    }

    public ProduitImpl(String nom, Double prix, Calendar ddp) {
        super(nom, prix, ddp);
    }
    
    public Produit getProduit()
    {
        return this;
    }
    
}
