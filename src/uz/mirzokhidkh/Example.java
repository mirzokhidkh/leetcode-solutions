package uz.mirzokhidkh;

import uz.mirzokhidkh.tree.medium.P236_Lowest_Common_Ancestor_of_a_Binary_Tree;

import javax.sql.rowset.serial.SerialBlob;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Example {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) throws MalformedURLException, SQLException {
//

//        URL url = new URL("http://185.178.51.17:47777/api/jsonprc");
//        System.out.println(url.getProtocol());


//        Timer timer = new Timer();
//        TimerTask tt = new TimerTask() {
//
//            @Override
//            public void run() {
//                LocalDateTime now = LocalDateTime.now();
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//                System.out.println(formatter.format(now));
//
//                System.out.println(ANSI_CYAN_BACKGROUND + "working on");
////                try {
////                    Thread.sleep(3000);
////                } catch (InterruptedException e) {
////                    throw new RuntimeException(e);
////                }
//
//            }
//
//            ;
//        };
//        timer.schedule(tt, 3000, 1000);


        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit tasks to the executor service
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            executorService.submit(() -> {
                // Your task logic here
                try {
                    if (finalI == 3)
                        Thread.sleep(6000);
                    else
                        Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(finalI + "-Task running...");
            });
        }


        executorService.shutdown();
        try {
            if (executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("All tasks completed");
            } else {
                System.out.println("Timeout occurred, not all tasks completed");
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }


        for (int i = 0; i < 5; i++) {
            int finalI = i;
            executorService.submit(() -> {
                // Your task logic here
                System.out.println(finalI + "-Task running...");
            });
        }


    }


}
