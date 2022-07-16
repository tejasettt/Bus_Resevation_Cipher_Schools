package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserOperation {
    static List<User> userList = new ArrayList<>();
    public void addUser(User user){
        userList.add(user);
    }

    public boolean verifyEmail(String email){
        for(User user:userList){
            if(email.equals(user.getContact().getEmail())) {
                return true;
            }
        }

        return false;
    }
    public boolean verifyPassword(String password) {
        for (User user : userList) {
            if (password.equals(user.getPassword())) return true;
        }
        return false;
    }

    public void updateUserName(String email,String newName){
        for(User user:userList){
            user.setContact(new Contact(newName,user.getContact().getPhone(),user.getContact().getEmail()));
        }
    }

    public User findUser(String email){
        for(User user:userList){
            if(email.equals(user.getContact().getEmail())){
                return user;
            }
        }
        return null;
    }
}
