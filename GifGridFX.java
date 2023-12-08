// Code corrected with JavaFX on 12/6/23
// Pierce Mohney
// SDEV 200
// M05 assignment 1
// This program will take four different images and put them into a grid layout of 2x2. 
// For program to work correctly change gif paths to your own computer's gif path.

package com.example.gifgridfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;

public class GifGridFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GIF Grid");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
//Creates window or Gifs

        // Change the paths to your own computer's path of gif images
        addGifToGrid(gridPane, "c:/user/example/Desktop/folder/images/flag1.gif", 0, 0);
        addGifToGrid(gridPane, "c:/user/example/Desktop/folder/images/flag2.gif", 1, 0);
        addGifToGrid(gridPane, "c:/user/example/Desktop/folder/images/flag6.gif", 0, 1);
        addGifToGrid(gridPane, "c:/user/example/Desktop/folder/images/flag7.gif", 1, 1);
//Change file paths to your own computer's images for program to work

        Scene scene = new Scene(gridPane, 900, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addGifToGrid(GridPane gridPane, String gifPath, int colIndex, int rowIndex) {
        File file = new File(gifPath);
        if (file.exists()) {
            Image image = new Image(file.toURI().toString());
            ImageView imageView = new ImageView(image);

            imageView.setFitWidth(400);
            imageView.setFitHeight(200);
//Creates an element from the file path of Gif to place in the window 

            gridPane.add(imageView, colIndex, rowIndex);
        } else {
            System.err.println("Error in " + gifPath);
//Error handling for filepaths 
        }
    }
}
