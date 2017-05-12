/**
 * Created by Paul on 12/19/2016.
 */
public class GradesClasses {
    private String className;
    private String departmentCode;
    private String classGrade;
    private double classCredits;

    // ***********************************************************************

    // Default constructor. Set protected variables to the empty string or 0
    public GradesClasses() {
        className = "";
        departmentCode = "";
        classGrade = "";
        classCredits = 0.0;
    }

    // ***********************************************************************

    // Constructor with parameters to set the private variables
    public GradesClasses(String className, String departmentCode, String classGrade, double classCredits) {
        this.className       = className;
        this.departmentCode  = departmentCode;
        this.classGrade      = classGrade;
        this.classCredits    = classCredits;
    }

    // ***********************************************************************

    public String getClassGrade(){
        return classGrade;
    }

    public double getClassCredits(){
        return classCredits;
    }

    public void printInfo(){
        System.out.println("Course Subject: " + className + ", Course Number: "
                    + departmentCode + ", Grade in Class: " + classGrade + ", Credits for Class: " + classCredits);
    }

    public String toString(){
        return ("Course Subject: " + className + ", Course Number: "
                + departmentCode + ", Grade in Class: " + classGrade + ", Credits for Class: " + classCredits);
    }

}
