package arraysPractice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class arrays {
    /*
    ScrumTeam
    Tester: {"Saya", "Kyndyz", "Taalai", "Elnura"}
    Developer: {"Asel", "Sa", "La"}
    SM: {Ayse}
    PO: {Amir}
    PA: {Anuar}
     */
    public static void main(String[] args) {
        String[][] scrumTeam = {
                {"Saya", "Kyndyz", "Taalai", "Elnura"},  //0
                {"Asel", "Sa", "La"},                    //1
                {"Ayse"},                                //2
                {"Amir"},                                //3
                {"Anuar"}                                //4

        };

        // System.out.println(Arrays.deepToString(scrumTeam));

        for (int i = 0; i <= scrumTeam.length - 1; i++) { //i: index of 1D arrays

            System.out.println(Arrays.toString(scrumTeam[i]));   //print the each group in scrum team

            for (int j = 0; j <= scrumTeam[i].length - 1; j++) { // j: index of elements

                System.out.println(scrumTeam[i][j]);
            }

        }

//
        for (int i = 0; i < scrumTeam.length; i++) {
//            System.out.println(Arrays.toString(scrumTeam[i]));
//            for (int j = 0; j < scrumTeam[i].length; j++) {
//                System.out.println(scrumTeam[i][j]);
//            }
//        }

            System.out.println("==================");

            for (String[] eachGroup : scrumTeam) {   //eachGroup: represents each 1D array in scrumTeam
                System.out.println(Arrays.toString(eachGroup));

                for (String eachName : eachGroup) {
                    System.out.println(eachName);
                }
            }
        }

        String[] employeeNames = {"Saya", "Kyndyz", "Taalai", "Elnura"};
        int[] employeesSalaries = {90, 20, 30, 40, 50};

        int max = employeesSalaries[0];
        String nameOfMax = "";

        int min = employeesSalaries[0];
        String nameOfMin = "";

        for (int i = 0; i <= employeeNames.length - 1; i++) {
            System.out.println(employeeNames[i] + " : $" + employeesSalaries[i]);

            if (employeesSalaries[i] >= max) {
                max = employeesSalaries[i];
                nameOfMax = employeeNames[i];
            }

            if (employeesSalaries[i] < min) {
                min = employeesSalaries[i];
                nameOfMin = employeeNames[i];
            }
        }

        System.out.println(nameOfMax + " has the max salary: $" + max);
        System.out.println(nameOfMin + " has the min salary: $" + min);

        System.out.println("===============");

        double[] salary = {10.1, 20.1, 30.1, 40.1};
        double sum = 0;

        double max1 = salary[0];
        double min1 = salary[0];

        for (double each : salary) {
            sum += each;

            if (each > max1) {
                max1 = each;
            }

            if (each < min1) {
                min1 = each;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average salary: " + sum / salary.length);
        System.out.println("Max: " + max1);
        System.out.println("Min: " + min1);


        System.out.println("========");

        String[] names = {"Saya", "Raya", "Laya", "Caya"};
        int[] budget = {100, 200, 300, 400};
        int max3 = 0;
        int sum3 = 0;

        for (int each : budget) {
            sum3 += each;

            if (each > max3) {
                max3 = each;
            }
        }

        System.out.println("Max: " + max3);
        System.out.println("Sum: " + sum3);
        for (int i = 0; i < names.length; i++) {
            if (max3 == budget[i]) {
                System.out.println("Max salary has " + names[i]);
            }
        }

        System.out.println("=========");


    }


}
