package org.openjfx;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    MyChart myChart = new MyChart();


    @FXML
    private void initialize() {
        ChartUpdater server = new ChartUpdater(myChart);
        server.setDaemon(true);
        server.start();
    }


    @FXML
    public static void addClient() throws IOException {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(" 0.3 ");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}