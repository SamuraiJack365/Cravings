/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.MainFrameModel;
import view.MainFrameView;

/**
 *
 * @author srh10
 */
public class AuthenticationCntl {
    /**
     * Shows the Splash Screen then the LoginView.
     */
    public void showLoginUI(){
        MainFrameView theMainFrameView = new MainFrameView();
        MainFrameModel theMainFrameModel = new MainFrameModel("Cravings",600,800);
        MainFrameCntl theMainFrameCntl = new MainFrameCntl(theMainFrameView, theMainFrameModel);
        
        theMainFrameCntl.initView();
        theMainFrameCntl.initCustomComponents();
        
    }
    /**
     * Gets the list of users.
     */
    public void getUserList(){
        
    }
    
    
}
