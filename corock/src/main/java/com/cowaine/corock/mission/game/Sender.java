package com.cowaine.corock.mission.game;

import lombok.Getter;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

@Getter
public class Sender extends Thread {

    private final String clientId;
    private final DataOutputStream out;

    Sender(Socket socket, String clientId) throws IOException {
        this.clientId = clientId;
        this.out = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        try {
            initialize();
            sendMessage();
            out.writeUTF("___====-_  _-====___\n" +
                    "           _--^^^#####//      \\\\#####^^^--_\n" +
                    "        _-^##########// (    ) \\\\##########^-_\n" +
                    "       -############//  |\\^^/|  \\\\############-\n" +
                    "     _/############//   (@::@)   \\\\############\\_\n" +
                    "    /#############((     \\\\//     ))#############\\\n" +
                    "   -###############\\\\    (oo)    //###############-\n" +
                    "  -#################\\\\  / VV \\  //#################-\n" +
                    " -###################\\\\/      \\//###################-\n" +
                    "_#/|##########/\\######(   /\\   )######/\\##########|\\#_\n" +
                    "|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|\n" +
                    "`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '\n" +
                    "   `   `  `      `   / | |  | | \\   '      '  '   '\n" +
                    "                    (  | |  | |  )\n" +
                    "                   __\\ | |  | | /__\n" +
                    "                  (vvv(VVV)(VVV)vvv)\n" +
                    "\n" +
                    "=== 계속 하려면 엔터를 입력해주세요. ===");
        } catch (IOException e) {
        }
    }

    private void initialize() throws IOException {
        if (isSendable()) {
            this.out.writeUTF(clientId);
        }
    }

    private boolean isSendable() {
        return this.out != null;
    }

    private void sendMessage() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            while (isSendable()) {
                this.out.writeUTF("[" + clientId + "] " + scanner.nextLine());
            }
        }
    }

}
