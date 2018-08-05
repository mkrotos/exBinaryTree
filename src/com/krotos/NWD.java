package com.krotos;


class NWD {

    public static int calc(int a,int b){
        if(a==b){
            return a;
        }
        int c;
        while(b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        return a;
    }

}
