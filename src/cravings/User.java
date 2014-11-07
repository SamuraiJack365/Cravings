/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cravings;

/**
 * 
 * @author Jackson Hofmann
 */
public class User{
    
    private String username = "";
    private char[] password;
    
    /**
     * Constructor used when there is no username passed.
     * Sets the default username to "Undefined"
     */
    public User(){
        username = "Undefined";   
     
    }
    /**
     * Constructor used when there is a username passed.
     * Sets username to the passed String.
     * @param newUsername String used for the username.
     */
    public User(String newUsername){
        username = newUsername;   
    }
    /**
     * Returns this username.
     * @return username This instances username.
     */
    public String getUsername(){
        return this.username;
    }
    /**
     * Returns this password.
     * @return password This instances password.
     */
    public char[] getPassword(){
        return this.password;
    }
    /**
     * Sets this username to the new passed String value
     * @param newUsername String used for the new username
     */
    public void setUsername(String newUsername){
        username = newUsername;
    }
    /**
     * Sets this username to the new passed StringBuffer as a String value.
     * @param newUsername StringBuffer used for the new username.
     */
    public void setUsername(StringBuffer newUsername){
        username = new String(newUsername);
    }
}
