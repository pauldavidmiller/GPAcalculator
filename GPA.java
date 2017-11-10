package GradesUI;

/**
 * Created by Paul on 7/22/2017.
 */
public class GPA {


    private String classNameClass1;
    private String classNameClass2;
    private String classNameClass3;
    private String classNameClass4;
    private String classNameClass5;
    //////////////////////////////////
    private double classCreditsClass1;
    private double classCreditsClass2;
    private double classCreditsClass3;
    private double classCreditsClass4;
    private double classCreditsClass5;
    private double classGradeClass1;
    private double classGradeClass2;
    private double classGradeClass3;
    private double classGradeClass4;
    private double classGradeClass5;

    public GPA(String classNameClass1,
               String classNameClass2,
               String classNameClass3,
               String classNameClass4,
               String classNameClass5,
               String classCreditsClass1,
               String classCreditsClass2,
               String classCreditsClass3,
               String classCreditsClass4,
               String classCreditsClass5,
               String classGradeClass1,
               String classGradeClass2,
               String classGradeClass3,
               String classGradeClass4,
               String classGradeClass5) {


        this.classNameClass1 = classNameClass1;
        this.classNameClass2 = classNameClass2;
        this.classNameClass3 = classNameClass3;
        this.classNameClass4 = classNameClass4;
        this.classNameClass5 = classNameClass5;

        this.classCreditsClass1 = (double)Integer.parseInt(classCreditsClass1);
        this.classCreditsClass2 = (double)Integer.parseInt(classCreditsClass2);
        this.classCreditsClass3 = (double)Integer.parseInt(classCreditsClass3);
        this.classCreditsClass4 = (double)Integer.parseInt(classCreditsClass4);
        this.classCreditsClass5 = (double)Integer.parseInt(classCreditsClass5);
        this.classGradeClass1 = getGradeValue(classGradeClass1);
        this.classGradeClass2 = getGradeValue(classGradeClass2);
        this.classGradeClass3 = getGradeValue(classGradeClass3);
        this.classGradeClass4 = getGradeValue(classGradeClass4);
        this.classGradeClass5 = getGradeValue(classGradeClass5);


    }

    public double getCalculatedGPA(){

         double calculatedGPA = ((classCreditsClass1 * classGradeClass1) + (classCreditsClass2 * classGradeClass2)
                + (classCreditsClass3 * classGradeClass3) + (classCreditsClass4 * classGradeClass4) + (classCreditsClass5 * classGradeClass5)) / getTotalCredits();

        return calculatedGPA;
    }

    public double getTotalCredits(){
        double totalCredits = classCreditsClass1 + classCreditsClass2 + classCreditsClass3 + classCreditsClass4 + classCreditsClass5;
        return totalCredits;
    }


    public double getGradeValue(String classGrade){
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
            case "C-":
                gradeValue = 1.67;
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

    public String getClassNameClass1() {
        return classNameClass1;
    }

    public void setClassNameClass1(String classNameClass1) {
        this.classNameClass1 = classNameClass1;
    }

    public String getClassNameClass2() {
        return classNameClass2;
    }

    public void setClassNameClass2(String classNameClass2) {
        this.classNameClass2 = classNameClass2;
    }

    public String getClassNameClass3() {
        return classNameClass3;
    }

    public void setClassNameClass3(String classNameClass3) {
        this.classNameClass3 = classNameClass3;
    }

    public String getClassNameClass4() {
        return classNameClass4;
    }

    public void setClassNameClass4(String classNameClass4) {
        this.classNameClass4 = classNameClass4;
    }

    public String getClassNameClass5() {
        return classNameClass5;
    }

    public void setClassNameClass5(String classNameClass5) {
        this.classNameClass5 = classNameClass5;
    }

    public double getClassCreditsClass1() {
        return classCreditsClass1;
    }

    public void setClassCreditsClass1(double classCreditsClass1) {
        this.classCreditsClass1 = classCreditsClass1;
    }

    public double getClassCreditsClass2() {
        return classCreditsClass2;
    }

    public void setClassCreditsClass2(double classCreditsClass2) {
        this.classCreditsClass2 = classCreditsClass2;
    }

    public double getClassCreditsClass3() {
        return classCreditsClass3;
    }

    public void setClassCreditsClass3(double classCreditsClass3) {
        this.classCreditsClass3 = classCreditsClass3;
    }

    public double getClassCreditsClass4() {
        return classCreditsClass4;
    }

    public void setClassCreditsClass4(double classCreditsClass4) {
        this.classCreditsClass4 = classCreditsClass4;
    }

    public double getClassCreditsClass5() {
        return classCreditsClass5;
    }

    public void setClassCreditsClass5(double classCreditsClass5) {
        this.classCreditsClass5 = classCreditsClass5;
    }

    public double getClassGradeClass1() {
        return classGradeClass1;
    }

    public void setClassGradeClass1(double classGradeClass1) {
        this.classGradeClass1 = classGradeClass1;
    }

    public double getClassGradeClass2() {
        return classGradeClass2;
    }

    public void setClassGradeClass2(double classGradeClass2) {
        this.classGradeClass2 = classGradeClass2;
    }

    public double getClassGradeClass3() {
        return classGradeClass3;
    }

    public void setClassGradeClass3(double classGradeClass3) {
        this.classGradeClass3 = classGradeClass3;
    }

    public double getClassGradeClass4() {
        return classGradeClass4;
    }

    public void setClassGradeClass4(double classGradeClass4) {
        this.classGradeClass4 = classGradeClass4;
    }

    public double getClassGradeClass5() {
        return classGradeClass5;
    }

    public void setClassGradeClass5(double classGradeClass5) {
        this.classGradeClass5 = classGradeClass5;
    }
}
