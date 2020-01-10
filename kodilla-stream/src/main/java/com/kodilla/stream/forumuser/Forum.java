package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {
    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum() {
        theForumList.add(new ForumUser("Tomasz Buda", 'M', 0001, 1989, 8, 9, 5));
        theForumList.add(new ForumUser("Jan Kowalski", 'M', 0002, 2001, 7, 5, 5));
        theForumList.add(new ForumUser("Karol Krawczyk", 'M', 0003, 2010, 6, 1, 0));
        theForumList.add(new ForumUser("Anna Nowak", 'F', 0004, 2005, 12, 31, 123));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumList);
    }
}
