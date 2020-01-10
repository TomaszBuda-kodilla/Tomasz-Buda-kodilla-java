package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForumList = new Forum();
        Map<Integer , ForumUser> theNewUserList = theForumList.getUserList().stream()
                .filter(forumUser -> forumUser.getBirthDate().getYear() > 2000)
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getNumbersOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

                System.out.println(theNewUserList);
        }
}