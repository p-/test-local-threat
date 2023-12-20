package test.localthreat;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("please provide one argument");
            System.exit(1);
        }

        var cmd = args[0];
        try {
            TheExecutor theExecutor = new TheExecutor();
            System.out.println("executing: " + cmd);
            theExecutor.execute(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}