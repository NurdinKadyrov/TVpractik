package com.company.channels;

import com.company.Television;

public class Sport extends Television {
    private int channelNum = 6;

    public Sport(int currentChannel, String nameOfChannel, int channelNum) {
        super(currentChannel, nameOfChannel);
        this.channelNum = channelNum;
    }

    public void logical() {
        System.out.println("""
                Current channel:  # 6 #
                +------------------------------+
                |                              |
                |                              |
                |           SportTV            |
                |                              |
                |                              |
                +------------------------------+
                Name of channel:  """ + getNameOfChannel());
    }

    public int getChannelNum() {
        return channelNum;
    }
}
