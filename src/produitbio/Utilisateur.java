/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produitbio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author AISSAN Francois
 */
@Entity
@Table(name = "utilisateur", catalog = "biomarket", schema = "")
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByRefUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.refUtilisateur = :refUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByNomUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.nomUtilisateur = :nomUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByPrenomUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.prenomUtilisateur = :prenomUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByLoginUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.loginUtilisateur = :loginUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByPwdUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.pwdUtilisateur = :pwdUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByProfilUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.profilUtilisateur = :profilUtilisateur")})
public class Utilisateur implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ref_utilisateur")
    private Integer refUtilisateur;
    @Basic(optional = false)
    @Column(name = "nom_utilisateur")
    private String nomUtilisateur;
    @Basic(optional = false)
    @Column(name = "prenom_utilisateur")
    private String prenomUtilisateur;
    @Basic(optional = false)
    @Column(name = "login_utilisateur")
    private String loginUtilisateur;
    @Basic(optional = false)
    @Column(name = "pwd_utilisateur")
    private String pwdUtilisateur;
    @Basic(optional = false)
    @Column(name = "profil_utilisateur")
    private int profilUtilisateur;

    public Utilisateur() {
    }

    public Utilisateur(Integer refUtilisateur) {
        this.refUtilisateur = refUtilisateur;
    }

    public Utilisateur(Integer refUtilisateur, String nomUtilisateur, String prenomUtilisateur, String loginUtilisateur, String pwdUtilisateur, int profilUtilisateur) {
        this.refUtilisateur = refUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.loginUtilisateur = loginUtilisateur;
        this.pwdUtilisateur = pwdUtilisateur;
        this.profilUtilisateur = profilUtilisateur;
    }

    public Integer getRefUtilisateur() {
        return refUtilisateur;
    }

    public void setRefUtilisateur(Integer refUtilisateur) {
        Integer oldRefUtilisateur = this.refUtilisateur;
        this.refUtilisateur = refUtilisateur;
        changeSupport.firePropertyChange("refUtilisateur", oldRefUtilisateur, refUtilisateur);
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        String oldNomUtilisateur = this.nomUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        changeSupport.firePropertyChange("nomUtilisateur", oldNomUtilisateur, nomUtilisateur);
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        String oldPrenomUtilisateur = this.prenomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        changeSupport.firePropertyChange("prenomUtilisateur", oldPrenomUtilisateur, prenomUtilisateur);
    }

    public String getLoginUtilisateur() {
        return loginUtilisateur;
    }

    public void setLoginUtilisateur(String loginUtilisateur) {
        String oldLoginUtilisateur = this.loginUtilisateur;
        this.loginUtilisateur = loginUtilisateur;
        changeSupport.firePropertyChange("loginUtilisateur", oldLoginUtilisateur, loginUtilisateur);
    }

    public String getPwdUtilisateur() {
        return pwdUtilisateur;
    }

    public void setPwdUtilisateur(String pwdUtilisateur) {
        String oldPwdUtilisateur = this.pwdUtilisateur;
        this.pwdUtilisateur = pwdUtilisateur;
        changeSupport.firePropertyChange("pwdUtilisateur", oldPwdUtilisateur, pwdUtilisateur);
    }

    public int getProfilUtilisateur() {
        return profilUtilisateur;
    }

    public void setProfilUtilisateur(int profilUtilisateur) {
        int oldProfilUtilisateur = this.profilUtilisateur;
        this.profilUtilisateur = profilUtilisateur;
        changeSupport.firePropertyChange("profilUtilisateur", oldProfilUtilisateur, profilUtilisateur);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refUtilisateur != null ? refUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.refUtilisateur == null && other.refUtilisateur != null) || (this.refUtilisateur != null && !this.refUtilisateur.equals(other.refUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produitbio.Utilisateur[ refUtilisateur=" + refUtilisateur + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
