import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;


public class SortAndOutput {
    //TODO:Na input se predava fajlot so vrednosti
    //TODO:Sortiraj spored Your selection: B. Sort the input according to date/time (descending) (500000 entries)
    //TODO:Output (save) na fajlot


    //otvori go fajlot
    public static void main(String args[]) {
        try {


            RandomAccessFile file = new RandomAccessFile("C:\\Users\\user\\Desktop\\FINKI\\Sedmi semestar\\Presmetuvanje vo oblak\\proekt\\ProektOblak\\filename.txt", "r");
            String str;
            ArrayList<String> datesList = new ArrayList<>();
            while ((str = file.readLine()) != null) {
                //sort

                datesList.add(str);


                //  System.out.println(str);
            }
            Collections.sort(datesList);
            Collections.reverse(datesList);
            FileWriter myWriter = new FileWriter("sortedFileName.txt");
            System.out.println("Dates Object after sorting : \n");
            /* Iterating in the ArrayList using for-each loop */
            myWriter.write("Dates after sorting:\n");
            for (String dates : datesList) {
                //saving to the output file
                myWriter.write(dates.toString());
                myWriter.write("\n");
            }

            file.close();


            myWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
