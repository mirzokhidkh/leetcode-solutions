package uz.mirzokhidkh;

import uz.mirzokhidkh.tree.medium.P236_Lowest_Common_Ancestor_of_a_Binary_Tree;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Example {

    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException, InterruptedException {


        String str = "2016-01-28T19:55:25.7523188+01:00";
        ZonedDateTime parse = ZonedDateTime.parse(str);
//        System.out.println(ZonedDateTime.parse(str));

        String str2 = "2021-08-02";
        LocalDate localDate = LocalDate.parse(str2);
//        System.out.println(localDate);


        LocalDate now = LocalDate.now();

        System.out.println(now);

        long l = Instant.now().toEpochMilli();
        Thread.sleep(1);
        long g = Instant.now().toEpochMilli();

        System.out.println(l);
        System.out.println(g);

    }


}
