package org.okcoder.sample.spring_boot_locale_message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class SpringBootLocaleMessageApplication {

    public static void main(String[] args) {

        //Important!
        //Set default locale to English to prevent the default locale from JVM
        Locale.setDefault(Locale.ENGLISH);

        SpringApplication.run(SpringBootLocaleMessageApplication.class, args);
    }

}
