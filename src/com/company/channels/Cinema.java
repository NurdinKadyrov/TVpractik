package com.company.channels;

import com.company.Television;

public class Cinema extends Television {
    private int channelNum;

    public Cinema(int currentChannel, String nameOfChannel, int channelNum) {
        super(currentChannel, nameOfChannel);
        this.channelNum = channelNum;
    }

    public void logical() {
        System.out.println("""
                Current channel:  # 2 #
                +------------------------------+
                |                              |
                |                              |
                |          CinemaTV            |
                |                              |
                |                              |
                +------------------------------+
                Name of channel:  """ + getNameOfChannel());
    }

    public int getChannelNum() {
        return channelNum;
    }
}
