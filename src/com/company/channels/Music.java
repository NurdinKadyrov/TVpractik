package com.company.channels;

import com.company.Television;

public class Music extends Television {
    private int channelNum = 3;

    public Music(int currentChannel, String nameOfChannel, int channelNum) {
        super(currentChannel, nameOfChannel);
        this.channelNum = channelNum;
    }

    public void logical() {
        System.out.println("""
                Current channel:  # 3 #
                +------------------------------+
                |                              |
                |                              |
                |           MusicTV            |
                |                              |
                |                              |
                +------------------------------+
                Name of channel:  """ + getNameOfChannel());
    }

    public int getChannelNum() {
        return channelNum;
    }
}
