/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sciencesu.sns.hibernate.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author antoi_000
 */
@Entity
@Table(name= "users")
public class User implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "users_id")
    private Integer id;
    
    @Column(name = "users_name")
    private String user;
    
    @Column(name = "users_password")
    private String mdp;
    
    @OneToOne
    private SiteGeographique users_site;

    public User() {
    }

    public User(String user, String mdp) {
        this.user = user;
        this.mdp = mdp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public SiteGeographique getUsers_site() {
        return users_site;
    }

    public void setUsers_site(SiteGeographique users_site) {
        this.users_site = users_site;
    }
    
    
    
}
