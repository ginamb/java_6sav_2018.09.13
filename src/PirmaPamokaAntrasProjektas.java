import java.util.Scanner;

public class PirmaPamokaAntrasProjektas {
    public static void main(String[] args) {
        System.out.println("Iveskite zodi");
        String word;
        do {
            Scanner scanner = new Scanner(System.in);// naujas objektas System in duomenys iš konsoles
            word = scanner.nextLine();//next nuskaito iki tarpo
            int countLetters = countLetters(word);
            if (word.length() % 2 == 0) {
                System.out.println("Ivestas zodis" + "word" + "jo ilgis yra" + word.length() + "rasta raidziu");
            }else{
                    System.out.println("Ivestas zodis" + word+ "jo ilgis yra" +word.length());}
                System.out.println(word);
            } while (!word.toLowerCase().equals("pabaiga")) ;
        }

        private static int countLetters (String word){
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a') {
                    count++;
                }
            }
            return count;
        }

    }


