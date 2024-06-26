package com.example.netconnect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class UserData implements Serializable {
    String username;
    ArrayList<String> friendList;
    ArrayList<String> postList;

    public UserData(String username) {
        this.username = username;
        friendList = new ArrayList<>();
        postList = new ArrayList<>();

    }
    public void addFriend(String username)
    {
        friendList.add(username);
    }
    public void addPost(String post)
    {
        postList.add(post);
    }

    @Override
    public String toString() {
        return "UserData{" +
                "username='" + username + '\'' +
                ", friendList=" + friendList +
                ", postList=" + postList +
                '}';
    }
}
