# RxJava Postfix Completion Plugin
[![Build Status](https://travis-ci.org/droibit/rxjava-postfix-plugin.svg?branch=develop)](https://travis-ci.org/droibit/rxjava-postfix-plugin)

Postfix Completion with RxJava to use in IntelliJ Idea/Android Studio.  
**Only support RxJava2.**

## Available Templates

#### Observable

|Postfix Expression|Description|Example|
|------------------|-----------|-------|
|.ojust|Creates Observable from item.|Observable.just(item)|
|.ofrom|Creates Observable from iterable/array.|Observable.fromIterable(texts)  Observable.fromArray(texts)|
|.oerror|Creates Observable from throwable.|Observable.error(throwable)|

#### Flowable

|Postfix Expression|Description|Example|
|------------------|-----------|-------|
|.fjust|Creates Flowable from item.|Flowable.just(item)|
|.ffrom|Creates Flowable from iterable/array.|Flowable.fromIterable(texts)  Flowable.fromArray(texts)|
|.ferror|Creates Flowable from throwable.|Flowable.error(throwable)|

#### Single

|Postfix Expression|Description|Example|
|------------------|-----------|-------|
|.sjust|Creates Single from item.|Single.just(item)|
|.serror|Creates Single from throwable.|Single.error(throwable)|

## License

    Copyright 2016 Shinya Kumagai

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
