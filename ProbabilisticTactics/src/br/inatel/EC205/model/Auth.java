/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.EC205.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author joaop
 */
public class Auth {
    protected ArrayList<Users> users = new ArrayList<Users>();
    protected String username;
    protected char[] password;
    protected static Users activeUser = new Users();
    
    public void setAuthUsers(ArrayList<Users> user){
        this.users = user;
    }

    public static Users getActiveUser() {
        return activeUser;
    }   
    
    public int loginSuccessful(String userTest, char[] passTest){ //1 = Success | 0 = Wrong Password | -1 = Wrong User

        if(users != null){
            for(Users user : users){
                if(user != null){
                    password = user.getPassword();
                    username = user.getUsername();
                    
                    if(username.equals(userTest)){

                        if(Arrays.equals(password, passTest) )
                        {
                            this.activeUser = user;
                            return 1; //Success                            
                        }else {
                            return 0; //Wrong Password
                        }
                    }else {
                        return -1; //Wrong User
                    }
                }
            }
        }
        return -10; //Erro
    }
}
