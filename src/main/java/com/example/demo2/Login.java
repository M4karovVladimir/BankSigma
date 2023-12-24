package com.example.demo2;

import Users.CurrentUser;

import java.util.ArrayList;
import java.util.List;

public class Login {
    public static List<CurrentUser> users = new ArrayList<>();

   static  {
       Statistics statistics = new Statistics();
    }
    public static List<CurrentUser> getUsers() {
        return users;
    }
}
