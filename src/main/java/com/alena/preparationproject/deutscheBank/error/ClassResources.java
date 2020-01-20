package com.alena.preparationproject.deutscheBank.error;

public class ClassResources implements AutoCloseable {

    @Override
    public void close() throws Exception {

    }

    public static void main(String[] args) {
        try (ClassResources classResources = new ClassResources()) {
            //do something
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
