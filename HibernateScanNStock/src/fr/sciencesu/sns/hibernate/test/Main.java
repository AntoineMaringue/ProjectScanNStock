/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.test;

import fr.sciencesu.sns.hibernate.jpa.Association;
import fr.sciencesu.sns.hibernate.jpa.TypeAssociation;
import static fr.sciencesu.sns.hibernate.test.BDD.print;
import fr.sciencesu.sns.hibernate.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author antoi_000
 */
public class Main 
{
    
    private static Session session = null;
    
    public static void main(String[] args)
    {
        BDD.connection();
        
        BDD.Create("name1", "pays1", "region1", "dep1");
        BDD.Create("name2", "pays1", "region1", "dep1");
        BDD.Create("name3", "pays1", "region1", "dep1");
        BDD.Create("name4", "pays1", "region1", "dep1");
        
        System.out.println(BDD.ReadSites("SiteGeographique"));
        //testCreateAssociation();
        //testReadAssociation("1");
        BDD.deconnection();
    }
    
    /**
     * CREATE
     */
    public static void testCreateAssociation()
    {
         //Création des objets à rendre persistants
      Association a = new Association("Raison sociale", "adresse", "71160", "Digoin", "00 00 00 00 00", "");
      TypeAssociation ta = new TypeAssociation("Type association");
      
      Set<TypeAssociation> sta = new HashSet<>();
      
      sta.add(ta);
      
        // Association entre Event et Address
      a.setTypes(sta);
 
      // Enregistrements
      Transaction tx = session.beginTransaction();
      
      session.save(ta);
      session.save(a);
      
      session.flush();
      
      tx.commit();
      
      //Affichage de la table
      printAssociation();
      printTypeAssociation();
    }
    
    /**
     * READ
     */
    public static void testReadAssociation(String id)
    {
     // Récupération de l'Event d'après son titre
        Query q = session.createQuery("from Association where associations_id= :id");
        q.setString("id", id);
        Association e = (Association) q.uniqueResult();

        // Affichage de l'objet récupéré
        System.out.println(e.toString());   
    }
    
    /**
     * UPDATE
     */
    
    /**
     * DELETE
     */
    
    public static void connection()
    {
        //Ouverture d'une session
        session = HibernateUtil.getSession();        
        
    }
    
    public static void deconnection()
    {
        //fermeture de la session
        session.close();
    }
    
    public static void printAssociation()
    {
        System.out.println("[Association]");
        
        String hql = "from Association";
        Query q = session.createQuery(hql);
        
        ArrayList<Association> dataTable = (ArrayList) q.list();
        
        for (Association assoc : dataTable) 
        {
            System.out.println(assoc.toString());
        }
    }
    
    public static void printTypeAssociation()
    {
        System.out.println("[Type Association]");
        
        String hql = "from TypeAssociation";
        Query q = session.createQuery(hql);
        
        ArrayList<TypeAssociation> dataTable = (ArrayList) q.list();
        
        for (TypeAssociation tassoc : dataTable) 
        {
            System.out.println(tassoc.toString());
        }
    }
    
}
