package com.company.channels;

import com.company.Television;

public class NetFlix extends Television {
    private int channelNum;

    public NetFlix(int currentChannel, String nameOfChannel, int channelNum) {
        super(currentChannel, nameOfChannel);
        this.channelNum = channelNum;

    }

    public NetFlix() {

    }

    public void netFlix() {

        System.out.println("""
                Current channel:  # 1 #
                +------------------------------+
                |                              |
                |                              |
                |         NetFixTV             |
                |                              |
                |                              |
                +------------------------------+
                Name of channel:  """ + getNameOfChannel());
    }

    public int getChannelNum() {
        return channelNum;
    }
}
