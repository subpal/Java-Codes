package com.subham.hotelreservation.models;

import java.util.ArrayList;

public class Request {
    ArrayList<Day> dayList;
    Type type;

    public Request(ArrayList<Day> dayList, Type type) {
        this.dayList = dayList;
        this.type = type;
    }

    public int dayListSize(){
        return dayList.size();
    }

    public Day getDay(int index){
        return dayList.get(index);
    }

    public Type getType(){
        return type;
    }
}
