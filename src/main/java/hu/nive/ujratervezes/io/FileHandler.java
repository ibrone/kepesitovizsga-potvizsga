package hu.nive.ujratervezes.io;

import java.io.IOException;

public class FileHandler {

    public void sumIgnoreComments(String reader) throws IOException {
        String line;
        int sum = 0;
        while ((line = reader.trim()) != null) {
//            if line = reader.readLine() == "//"{
//            {
//
//            }
            int i = Integer.parseInt(line);
            sum = sum + i;


        }
    }
}