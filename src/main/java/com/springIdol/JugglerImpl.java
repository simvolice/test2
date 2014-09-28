package com.springIdol;

/**
 * Created by user on 28.09.14.
 */
public class JugglerImpl extends Juggler {

private Poem poem;


public JugglerImpl(Poem poem){

super();

this.poem = poem;

}




    public JugglerImpl(int beanBag, Poem poem) {


super(beanBag);
this.poem = poem;


    }

    public void perform() throws PerformanceException {


        super.perform();

        System.out.println("Whilling");

poem.resite();
    }

}
