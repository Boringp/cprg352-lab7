/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author bo
 */
public class Role {
    private int role_id;
    private String title;
    
    public Role(int role_id,String title){
            this.role_id=role_id;
            this.title=title;
    }
}
