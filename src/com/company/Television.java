package com.company;

import com.company.channels.*;

import java.util.Locale;
import java.util.Scanner;

public class Television {
    private int currentChannel;
    private String nameOfChannel;
    private int counter = 0;
    private int counterOff = 1;

    public Television() {
    }

    public void logicalMethod() {
        Scanner scanner = new Scanner(System.in);

        NetFlix netFlix = new NetFlix(1, "NetFlix", 1);
        Cinema cinema = new Cinema(2, "Cinema", 2);
        Music music = new Music(3, "Music", 3);
        Cartoon cartoon = new Cartoon(4, "Cartoon", 4);
        News news = new News(5, "News", 5);
        Sport sport = new Sport(6, "Sport", 6);
        char channels = scanner.next().toUpperCase().charAt(0);

        switch (channels) {

            case 'W': {
                System.out.println("""
                        1 NetFlix
                        2 Cinema
                        3 Music
                        4 Cartoon
                        5 News
                        6 Sport""");
                int a = scanner.nextInt();
                counter += a;
                if (a == 1) {
                    netFlix.netFlix();
                    counter = 1;
                } else if (a == 2) {
                    cinema.logical();
                    counter = 2;
                } else if (a == 3) {
                    music.logical();
                    counter = 3;
                } else if (a == 4) {
                    cartoon.logical();
                    counter = 4;
                } else if (a == 5) {
                    news.logical();
                    counter = 5;
                } else if (a == 6) {
                    sport.logical();
                    counter = 6;
                }

                break;
            }
            case 'N': {
                counter++;

                if (counter == 1) {
                    netFlix.netFlix();
                } else if (counter == 2) {
                    cinema.logical();
                } else if (counter == 3) {
                    music.logical();
                } else if (counter == 4) {
                    cartoon.logical();
                } else if (counter == 5) {
                    news.logical();
                } else if (counter == 6) {
                    sport.logical();
                } else if (counter == 7) {
                    netFlix.netFlix();
                    counter = 1;
                }
                break;
            }
            case 'P': {
                counter--;
                System.out.println(counter);

                if (counter == 1) {
                    netFlix.netFlix();
                } else if (counter == 2) {
                    cinema.logical();
                } else if (counter == 3) {
                    music.logical();
                } else if (counter == 4) {
                    cartoon.logical();
                } else if (counter == 5) {
                    news.logical();
                } else if (counter == 6) {
                    sport.logical();
                } else if (counter == 0) {
                    sport.logical();
                    counter = 6;
                }
                break;
            }
            case '0':
            case 0: {
                if (counterOff == 1) {
                    counterOff--;
                    System.err.println(" Out of working ! Clik ( 0 )!!!");
                } else if (counterOff == 0) {
                    counterOff++;
                    if (counter == 1) {
                        netFlix.netFlix();
                    } else if (counter == 2) {
                        cinema.logical();
                    } else if (counter == 3) {
                        music.logical();
                    } else if (counter == 4) {
                        cartoon.logical();
                    } else if (counter == 5) {
                        news.logical();
                    } else if (counter == 6) {
                        sport.logical();
                    } else if (counter == 0) {
                        sport.logical();
                        counter = 6;
                    }
                }
                break;
            }
        }
    }


    public void logical() {
        System.out.println("Current channel:  #" + "#" + '\n' + "Name of channel:   " + getNameOfChannel());
    }


    public Television(int currentChannel, String nameOfChannel) {
        this.currentChannel = currentChannel;
        this.nameOfChannel = nameOfChannel;
    }


    public void methodSout() {
        System.out.println("""
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                Press W to choose the number of channel
                Press N to turn to the Next channel
                Press P to turn to the Previous channel
                Press 0 ro turn off the Tv
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public String getNameOfChannel() {
        return nameOfChannel;
    }

    public void setNameOfChannel(String nameOfChannel) {
        this.nameOfChannel = nameOfChannel;
    }
}
