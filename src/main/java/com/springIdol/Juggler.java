package com.springIdol;
/**
 * Created by user on 28.09.14.
 */
public class Juggler implements Performer {

private int beanBags = 3;



public Juggler () {



}

public Juggler (int beanBags) {

this.beanBags = beanBags;


}

public void perform () throws  PerformanceException{


    System.out.println("Jaggler " + beanBags + " BeanBagget");




}






}
