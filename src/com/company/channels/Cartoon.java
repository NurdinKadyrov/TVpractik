package com.company.channels;

import com.company.Television;

public class Cartoon extends Television {
    private int channelNum = 4;

    public Cartoon(int currentChannel, String nameOfChannel, int channelNum) {
        super(currentChannel, nameOfChannel);
        this.channelNum = channelNum;
    }

    public void logical() {
        System.out.println("""
                Current channel:  # 4 #
                +------------------------------+
                |                              |
                |                              |
                |         CartoonTV            |
                |                              |
                |                              |
                +------------------------------+
                Name of channel:  """ + getNameOfChannel());
    }

    public int getChannelNum() {
        return channelNum;
    }
}
