package edu.wgu.d387_sample_code.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable {

    Locale locale;

    public WelcomeMessage (Locale locale) {

        this.locale = locale;

    }

    public String getWelcomeMessage() {

        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcome");

    }

    @Override
    public void run() {

        System.out.println("Thread Check: " + getWelcomeMessage()
                + ", Thread ID: " + Thread.currentThread().getId());

    }

}
