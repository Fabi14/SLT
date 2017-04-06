package com.example.fisch.slt;

import java.util.Date;

/**
 * Created by Fisch on 05.04.2017.
 */

public abstract class TagebuchSchreiber {

   private static Tagebuch tagebuch;

    public static void  addEintrag(TagebuchEintrag tagebuchEintrag)
    {

        getInstance();
        tagebuch.neuerTagebuchEintrag(tagebuchEintrag);


    }

    public static Tagebuch getTagebuch()
    {
        getInstance();
        return tagebuch;
    }

    private static void getInstance()
    {
        if(tagebuch==null){
            tagebuch = new Tagebuch();
            tagebuch.neuerTagebuchEintrag(new TagebuchEintrag(new Date(2017,5,3),"Laufen",20));
            tagebuch.neuerTagebuchEintrag(new TagebuchEintrag(new Date(2017,5,5),"Laufen",8));
            tagebuch.neuerTagebuchEintrag(new TagebuchEintrag(new Date(2017,5,7),"Laufen",24));


        }
    }

}
