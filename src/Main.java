import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // create instance of Random class
        Random randGenerator = new Random();
        //int min=3, max=18;
        // Generate random integers in range 3 to 18
        //int rand_int1 = rand.nextInt(min,max);
        //int rand_int2 = rand.nextInt(min,max);
        //String RNGAbilityScoreStatement="Random Ability Score Integers: "+rand_int1+", "+rand_int2;
        ArrayList<Integer> abilityScores = new ArrayList<>(6);
        // Print random integers

        //System.out.println(RNGAbilityScoreStatement);
        //System.out.println("Ignore above text");
        //System.out.println();

        int amountOfAbiScores = 6;
        ArrayList<Integer> abilityScoreModifiers = new ArrayList<>(6);
        String finalRolledVals = "Final numbers total are: ";
        for (int i = 0; i < amountOfAbiScores; i++) {
            System.out.println();
            System.out.println("Generating score number: " + (i + 1));
            ArrayList<Integer> rolledNumbers = new ArrayList<>(4);
            int minNumber = 100;
            int minNumIndex = 0;
            for (int j = 0; j < 4; j++) {
                int randomGeneration = randGenerator.nextInt(1,7);
                rolledNumbers.add(randomGeneration);
                if (rolledNumbers.get(j) < minNumber) {
                    minNumber = rolledNumbers.get(j);
                    minNumIndex = j;
                }
                System.out.println("Rolled numbers: " + rolledNumbers.get(j));
            }
            System.out.println("Minimum number from rolled was: " + minNumber);
            rolledNumbers.remove(minNumIndex);
            int calculatedNum = 0;
            for (Integer rolledNumber : rolledNumbers) {
                calculatedNum += rolledNumber;
            }
            rolledNumbers.clear();
            abilityScores.add(calculatedNum);
            System.out.println("Added the Ability score of: " + abilityScores.get(i));
        }
        for (int i = 0; i < abilityScores.size(); i++) {
            finalRolledVals = finalRolledVals + String.valueOf(abilityScores.get(i)) + ", ";
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(finalRolledVals);
        System.out.println();
        for (int i = 0; i < abilityScores.size(); i++) {
            abilityScoreModifiers.add((int) (Math.floor(((double) (abilityScores.get(i) - 10) / 2))));
        }
        System.out.println(abilityScores);
        System.out.println(abilityScoreModifiers);

        abilityScores.clear();
        abilityScoreModifiers.clear();
    }
}