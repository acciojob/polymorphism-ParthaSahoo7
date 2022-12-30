package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
        Product p = new Product();
        int ans = p.product(2,4);
        int ans1 = p.product(3,4,5);
        double ans2 = p.product(1.5,2.2);
        System.out.println(ans + " " + ans1 + " " + ans2);

    }
    public static class Product{
        public int product(int x , int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x , double y){
            return x*y;
        }

    }

}