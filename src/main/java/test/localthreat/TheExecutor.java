package test.localthreat;

import java.io.IOException;

public class TheExecutor {
    public void execute(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);
    }
}
