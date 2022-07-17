package com.practice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
* Lambda expression is an expression through which we can represent an Anonymous function.
 * we cannot write lambda expression for every method. Lambda expression is only applicable for methods present in Functional interface.
 */

//REAL TIME SCENARIO
//Assume we are making an API endpoint call and we are getting List of Users from that endpoint and now I have to return the same data in sorting order.

class User{
 private int ecn;
 private int xaid;
 private String Username;

    public int getEcn() {
        return ecn;
    }

    public void setEcn(int ecn) {
        this.ecn = ecn;
    }

    public int getXaid() {
        return xaid;
    }

    public void setXaid(int xaid) {
        this.xaid = xaid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "ecn=" + ecn +
                ", xaid=" + xaid +
                ", Username='" + Username + '\'' +
                '}';
    }
}


public class LambdaExample {

private static List<User> getUsers(){
    List<User> usersList = new ArrayList<>();

    User user = new User();
    user.setEcn(124);
    user.setXaid(201);
    user.setUsername("ROOOAA");
    usersList.add(user);

    User user1 = new User();
    user1.setEcn(111);
    user1.setXaid(201);
    user1.setUsername("ROOOBB");
    usersList.add(user1);

    User user2 = new User();
    user2.setEcn(103);
    user2.setXaid(203);
    user2.setUsername("ROOOCC");
    usersList.add(user2);

    return usersList;
}

    public static void main(String[] args) {

        List<User> usersData  = getUsers();
        for(User usr :  usersData){
            System.out.println(usr);
        }

        System.out.println("==================");
        System.out.println("==================");

        //Traditional way of comparing
        Comparator<User> compBasedOnECN =  new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getEcn() >  o2.getEcn()){
                    return 1;
                } else if(o1.getEcn() <  o2.getEcn()){
                    return -1;
                }
                return 0;
            }
        };

        Comparator<User> compECN = (o1,o2) -> o1.getEcn() >  o2.getEcn() ? 1 : o1.getEcn() <  o2.getEcn() ? -1 : 0;

        Collections.sort(usersData, compECN.reversed());
        for(User usr :  usersData){
            System.out.println(usr);
        }
    }
}
