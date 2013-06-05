/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.test;

import fr.sciencesu.sns.hibernate.builder.EntityBuilder;
import fr.sciencesu.sns.hibernate.jpa.Produit;
import fr.sciencesu.sns.hibernate.utils.HibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author antoi_000
 */
public class BDD {
    //Déclaration d'une session hibernate

    private static Session session = null;

    public static void connection() {
        //Ouverture d'une session
        session = HibernateUtil.getSession();

    }

    public static void deconnection() {
        //fermeture de la session
        session.close();
    }

    public static void print(String nameTable) {
        System.out.println("[" + nameTable + "]");

        String hql = "from " + nameTable;
        Query q = session.createQuery(hql);

        Set dataTable = (Set) q.list();

        for (Object object : dataTable) {
            System.out.println(object.toString());
        }
    }
    
    public static Produit Create(String table, String... params) 
    {
        return new Produit();//initEntity(table, params);
    }
    
     public static void CreateProduit(String nom,Double prix,Calendar date) 
    {
        Produit e = new Produit(nom, prix, date);
        
        // Enregistrements
        Transaction tx = session.beginTransaction();

        session.save(e);
        //s.save(a);
        tx.commit();

    }

    public static boolean Create(String table, Produit e) {

        //Création des objets à rendre persistants
        //e = initEntity(table);
        
        //Event e = new Event("Titre de l'évènement", "description", true);
        //Address a = new Address("Nom de l'adresse", "24 rue des cerisiers", "75001", "Paris");

        // Association entre Event et Address
        //e.setAddress(a);

        // Enregistrements
        Transaction tx = session.beginTransaction();

        session.save(e);
        //s.save(a);
        tx.commit();

        //Affichage de la table
        //print(table);
        return false;

    }

    public static void ReadProduit(String table, String field, String value) {
        // Récupération de l'Event d'après son titre
        Query q = session.createQuery("from " + table + " where " + field + "= :myTitle");
        q.setString("myTitle", value);
        Produit e = (Produit) q.uniqueResult();

        // Affichage de l'objet récupéré
        System.out.println(e.toString());
    }

    public static String ReadProduit(String table) {
        // Récupération de l'Event d'après son titre
        Query q = session.createQuery("select nom from " + table);
        String s = "";
        for (Iterator it = q.list().iterator(); it.hasNext();) {
            s += (String) it.next()+"\n";
            
        }
        return s;
    }

    public static void UpdateProduit(String table, String field, String value) {
        // Récupération de l'Event d'après son titre
        Query q = session.createQuery("from " + table + " where " + field + "= :myTitle");
        q.setString("myTitle", value);
        Produit e = (Produit) q.uniqueResult();

        // Modifications des attributs de l'objet
        // e.setDescription("Description modifiée");
        //e.setAllDay(false);

        // Prise en compte de la modification
        Transaction tx = session.beginTransaction();
        session.update(e);
        tx.commit();

        print(table);
    }
   

    public static void DeleteProduit(String table, String field, String value) {
        // Récupération de l'Event d'après son titre
        Query q = session.createQuery("from " + table + " where " + field + "= :myTitle");
        q.setString("myTitle", value);
        Produit e = (Produit) q.uniqueResult();

        // supression object
        Transaction tx = session.beginTransaction();
        session.delete(e);
        tx.commit();

        print(table);
    }

    private static Calendar toCalendar(String dateString) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
            Date date = format.parse(dateString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
