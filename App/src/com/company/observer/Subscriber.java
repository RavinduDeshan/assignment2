package com.company.observer;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.company.observer.colors.ANSI_RED;


public class Subscriber {
    List<Observer> observers=new ArrayList<>();


    User user;

    //subscribe
    public void subscribe(Observer observer){

        observers.add(observer);
    }

    //unsubscribe
    public void unsubscribe(String email){


        Iterator<Observer> lir = observers.iterator();
        while (lir.hasNext()) {

            Observer observer = lir.next();
            user = observer.getClassObj();


            if (user.getEmail().equalsIgnoreCase(email)) {
                lir.remove();


                System.out.println(ANSI_RED+"User unsubscribed : " + user.getEmail().equalsIgnoreCase(email)+ANSI_RED);
            }

        }


    }


    public void notifyObservers(ArrayList<News> news){
        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }
    }

}
