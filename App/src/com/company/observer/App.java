package com.company.observer;


import java.util.ArrayList;
import java.util.Scanner;

import static com.company.observer.colors.*;


public class App {

    public static void main(String[] args) throws InterruptedException {


        ArrayList<News> newsList=new ArrayList<>();

        String name,email;
        int type,answer;
        Observer observer;
        Basic base =null;
        Premium premium =null;
        Subscriber subject=new Subscriber();
        Scanner in;
        News news;

//        User Loop

        while(true) {

            System.out.println(ANSI_BLUE +"========================Add Users===============================================" + ANSI_BLUE);

            System.out.println("Please Enter Your name");
            in = new Scanner(System.in);
            name = in.nextLine();

            System.out.println("Please Enter Your Email");
            email = in.nextLine();

            System.out.println("Please Choose an Account Type");
            System.out.println("* 1 for Basic      * 2 For Premium");
            type = in.nextInt();

            System.out.println("Would you subscribe us? ");
            System.out.println("* 1 for Yes      * 0 For No");
            answer = in.nextInt();

            if(answer==1){

                if(type==1) {
                    base = new Basic(); //reading news
                    base.setName(name);
                    base.setEmail(email);
                    base.setState(1);

                    observer = base;
                    subject.subscribe(observer);

                }else {

                    premium = new Premium();
                    premium.setName(name);
                    premium.setEmail(email);
                    premium.setState(1);

                    observer = premium;
                    subject.subscribe(observer);
                }




            }else {
                System.out.println("Thank You! ");
                if(type==1) {
                    base = new Basic();
//                    do something latter


                }else {

                    premium = new Premium();

                    //                    do something latter
                }

            }


            System.out.println(ANSI_BLUE+"======================================================================="+ANSI_BLUE);

            System.out.println(ANSI_BLUE+"Next Customer?"+ANSI_BLUE);
            System.out.println("* 1 for Next      * 0 For Done");
            answer = in.nextInt();

            if(answer==0)
                break;


        }

//News Loop


        while(true) {

            System.out.println(ANSI_YELLOW+"==========================Add News============================================="+ANSI_YELLOW);

            System.out.println("Please Enter News Content");
            in = new Scanner(System.in);
            name = in.nextLine();


            System.out.println("To whom you want to send");
            System.out.println("* 1 for Basic Users     * 2 For Premium Users     * 0 for Both the Users ");
            type = in.nextInt();



           news = new News(name,type);
           newsList.add(news);




            System.out.println("=======================================================================");

            System.out.println("Next News?");
            System.out.println("* 1 for Next      * 0 For Done");
            answer = in.nextInt();

            if(answer==0)
                break;


        }







        Thread.sleep(2000);
        System.out.println(ANSI_BLUE+"******** Subscriptions Notifications  **********"+ANSI_BLUE);

        subject.notifyObservers(newsList);



        Scanner in2 = new Scanner(System.in);

//        UnssuscribeLoop

        while(true) {

            System.out.println(ANSI_RED+"========================Unsubscribe Users==============================================="+ANSI_RED);


            System.out.println("Please Enter Your Email");
            String emailUns = in2.nextLine();


            System.out.println("Would you unsubscribe us? ");
            System.out.println("* 1 for Yes      * 0 For No");
            answer = in2.nextInt();

            if(answer==1)
                subject.unsubscribe(emailUns);

            else
                System.out.println("Thank You for not unsubscribing! ");


            System.out.println("=======================================================================");

            System.out.println(ANSI_BLUE+"Next unsubscription?"+ANSI_BLUE);
            System.out.println("* 1 for Next      * 0 For Done");
            answer = in.nextInt();

            if(answer==0)
                break;


        }


        Thread.sleep(3000);

        System.out.println(ANSI_BLUE+"******** Subscriptions Notifications Again  **********"+ANSI_BLUE);

        subject.notifyObservers(newsList);





    }
}
