package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ListWindowController {

    //FXML Content
    /*
        Buttons
            ChangeTitleButton
            DisplayAllItemsButton
            DisplayCompeteButton
            DisplayIncompleteButton
            NewItemButton
            ListDeleteButton
            ListSaveButton
        TextField
            TitleChangeInputTextField
     */


    //private int Items = 0;

   // private ToDoList currList;



    public void ChangeTitleButtonClicked(ActionEvent actionEvent) {
        //grab user input from text
        //use currList.settitle to set title to what the user wants
        //change the text in the fxml file
    }

    public void DisplayAllItemsClicked(ActionEvent actionEvent) {
        //for items in currList
        //generate a ItemWindow for each item in the curr list
        //pass in the item to the ItemWindowConstructor so it can take responsibiulity for it
    }

    public void DisplayCompleteItemsClicked(ActionEvent actionEvent) {
        //currList.displayCompleteItems will return the list of items that are complete
        //if list is empty return
        //for items in currList.displayCompleteItems
        //generate a ItemWindow passing in the item
    }

    public void DisplayNon_CompleteItemsClicked(ActionEvent actionEvent) {
        //create a temp list
        // set temp list equal to result of currList.displayIncomplete
        //if temp is empty return since all items are complete
        //for items in temp list
        //generate a ItemWindow passing in the item
    }

    public void NewItemButtonClicked(ActionEvent actionEvent) {

        //nice idea* have each controller save how many items they have in their list and display it in title?


        //create new item obj
        //pass new item obj to itemWindowController

        //change this
        Parent root = null;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ItemWindow.fxml"));
            /*
            ItemWindowController controller = new ItemWindowController();
            Item item = new Item("01-01-01","New Description");
            controller.setCurrItem(item);
            loader.setController(controller);
            */

            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }





        Stage stage = new Stage();

        Scene scene = new Scene(root);

        stage.setTitle("Item" );
        stage.setScene(scene);

        stage.initModality(Modality.NONE);
        stage.show();
    }

    

    public void SaveThisListButtonClicked(ActionEvent actionEvent) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("SaveList.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Single Save");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();

    }

    public void DeleteListClicked(ActionEvent actionEvent) {
        //we can call the static ListHandler method deleteList and pass in currList as the parameter

    }

    public void SortByDateClicked(ActionEvent actionEvent) {
        //call currList.sort method to sort the list by date
    }
}
