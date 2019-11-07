package com.netcracker.homework2;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){}

    public  Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return  length;
    }

    public void setLength(float length){
        this.length = length;
    }

    public float getWidth(){
        return  width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }

    public String toString(){
        return "Circle["+"length= "+length+", width= "+width+"]";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) { return false;}

        Rectangle rectangle = (Rectangle) o;

        return (this.width==rectangle.width)&&
                (this.length==this.length);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int)this.length;
        result = 31 * result + (int)this.width;
        return result;
    }
}
