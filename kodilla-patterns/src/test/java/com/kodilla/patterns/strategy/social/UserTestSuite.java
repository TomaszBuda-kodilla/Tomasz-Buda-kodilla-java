package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.share.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("Tomek");
        User user2 = new YGeneration("Adam");
        User user3 = new ZGeneration("Janusz");
        //When
        String user1Media = user1.sharePost();
        System.out.println(user1.getName() + " media: " + user1Media);

        String user2Media = user2.sharePost();
        System.out.println(user2.getName() + " media: " + user2Media);

        String user3Media = user3.sharePost();
        System.out.println(user3.getName() + " media: " + user3Media);
        //Then

        Assert.assertEquals("This is Facebook",user1Media);
        Assert.assertEquals("This is Twitter", user2Media);
        Assert.assertEquals("This is Snapchat", user3Media);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user4 = new Millenials("Grazyna");
        //When
        String user4Media = user4.sharePost();
        System.out.println(user4.getName() + " media: " + user4Media);
        user4.setSocialPublisher(new SnapchatPublisher());
        user4Media = user4.sharePost();
        System.out.println(user4.getName() + " media: " + user4Media);
        //Then
        Assert.assertEquals("This is Snapchat", user4Media);
    }
}
