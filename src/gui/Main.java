package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    Stage window;
    Scene mainScene;
    Button enterRecipeOptionButton, viewRecipeOptionButton, openPantryOptionButton, openGroceryListOptionButton;


    @Override
    public void start(Stage primaryStage) throws Exception {
        setUpWindow(primaryStage);
        window.show();
    }

    // EFFECTS: sets up a decorated window with app's title and main scene
    private void setUpWindow(Stage primaryStage){
        window = primaryStage;
        window.setScene(makeMainScene());
        window.setTitle("Nao's Kitchen App");
        window.initStyle(StageStyle.DECORATED);
    }

    // EFFECTS: constructs the main menu scene with the option buttons
    private Scene makeMainScene(){

        // making the "MAIN MENU" texts / labels
        final Text mainMenuText = new Text("main menu");
        mainMenuText.setFont(new Font("Forte", 50));
        mainMenuText.setFill(Color.SADDLEBROWN);

        final Text mainMenuOptionText = new Text(150, 50, "please select an option below:");
        mainMenuOptionText.setFill(Color.CHOCOLATE);
        mainMenuOptionText.setFont(new Font("Courier New", 20));


        // making the main option buttons
        enterRecipeOptionButton = new Button("enter new recipe");
        stylizeButton(enterRecipeOptionButton);

        viewRecipeOptionButton = new Button("open a recipe");
        stylizeButton(viewRecipeOptionButton);

        openPantryOptionButton = new Button("open pantry");
        stylizeButton(openPantryOptionButton);

        openGroceryListOptionButton = new Button("open grocery list");
        stylizeButton(openGroceryListOptionButton);


        // set up VBox layout with text and buttons
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(mainMenuText, mainMenuOptionText, enterRecipeOptionButton,
                viewRecipeOptionButton, openPantryOptionButton, openGroceryListOptionButton);
        Insets inset = new Insets(10, 40, 10, 40);

        layout1.setMargin(mainMenuText, inset);

        layout1.setMargin(mainMenuOptionText, new Insets(10, 20, 10, 20));
        layout1.setMargin(enterRecipeOptionButton, inset);
        layout1.setMargin(viewRecipeOptionButton, inset);
        layout1.setMargin(openPantryOptionButton, inset);
        layout1.setMargin(openGroceryListOptionButton, inset);

        mainScene = new Scene(layout1);
        return mainScene;
    }

    // MODIFIES: this
    // EFFECTS:  sets the font and font size for the button's label text to courier and 15
    private void stylizeButton(Button button){
        button.fontProperty().setValue(new Font("Courier New", 15));
    }
}
