package com.practice.Optional;


import java.util.Optional;

/*
Handling Null Pointer Exception
 */

class User {

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class OptionalDemo {

    private static User usr;

    public OptionalDemo() {
         usr =  new User(1, "Shyam");
    }

    public static void main(String[] args){
        OptionalDemo od = new OptionalDemo();
        System.out.println(usr.getId());
        System.out.println(usr.getName());
        System.out.println(usr.getName().toUpperCase());

        User usr2 = new User(1, null);
        System.out.println(usr2.getId());
        System.out.println(usr2.getName());
        //System.out.println(usr2.getName().toUpperCase());

        Optional<User> opEmpty =  Optional.empty();
        System.out.println(opEmpty);

        //create of object only if you are sure the object is not null if the value is not null it will return Optional Object of that object type or if it is null throws NPE
        Optional<User> opOf =  Optional.of(new User(110, "Ramesh"));
        System.out.println(opOf.get().getId());

        User usr3 = new User(221, null);
        //create of object only if you are sure the object is not null if the value is not null it will return Optional Object of that object type or if it is null create empty object
        Optional<String> opOfException =  Optional.ofNullable(usr3.getName());
        System.out.println(opOfException.orElse("tom"));
        //System.out.println(opOfException.orElseThrow(() ->  new IllegalArgumentException("name is not present") ));

        System.out.println("========================================");
        System.out.println("========================================");

        User usr4 = new User(554, "Roger");
        //create of object only if you are sure the object is not null if the value is not null it will return Optional Object of that object type or if it is null create empty object
        Optional<String> name =  Optional.ofNullable(usr4.getName());
        System.out.println(name.map(String::toUpperCase).get());

    }
}
