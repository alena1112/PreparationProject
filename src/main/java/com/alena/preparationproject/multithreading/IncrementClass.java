package com.alena.preparationproject.multithreading;

interface IncrementClass extends ThreadFunction<Integer> {
    int incrementAndGet();
    int get();
}
