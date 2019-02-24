// this is the timetable of cse dd 2019
package abhishek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.print("Enter the day(full name) ");

        BufferedReader day = new BufferedReader(new InputStreamReader(System.in));

        String today = day.readLine();


        String period;
        switch (today) {
            case "monday":
                period = "\033[1;33m 1. Basic Electrical Engg. @ 8:30 " +
                        "\n 2. Chemistry              @ 9:20" +
                        " \n 3. Engg. Mathematics      @ 10:10 " +
                        "\n 4. Communication Skills   @ 11:00";
                break;
            case "tuesday":
                period = "\033[1;34m 1. Communication Skills   @ 8:30" +
                        "\n 2. Chemistry              @ 9:20" +
                        "\n 3. Basic Electrical Engg. @ 10:10 " +
                        "\n 4. Engg. Mathematics      @ 11:00" +
                        "\n ---------break---------" +
                        "\n 5. Engg.Graphics and lab  @ 12:40";
                break;
            case "wednesday":
                period = "\033[1;35m 1. Communication Skills and lab @ 8:30 " +
                                   "\n         ---------break-----" +
                                  "\n 2. Engg. Graphics               @ 1:30 " +
                                  "\n 3. Basic Elect. Engg            @ 2:20";
                break;
            case "thursday":
                period = "\033[1;36m 1. chemistry and lab @ 8:30 ";
                break;
            case "friday":
                period = "\033[1;30m"+"\033[1;31m"+" 1. Basic Elect. Engg     @ 8:30" +
                        "\n 2. Communication Skillls @ 9:20" +
                        "\n 3. Engg. Mathematics     @ 10:10 " +
                        "\n 4. Chemistry             @ 11:00";
                break;
            case "saturday": period = "\033[1;38m Saturday  holiday to us\n party......................................";
                break;
            case "sunday":period ="\033[1;39m Sunday holiday to us\n party......................................";
            break;
            default: period ="wrong input\n please enter the day";
        }
        System.out.println(period);
    }
}