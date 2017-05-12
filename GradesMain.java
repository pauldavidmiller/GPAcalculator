/**
 * Created by Paul on 12/19/2016.
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class GradesMain {
    private static double checkGrade(String classGrade){
        double gradeValue = 0;

        switch (classGrade) {
            case "A":
                gradeValue = 4.00;
                break;
            case "A-":
                gradeValue = 3.67;
                break;
            case "B+":
                gradeValue = 3.33;
                break;
            case "B":
                gradeValue = 3.00;
                break;
            case "B-":
                gradeValue = 2.67;
                break;
            case "C+":
                gradeValue = 2.33;
                break;
            case "C":
                gradeValue = 2.00;
                break;
            case "D+":
                gradeValue = 1.33;
                break;
            case "D":
                gradeValue = 1.00;
                break;
            case "F":
                gradeValue = 0.0;
                break;
        }

        return gradeValue;
    }

    public static void main(String[] args)  {
        Scanner scnr = new Scanner(System.in);
        String a;
        String b;
        String c;
        double d;
        double calculatedGPA;

        // ***********************************************************************

        System.out.println("Enter data for Class 1 (Course Subject (CSCI), Course number (1111), Grade in Class (A), Credits(#.#)) " +
                "separated by spaces: ");

        a = scnr.next();
        b = scnr.next();
        c = scnr.next();
        d = scnr.nextDouble();

        GradesClasses class1 = new GradesClasses(a, b, c, d);
        class1.printInfo();
        System.out.println("");

        // ***********************************************************************

        System.out.println("Enter data for Class 2 (Course Subject (CSCI), Course number (1111), Grade in Class (A), Credits(#.#)) " +
                "separated by spaces: ");

        a = scnr.next();
        b = scnr.next();
        c = scnr.next();
        d = scnr.nextDouble();

        GradesClasses class2 = new GradesClasses(a, b, c, d);
        class2.printInfo();
        System.out.println("");

        // ***********************************************************************

        System.out.println("Enter data for Class 3 (Course Subject (CSCI), Course number (1111), Grade in Class (A), Credits(#.#)) " +
                "separated by spaces: ");

        a = scnr.next();
        b = scnr.next();
        c = scnr.next();
        d = scnr.nextDouble();

        GradesClasses class3 = new GradesClasses(a, b, c, d);
        class3.printInfo();
        System.out.println("");

        // ***********************************************************************

        System.out.println("Enter data for Class 4 (Course Subject (CSCI), Course number (1111), Grade in Class (A), Credits(#.#)) " +
                "separated by spaces: ");

        a = scnr.next();
        b = scnr.next();
        c = scnr.next();
        d = scnr.nextDouble();

        GradesClasses class4 = new GradesClasses(a, b, c, d);
        class4.printInfo();
        System.out.println("");

        // ***********************************************************************

        System.out.println("Enter data for Class 5 (Course Subject (CSCI), Course number (1111), Grade in Class (A), Credits(#.#)) " +
                "separated by spaces: ");

        a = scnr.next();
        b = scnr.next();
        c = scnr.next();
        d = scnr.nextDouble();

        GradesClasses class5 = new GradesClasses(a, b, c, d);
        class5.printInfo();

        System.out.println("");

        // ***********************************************************************
        double class1Credits = class1.getClassCredits();
        double class2Credits = class2.getClassCredits();
        double class3Credits = class3.getClassCredits();
        double class4Credits = class4.getClassCredits();
        double class5Credits = class5.getClassCredits();

        double totalCredits = (class1.getClassCredits() + class2.getClassCredits() + class3.getClassCredits() +
                class4.getClassCredits() + class5.getClassCredits());

        System.out.println("Total Credits: " + totalCredits);

        double class1GPA = checkGrade(class1.getClassGrade());
        double class2GPA = checkGrade(class2.getClassGrade());
        double class3GPA = checkGrade(class3.getClassGrade());
        double class4GPA = checkGrade(class4.getClassGrade());
        double class5GPA = checkGrade(class5.getClassGrade());

        calculatedGPA = ((class1Credits * class1GPA) + (class2Credits * class2GPA) + (class3Credits * class3GPA) +
                (class4Credits * class4GPA) + (class5Credits * class5GPA)) / totalCredits;


        System.out.println("Calculated GPA: " + calculatedGPA);

        // ***********************************************************************
        //DOCUMENT

        System.out.println("Name of Document (Semester#.txt): ");
        String documentName = scnr.next();
        File file = new File(documentName);

        try {
            PrintWriter output = new PrintWriter(file);

            //courses
            output.println("First Course: ");
            output.println(class1.toString());
            output.println("");
            output.println("Second Course: ");
            output.println(class2.toString());
            output.println("");
            output.println("Third Course: ");
            output.println(class3.toString());
            output.println("");
            output.println("Fourth Course: ");
            output.println(class4.toString());
            output.println("");
            output.println("Fifth Course: ");
            output.println(class5.toString());
            output.println("");

            //credits
            output.print("Total Credits: ");
            output.println(totalCredits);

            //gpa
            output.print("Calculated GPA: ");
            output.println(calculatedGPA);

            output.close();

        } catch (IOException ex) {
            System.out.printf("Error: %s\n", ex);
        }



    }
}
