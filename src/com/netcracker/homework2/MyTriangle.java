package com.netcracker.homework2;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString(){
        return "MyTriangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + ")";
    }
    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }
    public String getType(){
        double x = v1.distance(v2);
        double y = v2.distance(v3);
        double z = v3.distance(v1);
        String type;
        if ((x==y)&&(x==z)){
            type = "Equilateral";
        }
        else if ((x==y)||(y==z)||(z==x)){
            type = "Isosceles";
        }
        else type = "Scalene";
        return type;
    }
}
