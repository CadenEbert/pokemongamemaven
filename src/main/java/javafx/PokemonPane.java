package javafx;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class PokemonPane {
    VBox pane;
    String imageString;
    String cost;
    Button button;
    Text textCost;
    ImageView image;
    Text pokemonName;
    HBox hbox;
    Parent root;

    public PokemonPane(String name, boolean shiny, int list) throws FileNotFoundException {
        this.pane = new VBox();
        pane.setPrefSize(70, 130);
        this.imageString = Inventory.getImage(name, shiny);
        this.button = new Button("Sell");
        this.cost = Inventory.getCost(name, list, shiny);
        this.textCost = new Text("$" + cost);
        this.image = new ImageView(imageString);
        this.pokemonName = new Text(name);
        Inventory.totalCost.add(Integer.parseInt(cost));

        this.hbox = new HBox();
        this.hbox.getChildren().addAll(textCost, button);

        if (shiny == true) {
            pane.setBorder(new Border(
                    new BorderStroke(Color.YELLOW, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        } else {
            pane.setBorder(new Border(
                    new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        }
        this.pokemonName.setStyle("-fx-alignment: center");
        this.pokemonName.setStyle("flex-direction: column");
        this.pane.setStyle("-fx-background-color: #DCDCDC");
        this.pokemonName.setTextAlignment(TextAlignment.CENTER);
        this.pokemonName.setLayoutY(0.0);

        this.hbox.setAlignment(Pos.CENTER);
        this.pane.setAlignment(Pos.CENTER);
        this.pane.setPadding(new Insets(10, 10, 10, 10));
        this.hbox.setSpacing(15.0);

        // Assuming 'pane' is your Pane object and 'targetFlowPane' is the FlowPane you
        // want to move the pane to
        if (Main.scene2) {
            pane.setOnMouseClicked(event -> {
                Parent parent = pane.getParent();

                // Check if the parent is a FlowPane
                if (parent instanceof FlowPane) {
                    // Remove the pane from its current parent
                    ((FlowPane) parent).getChildren().remove(pane);

                    // Add the pane to the target FlowPane
                    PC_Controller controller = new PC_Controller();
                    controller.pcInventory2.getChildren().add(pane);
                }

            });
        }

        EventHandler<ActionEvent> sell = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                Main.coins.set(Main.coins.get() + Integer.parseInt(cost));
                ((FlowPane) pane.getParent()).getChildren().remove(pane);
                Main.paneList.remove(pane);
                for (int i = 0; i < Inventory.totalCost.size(); i++) {
                    if (Inventory.totalCost.get(i) == Integer.parseInt(cost)) {
                        Inventory.totalCost.remove(i);
                    }
                }

            }
        };
        this.button.setOnAction(sell);
        this.pane.getChildren().addAll(pokemonName, image, hbox);

    }

    public VBox getPane() {
        return pane;
    }

}
