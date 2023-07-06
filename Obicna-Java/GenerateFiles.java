import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.time.LocalDate;
public class GenerateFiles {
//TODO: Потребно е да се направи generator за фајлови. Фајлот треба да има 500 000 записи
//TODO: Вредноститет да не се од 0-50 туку различни и големи
//-GenerateFiles: Каде што ќе го генерира фајлот со 500 000 записи и ќе го зачува на локација

    public static void generateFile() {

        try {
            FileWriter myWriter = new FileWriter("filename.txt");

            for(int i=0;i<500000;i++){

                LocalDate randomDate = createRandomDate(1900, 2000);
                myWriter.write(randomDate.toString());
                myWriter.write("\n");
                System.out.println(randomDate.toString());


/*
                Random rand = new Random();
                // Setting the upper bound to generate the
                // random numbers in specific range
                int upperbound = 25002032;
                // Generating random values from 0 - 24
                // using nextInt()
                int random_number = rand.nextInt(upperbound);
                myWriter.write(Integer.toString(random_number));
                myWriter.write("\n");
                System.out.println(random_number);
*/

            }


            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }
    public static void main(String[]args){
        generateFile();
    }

}
