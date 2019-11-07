package com.netcracker.homework2;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        return "Book["+"name= "+name+", authors= "+ Arrays.toString(authors)+", price = "+price+", qty="+qty;
    }
    public String getAuthorNames(){
        String result = "Authors names: ";
        int n = this.authors.length;
        for (int i = 0; i<(n-1);i++){
            result+=authors[i].getName()+", ";
        }
        result+=authors[n-1].getName();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) { return false;}

        Book book = (Book) o;

        return (this.price == book.price)&&
                book.name.equals(this.name)&&
                Arrays.equals(authors, book.authors)&&
                (book.qty == this.qty);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + Arrays.hashCode(this.authors);
        result = 31 * result + (int)this.price;
        result = 31 * result + this.qty;
        return result;
    }
}
