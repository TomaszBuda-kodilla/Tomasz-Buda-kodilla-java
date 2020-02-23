package com.kodilla.patterns.strategy.social.share;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    public String share(){
        return "This is Snapchat";
    }
}
