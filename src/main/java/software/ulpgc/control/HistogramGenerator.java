package software.ulpgc.control;

import software.ulpgc.model.Title;

import java.util.HashMap;
import java.util.List;

public class HistogramGenerator {


    public HashMap<String, Integer> generate(List<Title> titles) {
        HashMap<String, Integer> result = new HashMap<>();
        for(Title title: titles){
            result.put(title.titleType().name(), result.getOrDefault(title.titleType().name(), 0) +1);
        }

        return result;
    }
}
