package GradesUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Paul on 7/8/2017.
 */
public class GradesMain extends JFrame {
    private JPanel newGradesRoot;
    private JPanel southButtonPanel;
    private JPanel allTextPanel;
    private JTextField ClassNameClass1;
    private JTextField ClassNameClass2;
    private JTextField ClassNameClass3;
    private JTextField ClassNameClass4;
    private JTextField ClassNameClass5;
    private JLabel ClassNameTitle;
    private JLabel ClassGradeTitle;
    private JLabel ClassCreditTitle;
    private JPanel MainField;
    private JPanel Titles;
    private JPanel ClassNamePanel;
    private JPanel ClassCreditsPanel;
    private JPanel ClassGradesPanel;
    private JPanel ClassTitles;
    private JPanel TextBoxes;
    private JButton CalculateButton;
    private JLabel Class1Title;
    private JLabel Class2Title;
    private JLabel Class3Title;
    private JLabel Class4Title;
    private JLabel Class5Title;
    private JComboBox ClassGradeClass1;
    private JComboBox ClassGradeClass2;
    private JComboBox ClassGradeClass3;
    private JComboBox ClassGradeClass4;
    private JComboBox ClassGradeClass5;
    private JTextField ClassCreditsClass1;
    private JTextField ClassCreditsClass2;
    private JTextField ClassCreditsClass3;
    private JTextField ClassCreditsClass4;
    private JTextField ClassCreditsClass5;
    private JButton CreateNewButton;
    private static ArrayList<GPA> gpa = new ArrayList<>();
    private int i = 0;

    double cumulativeGradesTimesCredits = 0;
    double cumulativeCredits = 0;
    double cumulativeGPA = 0;

    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */


    public GradesMain() throws HeadlessException {
        super("Contact Panel");


        CalculateButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                newGPACalculation();

                int result = JOptionPane.showOptionDialog(null,
                        "This GPA is: " + gpa.get(i).getCalculatedGPA() + "    Cumulative GPA is: " + getCumulativeGPA() + "      Save?", "Calculated GPA",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, new String[] {"Yes", "No"}, JOptionPane.NO_OPTION);


                if (result == JOptionPane.YES_OPTION){
                    String nameDoc = JOptionPane.showInputDialog(null, "Enter name of document: ", null);
                    nameDoc = nameDoc + ".txt";
                    File file = new File(nameDoc);

                    try {
                        PrintWriter output = new PrintWriter(file);

                        //courses
                        output.println("FIRST COURSE: ");
                        output.println("Class Name: " + gpa.get(i).getClassNameClass1() + " Class Credits: "
                                + gpa.get(i).getClassCreditsClass1() + " Class Grade: " + gpa.get(i).getClassGradeClass1());
                        output.println("");

                        output.println("SECOND COURSE: ");
                        output.println("Class Name: " + gpa.get(i).getClassNameClass2() + " Class Credits: "
                                + gpa.get(i).getClassCreditsClass2() + " Class Grade: " + gpa.get(i).getClassGradeClass2());
                        output.println("");

                        output.println("THIRD COURSE: ");
                        output.println("Class Name: " + gpa.get(i).getClassNameClass3() + " Class Credits: "
                                + gpa.get(i).getClassCreditsClass3() + " Class Grade: " + gpa.get(i).getClassGradeClass3());
                        output.println("");

                        output.println("FOURTH COURSE: ");
                        output.println("Class Name: " + gpa.get(i).getClassNameClass4() + " Class Credits: "
                                + gpa.get(i).getClassCreditsClass4() + " Class Grade: " + gpa.get(i).getClassGradeClass4());
                        output.println("");

                        output.println("FIFTH COURSE: ");
                        output.println("Class Name: " + gpa.get(i).getClassNameClass5() + " Class Credits: "
                                + gpa.get(i).getClassCreditsClass5() + " Class Grade: " + gpa.get(i).getClassGradeClass5());
                        output.println("");

                        output.println("");
                        output.println("");

                        //credits
                        output.println("Total Credits: " + gpa.get(i).getTotalCredits());


                        //gpa
                        output.println("Calculated GPA: " + gpa.get(i).getCalculatedGPA());


                        //cumulative gpa
                        output.println("Cumulative GPA: " + getCumulativeGPA());

                        i++;

                        output.close();

                    } catch (IOException ex) {
                        System.out.printf("Error: %s\n", ex);
                    }
                }


            }
        });

        CreateNewButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculated GPA");
        frame.setContentPane(new GradesMain().newGradesRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void newGPACalculation(){

        GPA newGPA = new GPA(ClassNameClass1.getText(), ClassNameClass2.getText(), ClassNameClass3.getText(),
                ClassNameClass4.getText(), ClassNameClass5.getText(),
                ClassCreditsClass1.getText(), ClassCreditsClass2.getText(),
                ClassCreditsClass3.getText(), ClassCreditsClass4.getText(), ClassCreditsClass5.getText(),
                ClassGradeClass1.getSelectedItem().toString(),
                ClassGradeClass2.getSelectedItem().toString(), ClassGradeClass3.getSelectedItem().toString(),
                ClassGradeClass4.getSelectedItem().toString(), ClassGradeClass5.getSelectedItem().toString());

        gpa.add(newGPA);
    }

    public void resetFields(){
        ClassNameClass1.setText(null);
        ClassNameClass2.setText(null);
        ClassNameClass3.setText(null);
        ClassNameClass4.setText(null);
        ClassNameClass5.setText(null);
        ClassCreditsClass1.setText(null);
        ClassCreditsClass2.setText(null);
        ClassCreditsClass3.setText(null);
        ClassCreditsClass4.setText(null);
        ClassCreditsClass5.setText(null);
        ClassGradeClass1.setSelectedItem("A");
        ClassGradeClass2.setSelectedItem("A");
        ClassGradeClass3.setSelectedItem("A");
        ClassGradeClass4.setSelectedItem("A");
        ClassGradeClass5.setSelectedItem("A");
    }

    public double getCumulativeGPA(){
        cumulativeCredits = 0;
        cumulativeGradesTimesCredits = 0;
        cumulativeGPA = 0;

        for (int j = 0; j < gpa.size(); j++){
            cumulativeCredits += gpa.get(j).getTotalCredits();
            cumulativeGradesTimesCredits += (gpa.get(j).getClassCreditsClass1() * gpa.get(j).getClassGradeClass1())
                    + (gpa.get(j).getClassCreditsClass2() * gpa.get(j).getClassGradeClass2())
                    + (gpa.get(j).getClassCreditsClass3() * gpa.get(j).getClassGradeClass3())
                    + (gpa.get(j).getClassCreditsClass4() * gpa.get(j).getClassGradeClass4())
                    + (gpa.get(j).getClassCreditsClass5() * gpa.get(j).getClassGradeClass5());
        }

        cumulativeGPA = cumulativeGradesTimesCredits/cumulativeCredits;
        return cumulativeGPA;
    }


}
