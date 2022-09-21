package com.company.FormLoginUp.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MainModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }

    private String login;
    public void setLogin(String login){
        this.login=login;
    };
    public String getLogin(){
        return login;
    };
    private String password;
    public void setPassword(String password){
        this.password=password;
    };
    public String getPassword(){
        return password;
    };
    public MainModel(){};

    public MainModel(String login,String password){
        this.login=login;
        this.password=password;
    }
}
