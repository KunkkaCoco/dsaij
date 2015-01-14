package com.maxi.c10;

/**
 * Created by maximus on 15-1-14.
 */
public class DataItem {
    public long dData;

    public DataItem(long dd){
        dData = dd;
    }

    public void displayItem(){
        System.out.println("/"+ dData);
    }


}
