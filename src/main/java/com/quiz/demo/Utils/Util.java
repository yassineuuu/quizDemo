package com.quiz.demo.Utils;

import com.quiz.demo.models.Client;
import com.quiz.demo.models.User;
import com.quiz.demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Util {


    static final String SOURCE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom secureRnd = new SecureRandom();

    public static Date calculateDate(int ms) {
        Date date = new Date();
        ;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MILLISECOND, ms);
        date = calendar.getTime();

        return date;
    }

    public static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length())));
        return sb.toString();
    }

    public static String alphaNumericString(int len) {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();

        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }
}
