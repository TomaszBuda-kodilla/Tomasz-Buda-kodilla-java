package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.ForumStats;
import com.kodilla.testing.forum.statistic.Statistics;
import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class StatisticsTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testPostsCountZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> statisticsList = new ArrayList<String>();

        statisticsList.add("Tomasz Buda");

        when(statisticsMock.postsCount()).thenReturn(0);

        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = forumStats.getPostsCount();
        //Then
        Assert.assertEquals(0, quantityOfPosts);
    }

    @Test
    public void testPostsCountThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> statisticsList = new ArrayList<String>();

        statisticsList.add("Tomasz Buda");

        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = forumStats.getPostsCount();
        //Then
        Assert.assertEquals(1000, quantityOfPosts);
    }

    @Test
    public void testUsersCountZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> statisticsList = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(statisticsList);

        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfUsers = forumStats.getUsersCount();
        //Then
        Assert.assertEquals(0, quantityOfUsers);
    }

    @Test
    public void testUsersCountHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> statisticsList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            statisticsList.add("User" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(statisticsList);

        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfUsers = forumStats.getUsersCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
    }

    @Test
    public void testCommentsLessThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Tomasz Buda");

        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = forumStats.getPostsCount();
        int quantityOfComments = forumStats.getCommentsCount();
        //Then
        Assert.assertTrue(quantityOfPosts > quantityOfComments);
    }

    @Test
    public void testCommentsMoreThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Tomasz Buda");

        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = forumStats.getPostsCount();
        int quantityOfComments = forumStats.getCommentsCount();
        //Then
        Assert.assertTrue(quantityOfPosts < quantityOfComments);
    }
    @Test
    public void testAveragePostCount(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Tomasz Buda");
        statisticsList.add("Buda Tomasz");

        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStats forumStats = new ForumStats();
        forumStats.calculateAdvStatistics(statisticsMock);

        double averageOfPosts = forumStats.getAvrPostsCount();
        /*int quantityOfUsers = forumStats.getUsersCount();
        int quantityOfPosts = forumStats.getPostsCount();
        double myAverage = (double)quantityOfPosts/quantityOfUsers;*/ //Dodane gdyby średnia była ciężka do wpisania z palca
        System.out.println(averageOfPosts);
        //System.out.println(myAverage);
        Assert.assertEquals(500, averageOfPosts, 0.0);
    }
}

