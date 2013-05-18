/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import fr.sciencesu.sns.hibernate.jpa.Stock;


public class StockImpl extends Stock {

    public StockImpl() {
    }

    public StockImpl(String nom, Long superficie) {
        super(nom, superficie);
    }
    
    public Stock getStock()
    {
        return this;
    }
    
}
