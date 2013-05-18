/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import fr.sciencesu.sns.hibernate.jpa.Association;


public class AssociationImpl extends Association {

    public AssociationImpl() 
    {
        
    }

    public AssociationImpl(String raisonSociale, String adresse, String codePostal, String ville, String telephone, String email) {
        super(raisonSociale, adresse, codePostal, ville, telephone, email);
    }
    
    public Association getAssociation()
    {
        return this;
    }
    
}
