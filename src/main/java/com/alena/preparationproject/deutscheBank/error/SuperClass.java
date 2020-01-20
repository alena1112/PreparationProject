package com.alena.preparationproject.deutscheBank.error;

import java.io.IOException;

public class SuperClass {
    public void doSome() throws ClassNotFoundException, IOException {
    }
}

class LittleClass extends SuperClass {
    @Override
    public void doSome() throws ClassNotFoundException {//сузить исключения можем, а расширить - нет
        try {
            super.doSome();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
