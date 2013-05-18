/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import fr.sciencesu.sns.hibernate.jpa.TypeAssociation;


public class TypeAssociationImpl extends TypeAssociation {

    public TypeAssociationImpl() {
    }

    public TypeAssociationImpl(String name) {
        super(name);
    }
    
    public TypeAssociation getTypeAssociation()
    {
        return this;
    }
    
}
