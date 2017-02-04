package com.github.droibit.plugin.rxjava.postfix.example;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final List<String> texts = Arrays.asList("a", "b", "c");

        Observable.fromIterable(texts)
                .forEach(System.out::println);
    }
}
