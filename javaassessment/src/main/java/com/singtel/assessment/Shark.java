package com.singtel.assessment;

public class Shark extends Fish {

    @Override
    public void setProperties(){
        setBehaviour("can eat other fish");
        setColor("grey");
        setSize("large");
    }
}
