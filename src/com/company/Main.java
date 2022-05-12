package com.company;

import com.company.channels.*;

public class Main {

    public static void main(String[] args) {
        Television television = new Television();
        NetFlix netFlix = new NetFlix();
        netFlix.netFlix();
        television.methodSout();

        while (true) {

            television.logicalMethod();

            television.methodSout();
        }

    }
}
