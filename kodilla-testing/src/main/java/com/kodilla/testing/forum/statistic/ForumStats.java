package com.kodilla.testing.forum.statistic;

public class ForumStats {

    int usersCount;
    int postsCount;
    int commentsCount;
    double avrPostsCount;
    double avrUsersCommentsCount;
    double avrCommentsOnPostCount;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvrPostsCount() {
        return avrPostsCount;
    }

    public double getAvrUsersCount() {
        return avrUsersCommentsCount;
    }

    public double getAvrCommentsOnPostCount() {
        return avrCommentsOnPostCount;
    }

    public double countAveragePosts() {
        if (postsCount > 0) {
            double result = postsCount / usersCount;
            return result;
        } else {
            return 0;
        }
    }

    public double countAverageCommentsUsers() {
        if (commentsCount > 0) {
            double result = commentsCount / usersCount;
            return result;
        } else {
            return 0;
        }
    }

    public double countAverageCommentsPosts() {
        if (commentsCount > 0) {
            double result = commentsCount / postsCount;
            return result;
        } else {
            return 0;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        avrPostsCount = countAveragePosts();
        avrUsersCommentsCount = countAverageCommentsUsers();
        avrCommentsOnPostCount = countAverageCommentsPosts();
    }

    public void showStatistics() {
        System.out.println("Numbers of users" + usersCount);
        System.out.println("Numbers of posts" + postsCount);
        System.out.println("Numbers of comments" + commentsCount);
        System.out.println("Average numbers of posts" + avrPostsCount);
        System.out.println("Average comments per user" + avrUsersCommentsCount);
        System.out.println("Average numbers of comments per post" + avrCommentsOnPostCount);
    }
}
