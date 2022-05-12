package com.company.channels;

import com.company.Television;

public class News extends Television {
    private int channelNum = 5;

    public News(int currentChannel, String nameOfChannel, int channelNum) {
        super(currentChannel, nameOfChannel);
        this.channelNum = channelNum;
    }

    public void logical() {
        System.out.println("""
                Current channel:  # 5 #
                +------------------------------+
                |                              |
                |                              |
                |            NewsTV            |
                |                              |
                |                              |
                +------------------------------+
                Name of channel:  """ + getNameOfChannel());
    }

    public int getChannelNum() {
        return channelNum;
    }
}
