package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final String username;
    private final char sex;
    private final int userID;
    private final LocalDate birthDate;
    private final int numbersOfPosts;

    public ForumUser(final String username,final char sex,final int userID,final int yearOfBirth, final int monthOfBirth,
            final int daOfBirth,final int numbersOfPosts)
    {
        this.username = username;
        this.sex = sex;
        this.userID = userID;
        this.birthDate = LocalDate.of(yearOfBirth,monthOfBirth,daOfBirth);
        this.numbersOfPosts = numbersOfPosts;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getUserID() {
        return userID;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }
    @Override
    public String toString() {
        return "User [ ID: " + userID + "  |  Username: " + username + "  |  Sex: [" + sex + "]  |  Birthdate: " + birthDate +
                "  |  Total number of posts: " + numbersOfPosts + " ]";
    }

}
