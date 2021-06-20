package com.company.observer;


import java.util.ArrayList;
import static com.company.observer.colors.*;


public class Premium extends User implements Observer  {

    public Premium() {

        System.out.println(ANSI_YELLOW+"~~~~~~~ A basic Premium Created! ~~~~~~~"+ANSI_YELLOW);
    }

    @Override
    public void notifyObserver(ArrayList<News> news) {

        System.out.println(ANSI_YELLOW+"+++++++++++++++++++++++++ Premium News Letter +++++++++++++++++++++++++++++++++"+ANSI_YELLOW);
        System.out.println(ANSI_WHITE+"\tHey  Premium User "+this.getName()+"! "+ANSI_WHITE);
        System.out.println(ANSI_WHITE+"\tWe have Premium news  for you! "+ANSI_WHITE);

        System.out.println(ANSI_BLUE+"++++++++++++++++++++++++++++ NewsLetter Content +++++++++++++++++++++++++++++++++\n"+ANSI_BLUE);

        for (News n : news) {
            if(n.getType()==0 ||n.getType()==2){


                System.out.println(ANSI_PURPLE+"\t "+n.getContent()+ANSI_PURPLE);

            }
        }

        System.out.println(ANSI_BLUE+"\n++++++++++++++++++++++++++++++ Thank you +++++++++++++++++++++++++++++++"+ANSI_BLUE);

    }

    @Override
    public User getClassObj() {
        return new User(this.getName(),this.getEmail(),this.getState());
    }
}
