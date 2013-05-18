/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import fr.sciencesu.sns.hibernate.jpa.TypeProduit;


public class TypeProduitImpl extends TypeProduit {

    public TypeProduitImpl() {
    }

    public TypeProduitImpl(String nom) {
        super(nom);
    }
    
    public TypeProduit getTypeProduit()
    {
        return this;
    }
    
}
