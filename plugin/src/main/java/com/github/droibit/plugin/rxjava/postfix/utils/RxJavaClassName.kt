package com.github.droibit.plugin.rxjava.postfix.utils

enum class RxJavaClassName(val className: String) {
    OBSERVABLE("io.reactivex.Observable"),
    FLOWABLE("io.reactivex.Flowable"),
    SINGLE("io.reactivex.Single")
}