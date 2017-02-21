/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfldb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Paul Holden
 */
@Entity
@Table(name = "LEAGUETABLE", catalog = "", schema = "PAUL")
@NamedQueries({
    @NamedQuery(name = "Leaguetable_1.findAll", query = "SELECT l FROM Leaguetable_1 l"),
    @NamedQuery(name = "Leaguetable_1.findByPostionid", query = "SELECT l FROM Leaguetable_1 l WHERE l.postionid = :postionid"),
    @NamedQuery(name = "Leaguetable_1.findByTeamname", query = "SELECT l FROM Leaguetable_1 l WHERE l.teamname = :teamname"),
    @NamedQuery(name = "Leaguetable_1.findByPoints", query = "SELECT l FROM Leaguetable_1 l WHERE l.points = :points"),
    @NamedQuery(name = "Leaguetable_1.findByGamesplayed", query = "SELECT l FROM Leaguetable_1 l WHERE l.gamesplayed = :gamesplayed")})
public class Leaguetable_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "POSTIONID")
    private String postionid;
    @Basic(optional = false)
    @Column(name = "TEAMNAME")
    private String teamname;
    @Basic(optional = false)
    @Column(name = "POINTS")
    private int points;
    @Basic(optional = false)
    @Column(name = "GAMESPLAYED")
    private int gamesplayed;

    public Leaguetable_1() {
    }

    public Leaguetable_1(String postionid) {
        this.postionid = postionid;
    }

    public Leaguetable_1(String postionid, String teamname, int points, int gamesplayed) {
        this.postionid = postionid;
        this.teamname = teamname;
        this.points = points;
        this.gamesplayed = gamesplayed;
    }

    public String getPostionid() {
        return postionid;
    }

    public void setPostionid(String postionid) {
        String oldPostionid = this.postionid;
        this.postionid = postionid;
        changeSupport.firePropertyChange("postionid", oldPostionid, postionid);
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        String oldTeamname = this.teamname;
        this.teamname = teamname;
        changeSupport.firePropertyChange("teamname", oldTeamname, teamname);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        int oldPoints = this.points;
        this.points = points;
        changeSupport.firePropertyChange("points", oldPoints, points);
    }

    public int getGamesplayed() {
        return gamesplayed;
    }

    public void setGamesplayed(int gamesplayed) {
        int oldGamesplayed = this.gamesplayed;
        this.gamesplayed = gamesplayed;
        changeSupport.firePropertyChange("gamesplayed", oldGamesplayed, gamesplayed);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postionid != null ? postionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leaguetable_1)) {
            return false;
        }
        Leaguetable_1 other = (Leaguetable_1) object;
        if ((this.postionid == null && other.postionid != null) || (this.postionid != null && !this.postionid.equals(other.postionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jfldb.Leaguetable_1[ postionid=" + postionid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
