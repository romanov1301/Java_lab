package ua.iot.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterLion {


    public void writetofile(List<Animal> animals) {
        File csvText = new File("animal.csv");

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(csvText);
            for (Animal animal : animals) {
                fileWriter.write( animal.getHeders()+"\n"+animal.toCSV() +"\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




