package com.practice.foreach;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class User{
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Here are the users { id=" + id + ", name=" + name + "}";
    }
}


public class ForEachDemo {

    public static void main(String[] args){

        List<User> userlist = Collections.unmodifiableList(Arrays.asList(new User(1, "Ramesh"), new User(2, "Shyam"), new User(3, "Karan")));
        userlist.forEach(u -> System.out.println(u.toString()));
    }


}
