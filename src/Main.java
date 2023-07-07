import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String  str= "FaryTale";
        writeMethod(str);
           readMethod(str);
    }
    public static  void writeMethod(String fileName) throws IOException{
        FileWriter fileWriter= new FileWriter(fileName);
         fileWriter.write( " Стояло раннее утро, но семь маленьких гномов уже вышли из своего уютного домика и," +"\n"+
                 " весело посвистывая, отправились в алмазную шахту. По дороге они пели: «Бим-бом, бим-бом, поработать мы идем!»\n" +
                 "Проходя через лес,гномы услышали, как кто-то подпевает им. " +"\n"+
                 "Затем к ним слетела с ветки дерева маленькая синяя птичка, которая принесла прекрасную новость."+"\n");
         fileWriter.close();
    }
    public static void readMethod(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        System.out.println("Название:"+fileName);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
         fileReader.close();

        }
    }
}