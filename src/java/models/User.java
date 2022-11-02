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
public class User {
    private String email;
    private boolean active;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
   public User() {
        
    };
   public User(String email,boolean active,String firstName,String lastName,String password, Role role){
       this.email=email;
       this.active=active;
       this.firstName=firstName;
       this.lastName=lastName;
       this.password=password;
       this.role=role;
   }
}
