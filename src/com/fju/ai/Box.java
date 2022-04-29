package com.fju.ai;

public class Box {
    int length;
    int width;
    int height;
    String box;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean isFit(int length, int width, int height) {
        if (length <= this.length && width <= this.width && height <= this.height) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "box";
    }

    {

    }


}
