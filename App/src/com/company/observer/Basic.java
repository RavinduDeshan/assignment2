package com.company.observer;


import java.util.ArrayList;
import static com.company.observer.colors.*;


public class Basic extends User implements Observer{

    public Basic() {

        System.out.println(ANSI_CYAN+"~~~~~~~ A basic User Created! ~~~~~~~" +ANSI_CYAN);
    }

    @Override
    public void notifyObserver(ArrayList<News> news) {
        //send an email
        System.out.println(ANSI_BLUE+"^^^^^^^^^^^^^^^^^^^^^ Basic News Letter ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+ANSI_BLUE);
        System.out.println(ANSI_WHITE+"\tHey  Basic User "+this.getName()+"! "+ANSI_WHITE);
        System.out.println(ANSI_WHITE+"\tWe have a great news  for you! "+ANSI_WHITE);
        System.out.println(ANSI_BLUE+"^^^^^^^^^^^^^^^^^^^^ NewsLetter Content ^^^^^^^^^^^^^^^^^^^^^^^^^\n"+ANSI_BLUE);

        for (News n : news) {
            if(n.getType()==0 ||n.getType()==1){


                System.out.println(ANSI_PURPLE+"\t \t"+n.getContent()+ANSI_PURPLE);

            }
        }
        System.out.println(ANSI_BLUE+"\n^^^^^^^^^^^^^^^^^^ Than You! ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+ANSI_BLUE);
    }

    @Override
    public User getClassObj() {
        return new User(this.getName(),this.getEmail(),this.getState());
    }
}
