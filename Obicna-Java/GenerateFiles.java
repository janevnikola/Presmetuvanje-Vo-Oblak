import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateFiles {
//TODO: Потребно е да се направи generator за фајлови. Фајлот треба да има 500 000 записи
//TODO: Вредноститет да не се од 0-50 туку различни и големи
//-GenerateFiles: Каде што ќе го генерира фајлот со 500 000 записи и ќе го зачува на локација

    public static void generateFile() {

        try {
            FileWriter myWriter = new FileWriter("filename.txt");

            for(int i=0;i<500000;i++){

                Random rand = new Random();
                // Setting the upper bound to generate the
                // random numbers in specific range
                int upperbound = 250020320;
                // Generating random values from 0 - 24
                // using nextInt()
                int random_number = rand.nextInt(upperbound);
                myWriter.write(Integer.toString(random_number));
                myWriter.write("\n");
                System.out.println(random_number);

            }


            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
    public static void main(String[]args){
        generateFile();
    }

}
