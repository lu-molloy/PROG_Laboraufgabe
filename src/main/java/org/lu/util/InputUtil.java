package org.lu.util;

import java.util.Scanner;

public class InputUtil
{
    /*
    Sichere Konsoleneingaben
     */

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readLine ()
    {
        System.out.println("> ");
        return SCANNER.nextLine();
    }
}
