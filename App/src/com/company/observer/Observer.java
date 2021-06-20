package com.company.observer;

import java.util.ArrayList;

public interface Observer {



    void notifyObserver(ArrayList<News> news);
    User getClassObj();

}
