package e.eldaria.DataStorage;

import com.google.gson.Gson;
import e.eldaria.Eldaria;

import java.io.FileWriter;
import java.io.IOException;

public class DataOperators {
    static Gson gson = new Gson();

    //CRUD - Create, Read, Update and Delete
    public static void CreateNote(Object object){
        //FileWriter writer = new FileWriter(path)
        try (FileWriter writer = new FileWriter(Eldaria.GetFilePath())) {

            // Convert the Java object `person` into a JSON data and write to a file
            gson.toJson(object, writer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


//    public static void ReadNote(Object object){
//        //FileWriter writer = new FileWriter(path)
//        try (FileWriter writer = new FileWriter(Eldaria.GetFilePath())) {
//
//            // Convert the Java object `person` into a JSON data and write to a file
//            gson.toJson(object, writer);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }


}
