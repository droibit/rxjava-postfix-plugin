package com.github.droibit.plugin.rxjava.postfix.example;

import io.reactivex.Observable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Observable.fromIterable(Arrays.asList("test1", "test2"))
                .forEach(System.out::println);
    }
}
