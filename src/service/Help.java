package service;

// Responsible by San1tater

import ui.Colours;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Help {
    // the list to storage all commands
    private final static List<String> commands = new ArrayList<>();
    // the setting on the page
    private final static int pageSize = 6;
    private static int currentPage = 1;

    // all the commands
    static {
        commands.add("/previous (use to see the previous pages of help)");
        commands.add("/next     (use to see the Next pages of help)");
        commands.add("/exit     (use to exit help)");
        commands.add("/return   (use to return to the last menu)");
    }

    // show the page number and display the page
    public static void displayPage(int page) {
        int totalPages = (commands.size() + pageSize - 1) / pageSize;

        if (page < 1) page = 1; // page can not smaller than 0
        if (page > totalPages) page = totalPages; // page can not larger than max page

        currentPage = page;
        int start = (page-1) * pageSize;
        int end = Math.min(start + pageSize, commands.size());

        System.out.println("=== Commands (Page " + (currentPage) + " of " + totalPages + ") ===");
        for (int i = start; i < end; i++) {
            System.out.println("\t" + Colours.BG_BLACK + Colours.RED + commands.get(i) + Colours.RESET);
        }
        System.out.println("Type /next or /previous to navigate pages, /exit_help to quit.");
    }

    // next and previous to change the page number, include exit.
    public static void help(){
        Scanner scanner = new Scanner(System.in);
        displayPage(0);

        while (true) {
            System.out.print("Command> ");
            String input = scanner.nextLine().trim();

            if (input.equals("/next")) {
                displayPage(currentPage + 1);
            } else if (input.equals("/previous")) {
                displayPage(currentPage - 1);
            } else if (input.equals("/exit")) {
                System.out.println("Exiting help...");
                break;
            } else {
                System.out.println("Unknown command. Use /next, /previous, or /exit_help.");
            }
        }
    }

     public static void main(String[] args){ // 单独调试用, 平时
         help();
     }
}
