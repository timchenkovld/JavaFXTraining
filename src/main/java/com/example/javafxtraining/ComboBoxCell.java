package com.example.javafxtraining;

import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class ComboBoxCell extends ListCell<String>{
    protected void updateItem(String item, boolean empty){
        super.updateItem(item, empty);
        if (item != null){
            if (item.equals("UA")){
                ImageView imageView = new ImageView(this.getClass().getResource("/pictures/ukraine.png").toExternalForm());
                imageView.setFitWidth(10);
                imageView.setFitHeight(10);
                setGraphic(imageView);
                setText("UA");
            }
            if (item.equals("USA")){
                ImageView imageView = new ImageView(this.getClass().getResource("/pictures/usa.png").toExternalForm());
                imageView.setFitWidth(10);
                imageView.setFitHeight(10);
                setGraphic(imageView);
                setText("USA");
            }
        }
    }
}
