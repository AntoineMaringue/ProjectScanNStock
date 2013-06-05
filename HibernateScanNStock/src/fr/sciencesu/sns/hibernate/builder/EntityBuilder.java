/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.builder;

import fr.sciencesu.sns.hibernate.jpa.Association;
import fr.sciencesu.sns.hibernate.jpa.Produit;
import fr.sciencesu.sns.hibernate.jpa.Stock;
import fr.sciencesu.sns.hibernate.jpa.TypeAssociation;
import fr.sciencesu.sns.hibernate.jpa.TypeProduit;
import java.util.Calendar;

/**
 *
 * @author antoi_000
 */
public class EntityBuilder
{

    public Produit CreateProduit()
    {
        return new Produit();
    }
    
    public Produit CreateProduit(String nom, Double prix,String unite,Double contenance,String provenance)
    {
        return new Produit(nom, prix, unite, contenance, provenance);
    }
    public Produit CreateProduit(String nom, Double prix, Calendar ddp)
    {
        return new Produit(nom, prix, ddp);
    }

    public TypeAssociation CreateTypeAssociation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TypeProduit CreateTypeProduit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Stock CreateStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Association CreateAssociation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
