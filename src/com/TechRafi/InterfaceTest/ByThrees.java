package com.TechRafi.InterfaceTest;

public class ByThrees implements Series{
    int val;

    ByThrees(){
        val=0;
    }
    public int getNext(){
        val+=3;
        return val;
    }

}
