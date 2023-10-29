package com.example.circlesdrawing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloController {

    @FXML
    private TextField fname;

    @FXML
    private AnchorPane screen;

    @FXML
    void loadFile(ActionEvent event) throws IOException {
        String file = fname.getText();
        List<String> lines = Files.readAllLines(Path.of(file));
        int coords[][] = new int[lines.size()][3];
        int i=0;
        for (String c: lines) {
            String[] nums = c.split(" ");
            coords[i][0] = Integer.valueOf(nums[0]);
            coords[i][1] = Integer.valueOf(nums[1]);
            coords[i][2] = Integer.valueOf(nums[2]);
            System.out.println(coords[i][1]);
            i++;
        }
        Circle c1 = new Circle(coords[0][0], coords[0][1], coords[0][2]);
        Circle c2 = new Circle(coords[1][0], coords[1][1], coords[1][2]);
        Circle c3 = new Circle(coords[2][0], coords[2][1], coords[2][2]);
        Circle c4 = new Circle(coords[3][0], coords[3][1], coords[3][2]);
        screen.getChildren().addAll(c1, c2, c3, c4);
            }


}