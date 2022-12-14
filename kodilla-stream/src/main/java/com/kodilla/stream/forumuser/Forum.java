package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum(){
        listOfForumUsers.add(new ForumUser(1,"grazyna",'F', LocalDate.of(1998,1,1),0));
        listOfForumUsers.add(new ForumUser(2,"Kamil",'M', LocalDate.of(1976,7,25),8));
        listOfForumUsers.add(new ForumUser(3,"Andrzej",'M', LocalDate.of(2005,1,6),20));
        listOfForumUsers.add(new ForumUser(4,"Karolina",'F', LocalDate.of(2001,5,1),3));
        listOfForumUsers.add(new ForumUser(4,"Rafal",'M', LocalDate.of(2002,5,1),1));
    }
    public List<ForumUser> getListOfForumUsers(){
        return new ArrayList<>(listOfForumUsers);
    }

}
