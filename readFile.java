import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Factory[] fact;
        FileReader reader = new FileReader("/Users/egorvolosenko/IdeaProjects/000/src/cards.json");
        JsonReader jsonreader = new JsonReader(reader);
        Gson gson = new Gson();
        fact = gson.fromJson(jsonreader,Factory[].class);
        for(Factory fac:fact){
            System.out.println(fac.cards);
        }

    }
  public class Factory {
    String Cards;
}
}
