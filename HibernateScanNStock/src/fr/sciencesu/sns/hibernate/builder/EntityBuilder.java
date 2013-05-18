/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.builder;

import fr.sciencesu.sns.hibernate.jpa.StockImpl;
import fr.sciencesu.sns.hibernate.jpa.TypeAssociationImpl;
import fr.sciencesu.sns.hibernate.jpa.AssociationImpl;
import fr.sciencesu.sns.hibernate.jpa.DomaineImpl;
import fr.sciencesu.sns.hibernate.jpa.ProduitImpl;
import fr.sciencesu.sns.hibernate.jpa.TypeProduitImpl;
import fr.sciencesu.sns.hibernate.jpa.SiteGeographiqueImpl;
import fr.sciencesu.sns.hibernate.jpa.Produit;
import java.util.Calendar;

/**
 *
 * @author antoi_000
 */
public class EntityBuilder
{

    public ProduitImpl CreateProduit()
    {
        return new ProduitImpl();
    }
    
    public ProduitImpl CreateProduit(String nom, Double prix,String unite,Double contenance,String provenance)
    {
        return new ProduitImpl(nom, prix, unite, contenance, provenance);
    }
    public ProduitImpl CreateProduit(String nom, Double prix, Calendar ddp)
    {
        return new ProduitImpl(nom, prix, ddp);
    }

    public SiteGeographiqueImpl CreateSiteGeo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TypeAssociationImpl CreateTypeAssociation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TypeProduitImpl CreateTypeProduit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public StockImpl CreateStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AssociationImpl CreateAssociation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DomaineImpl CreateDomaine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
