package com.Training.StringDetails;

public final class ImmutableClassExample {

    private final String pancardNumber;

    public ImmutableClassExample(String pancardNumber){
        this.pancardNumber=pancardNumber;
    }

    public String getPancardNumber(){
        return pancardNumber;
    }
}
