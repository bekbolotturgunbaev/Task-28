package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] massive = {1,2,3,4,5,6,7};
        Arrays.stream(massive).filter(c->c%2==1).filter(c->c>6).map(c->c*c).limit(1).forEach(System.out::println);
    }
}
