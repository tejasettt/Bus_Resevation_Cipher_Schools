package org.example;

public class LoginSignup {
    UserOperation userOperation = new UserOperation();
    public String signup(String name,long phone,String email,String street, String city,String state,String password){
        if(userOperation.verifyEmail(email)){
            return "Email already have account here";
        }
        Contact contact = new Contact(name,phone,email);
        Address address = new Address(street,city,state);
        User user = new User(contact,address,password);
        userOperation.addUser(user);
        return "Account created";
    }
    public String login(String email,String password){
        if(userOperation.verifyEmail(email)){
            if(userOperation.verifyPassword(password)){
                return "Logged in successfully";
            }
            return "Wrong password";
        }
        return "Incorrect email/You are new here create an account";
    }

}
