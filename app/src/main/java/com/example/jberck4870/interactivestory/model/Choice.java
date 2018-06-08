package com.example.jberck4870.interactivestory.model;

/**
 * Created by jberck4870 on 6/4/2018.
 */

public class Choice {
    private int textId;
    private int nextPage;

    public Choice(int textId, int nextPage) {
        this.textId = textId;
        this.nextPage = nextPage;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }


    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
