package com.example.fisch.slt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fisch on 04.04.2017.
 */

public class Tagebuch {

    List<TagebuchEintrag> eintraege;

    public Tagebuch() {
        eintraege = new ArrayList<TagebuchEintrag>();
    }

    public void neuerTagebuchEintrag(TagebuchEintrag tagebuchEintrag)
    {
        eintraege.add(tagebuchEintrag);
    }

    public List<TagebuchEintrag> getEintraege() {
        return eintraege;
    }

    public void setEintraege(List<TagebuchEintrag> eintraege) {
        this.eintraege = eintraege;
    }
}
