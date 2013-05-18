/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import fr.sciencesu.sns.hibernate.jpa.Domaine;


public class DomaineImpl extends Domaine {

    public DomaineImpl() {
    }

    public DomaineImpl(String nom) {
        super(nom);
    }
    
    public Domaine getDomaine()
    {
        return this;
    }
    
}
