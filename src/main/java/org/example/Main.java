package org.example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<User> users;

        try (Reader reader = new FileReader("books.json")) {
            users = gson.fromJson(reader, new TypeToken<List<User>>() {}.getType());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Задание 1
        users.forEach(System.out::println);
        
    }
}