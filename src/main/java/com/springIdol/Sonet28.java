package com.springIdol;
import sun.management.resources.agent_fr;

import java.lang.String;
/**
 * Created by user on 28.09.14.
 */
public class Sonet28 implements Poem {

private static String[] Lines = {
        "Когда в раздоре с миром и судьбой,",
        "Припомнив годы, полные невзгод,",
        "Тревожу я бесплодною мольбой",
        "Глухой и равнодушный небосвод",
        "И, жалуясь на горестный удел,",
        "Готов меняться жребием своим",
        "С тем, кто в искусстве больше преуспел,",
        "Богат надеждой и людьми любим, -",
        "Тогда, внезапно вспомнив о тебе,",
        "Я малодушье жалкое кляну,",
        "И жаворонком, вопреки судьбе,",
        "Моя душа несется в вышину.",
        "С твоей любовью, с памятью о ней",
        "Всех королей на свете я сильней."



};


    public  Sonet28 () {}


public void resite() {

    for(String var : Lines) {


        System.out.println(var);


    }



}






}
