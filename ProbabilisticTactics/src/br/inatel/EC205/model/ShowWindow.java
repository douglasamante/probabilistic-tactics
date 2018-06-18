/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.EC205.model;

import br.inatel.EC205.view.Login;
import br.inatel.EC205.view.Painel;

/**
 *
 * @author joaop
 */
public class ShowWindow {
    static Login login;
    static Painel painel;
    
    public void showLogin(Auth auth){
        ShowWindow.login = new Login(auth);
        ShowWindow.login.setLocationRelativeTo(null); //Centralizar Tela Principal
        ShowWindow.login.setVisible(true);
    }
    
    public void showPainel(){
        ShowWindow.login.setVisible(false);
        ShowWindow.painel = new Painel();
        ShowWindow.painel.setLocationRelativeTo(null); //Centralizar Tela Principal
        ShowWindow.painel.setVisible(true);
    }
}
