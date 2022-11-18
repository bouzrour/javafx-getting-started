package org.openjfx;
import javafx.fxml.FXML;
import java.util.Random;

public class RandomValue {
    @FXML
    private double genRandVal(){
        double n;
        n = Math.random();
        return n;
    }
}

