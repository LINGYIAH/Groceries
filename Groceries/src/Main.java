import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String filePath = "C:\\Users\\16625\\Desktop\\LINGYIAH\\PROG-2-2024\\Groceries\\Groceries.txt";

        String fileToWrite = "C:\\Users\\16625\\Desktop\\LINGYIAH\\PROG-2-2024\\Groceries\\GroceriesFormatted.txt";


        String [] array = new String[4];
        
        double total = 0.0;
        String id;
        String itemName;
        String quantity; 
        double price;
        String separator = ",";


        FileReader fileReader = new FileReader(filePath);
        FileWriter fillWriter = new FileWriter(fileToWrite);

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fillWriter);

     String line;

        writer.write("****************************************************" + "\n");
        System.out.println("****************************************************");
        writer.write("ID#" + "\t" + "Item" + "\t\t" + "Quantity" + "\t\t" + "Price (€)" + "\n");
        System.out.println("ID#" + "\t" + "Item" + "\t\t" + "Quantity" + "\t" + "Price (€)");
        while((line = reader.readLine()) != null){

            array = line.split(separator); 
            id = array[0];
            itemName = array[1];
            quantity = array[2]; 
            price = Double.parseDouble(array[3]);

            total += price;

            System.out.println(id + "\t" + itemName + "\t\t" + quantity + "\t\t" + price);

            writer.write(id + "\t" + itemName + "\t\t" + quantity + "\t\t" + price);

            writer.newLine();

 
        }

        System.out.println("****************************************************");
        System.out.println("Total price of groceries: " + Math.round(total));
        System.out.println("****************************************************");
        
        writer.write("****************************************************");
        writer.write("\n" + "Total price of groceries: " + Math.round(total) + "\n");
        writer.write("****************************************************");
        
        reader.close();

        writer.flush();
        writer.close();

    }

}
