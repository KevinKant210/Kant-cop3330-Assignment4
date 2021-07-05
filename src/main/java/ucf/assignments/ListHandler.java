package ucf.assignments;

import java.util.ArrayList;

public class ListHandler {
    private static int numLists = 0;

    //make this static to avoid shenanigans where the user closes the initial app which would have contained the reference to this object causing it to be garbage collected
    //also static since only one ListHandler can exist at a time
    public static ArrayList<ToDoList> ToDoListHolder = new ArrayList<>();


    public static void CreateList(String ListTitle){
        //create new ToDoList Item
        //add item to todoListHolder
        //increment numLists by one

    }

    public static boolean DeleteList(String ListTitle){
        //for Lists in ListHolder
            //if A list with ListTitle is found

                //delete List
            //decrement numLists by 1
            // return true
            //else return false\


        return false;
    }



}
