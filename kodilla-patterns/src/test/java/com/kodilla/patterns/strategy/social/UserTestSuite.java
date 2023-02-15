package com.kodilla.patterns.strategy.social;


import static org.junit.jupiter.api.Assertions.*;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void defaultYGeneration() {
        //given
        User kamil = new YGeneration("kamil l.");
        //when
        String sharingMethod = kamil.sharePost();
        //then
        assertEquals("sharing on twitter", sharingMethod);
    }

    @Test
    void defaultZGeneration() {
        //given
        User kamil = new ZGeneration("kamil l.");
        //when
        String sharingMethod = kamil.sharePost();
        //then
        assertEquals("sharing on snapchat", sharingMethod);
    }

    @Test
    void defaultMillenials() {
        //given
        User kamil = new Millenials("kamil l.");
        //when
        String sharingMethod = kamil.sharePost();
        //then
        assertEquals("sharing on facebook", sharingMethod);
    }

    @Test
    void millenialsSharingOnSnapchat() {
        //given
        User kamil = new Millenials("kamil l.");
        //when
        kamil.setSocialPublisher(new SnapchatPublisher());
        String sharingMethod = kamil.sharePost();
        //then
        assertEquals("sharing on snapchat", sharingMethod);
    }


}
