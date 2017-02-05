package com.github.droibit.plugin.rxjava.postfix.example;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final List<String> textList = Arrays.asList("a", "b", "c");
        Observable.fromIterable(textList)
                .forEach(System.out::println);

        final String[] textArray = {"a", "b", "c"};
        Observable.fromArray(textArray)
                .forEach(System.out::println);

        final String text = "text";
        Observable.just(text)
                .forEach(System.out::println);
        Flowable.just(text)
                .forEach(System.out::println);

        Observable.error(new RuntimeException())
                .subscribe();

        Single.error(new RuntimeException())
                .subscribe();

        Flowable.error(new RuntimeException())
                .subscribe();
    }
}
