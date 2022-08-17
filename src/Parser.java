import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    ArrayList<String> parse(File file){
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) !=null){
                lines.add(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
    int parseCount(File file){
        String[] words = null;
        String findWord = "Страдание";
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) !=null){
                words = line.split(" ");
                for(String word : words){
                    if(word.toUpperCase().contains(findWord.toUpperCase())){
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    int parseCountScaner(File file){
        String findWord = "Страдание";
        int count = 0;
        try (Scanner scanner = new Scanner(new FileReader(file))){
        while (scanner.hasNext())
            if(scanner.nextLine().toUpperCase().contains(findWord.toUpperCase())){
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return count;
    }
}
