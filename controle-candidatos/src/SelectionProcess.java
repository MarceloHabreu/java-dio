import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {

    public static void main(String[] args) {
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidate: candidates) {
            gettingInTouch(candidate);
        }
    }
    static void gettingInTouch(String candidate) {
        int attemptsMade = 1;
        boolean keepTrying = true;
        boolean answered = false;
        do {
            answered = answer();
            keepTrying = !answer();
            if(keepTrying)
            attemptsMade++;
            else
            System.out.println("Successful contact!!");

        } while(keepTrying && attemptsMade<3);

        if(answered)
        System.out.println("We managed to contact " + candidate + " on " + attemptsMade + " attempt.");
        else
        System.out.println("We couldn't contact " + candidate + ", maximum number of attempts " + attemptsMade + " made.");
    }

     //Auxiliary method
      static boolean answer(){
        return new Random().nextInt(3)==1;
      }

    public static void printSelected() {
        String[] candidates = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRICIO", "MIRELA",
                "DANIELA", "JOSÉ" };
        System.out.println("-------Printing the list of candidates by informing the index of the element.-------");
        for(int index=0; index < candidates.length; index++) {
            System.out.println("The candidate of nº " + index + " is " + candidates[index]);
        }
        System.out.println("-------Short form of interaction: For each-------");
        for (String candidate : candidates) {
            System.out.println("The successful candidate was: " + candidate);
        }
    }

    public static void selectionOfCandidates() {
        String[] candidates = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRICIO", "MIRELA",
                "DANIELA", "JOSÉ" };

        int selectedCandidates = 0;
        int currentCandidates = 0;
        double baseSalary = 2000.0;

        while (selectedCandidates < 5 && currentCandidates < candidates.length) {
            String candidate = candidates[currentCandidates];
            double intendedSalary = targetValue();
            System.out.println("The candidate " + candidate + " requested this salary amount: " + intendedSalary);
            if (baseSalary >= intendedSalary) {
                System.out.println("The candidate " + candidate + " has been selected for the vacancy.");
                selectedCandidates++;
            }
            currentCandidates++;
        }
    }

    static double targetValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analyzeCandidate(double intendedSalary) {
        double baseSalary = 2000.0;
        if (baseSalary > intendedSalary) {
            System.out.println("Call the candidate!");
        } else if (baseSalary == intendedSalary) {
            System.out.println("Call the candidate with a counter-proposal!");
        } else {
            System.out.println("Waiting for the result of the other candidates!");
        }
    }
}
