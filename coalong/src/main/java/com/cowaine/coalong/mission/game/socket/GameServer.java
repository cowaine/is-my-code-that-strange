package com.cowaine.coalong.mission.game.socket;

import com.cowaine.coalong.mission.game.service.GameService;
import lombok.Getter;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentHashMap;

@Getter
public class GameServer {

    // key: 클라이언트 ID, value: 클라이언트 전송용 OutputStream
    private final ConcurrentHashMap<String, DataOutputStream> clientOutMap;
    private final GameService gameService;

    public GameServer() {
        this.clientOutMap = new ConcurrentHashMap<>();
        this.gameService = new GameService();
    }

    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println(getTime() + " Start server " + serverSocket.getLocalSocketAddress());

            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    ClientSession clientSession = new ClientSession(socket, this.clientOutMap, gameService);
                    clientSession.start();
                } catch (IOException e) {
                    // TODO: 클라이언트 접속 실패
                }
            }
        }
    }

    private String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }

}
