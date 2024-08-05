package com.cowaine.coalong.mission.game.ui;

import java.io.DataOutputStream;
import java.io.IOException;

public class OutputView {

    public static void print(DataOutputStream out, String message) throws IOException {
        out.writeUTF(message);
    }

}
