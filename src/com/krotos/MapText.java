package com.krotos;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;

class MapText {

    static public String toMap(String s){

        HashSet<Character> set=new HashSet<>(s.chars().mapToObj(c->(char)c).collect(Collectors.toList()));
        List<Integer> list=new ArrayList<>();
        HashMap<Character,List<Integer>> map=new HashMap<>();

        for(Character c:set){
            for(int i=0;i<s.length();i++){
                if(c.equals(s.charAt(i))){
                    list.add(i);
                }
            }

            map.put(c,new ArrayList<>(list));
            list.clear();
        }
        System.out.println(map);

        String s2="";
        for(int i=0;i<s.length();i++){
            for(Character c:map.keySet()){
                if (map.get(c).contains(i)){
                    s2=String.join("",s2,c.toString());
                }
            }
        }

        System.out.println("Nowy wyraz: "+s2);
        return s2;
    }

}
