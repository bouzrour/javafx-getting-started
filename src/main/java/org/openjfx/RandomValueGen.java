package org.openjfx;
import java.lang.Math;
import javafx.fxml.FXML;

public class RandomValueGen {

    @FXML
    private double genRandVal() {
        double n;
        n = Math.random();
        return n;
    }
}