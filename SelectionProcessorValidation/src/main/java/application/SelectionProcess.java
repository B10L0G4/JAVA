package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {
    public static void main(String[] args) {
        candidateSelection();

    }

    ;

    public static void candidateSelection() {
        String[] candidates = {"Jess", "Marion", "Lestat", "Aelin", "Roan", "Damon", "Matthew", "July", "Jude", "Simon"};

        int selectedCandidates = 0;
        int ActualCandidates = 0;
        double salary = 2000.00;

        while (selectedCandidates < 5 && ActualCandidates < candidates.length) {
            String candidate = candidates[ActualCandidates];
            double intendedSalary = salaryClaim();


            if (intendedSalary <= salary) {
                System.out.println("Candidate: " + candidate + " Intended Salary: " + intendedSalary);
                System.out.println("Call the candidate for an interview");
                selectedCandidates++;

                int tentativesContact = 0;
                boolean contactContinue = true;
                boolean contactOk = false;
                do {
                    contactOk = candidatePhone();
                    if (contactContinue) {
                        tentativesContact++;
                    }

                } while (contactContinue && tentativesContact < 3);
                if (contactOk) {
                    System.out.println("Interview scheduled "+ candidate + " na " + tentativesContact + " tentative successful\n");
                } else {
                    System.out.println("Interview canceled "+ candidate + " na " + tentativesContact + " tentative unsuccessful\n");
                }
            }
            ActualCandidates++;


        }

    }
    static boolean candidatePhone() {
        return new Random().nextInt(3)==1;
    }
    static double salaryClaim() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }
}

//     public static void analyzeCandidates(double intendedSalary) {
//            double salary = 2000.00;
//            if (salary > intendedSalary) {
//                System.out.println("Call the candidate for an interview");
//
//            } else if (intendedSalary == salary) {
//                System.out.println("Call the candidate for an interview and offer the same salary");
//            } else {
//                System.out.println("Await for new candidates");
//            }
//        }
//    }



