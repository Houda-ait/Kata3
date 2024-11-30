package software.ulpgc;



import software.ulpgc.control.HistogramGenerator;
import software.ulpgc.control.TsvTitleReader;
import software.ulpgc.model.Title;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TsvTitleReader reader = new TsvTitleReader(new File("./title.basics.tsv"));
        HashMap<String, Integer> histogram = generateHistogram(reader);

        showHistogram(histogram);
    }

    private static void showHistogram(HashMap<String, Integer> histogram) {
        for(String titleType : histogram.keySet()){
            System.out.println(titleType + " " + histogram.get(titleType));
        }
    }

    private static HashMap<String, Integer> generateHistogram(TsvTitleReader reader) {
        List<Title> titles = reader.read();
        return new HistogramGenerator().generate(titles);
    }
}
