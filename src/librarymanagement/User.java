/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author hp
 */
class User {
    private String name,password,id,email,address,city,contact;
    public User(String name,String password,String id,String email,String addrerss,String city,String contact){
        this.name=name;
        this.password=password;
        this.id=id;
        this.email=email;
        this.address=address;
        this.city=city;
        this.contact=contact;
    }
    
    public String getname(){
        return name;
    }
    public String getpassword(){
        return password;
    }
    public String getid(){
        return id;
    }
    public String getemail(){
        return email;
    }
    public String getaddress(){
        return address;
    }
    public String getcity(){
        return city;
    }
    public String getcontact(){
        return contact;
    }
    
    
}
