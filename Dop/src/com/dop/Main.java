package com.dop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws NegativeNumberException{
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(11);
        list.add(0);
        System.out.println(task1(list));
    }
    static int task1(List<Integer> list){
        list.stream().forEach(y -> {
            if (y <= 0) {
                throw new NegativeNumberException(y,"\n" + "Negative number of zero ");
            }
        });
        return (int) list.stream().filter(Main::isPrime).count();
    }
    static boolean isPrime(int n){
        return IntStream.range(2,n).noneMatch(i -> n % i == 0);
    }
}
