/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produitbio;

/**
 *
 * @author AISSAN Francois
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance = null;
    private String userLogin ="";
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    } 

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    
}
