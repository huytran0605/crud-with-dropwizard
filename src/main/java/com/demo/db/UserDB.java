package com.demo.db;

import com.demo.representation.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDB {
    public static HashMap<Integer, User> users = new HashMap<Integer, User>();
    static{
        users.put(1, new User(1,"Huy", "Tran", "02/02/2000","test@a.com"));
        users.put(2, new User(2,"Hoang", "Nguyen", "23/2/1999","abc@gmail.com"));
        users.put(3, new User(3,"Minh", "Le", "06/02/1996","hello@yahoo.com"));
    }
    public static List<User> getUsers() {
        return new ArrayList<User>(users.values());
    }
    public static User getUser(Integer id) {
        return users.get(id);
    }
    public static void updateUser(Integer id, User user) {
        users.put(id, user);
    }
    public static void removeUser(Integer id) {
        users.remove(id);
    }
}
