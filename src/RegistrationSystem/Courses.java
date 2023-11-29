package RegistrationSystem;

 class Courses{
      static int i = Register.chosenSwitch;

     static String[][] CourseList = {
             {"Operating system                            ", "Fundamental of Networking                  ", "Probability and statistics                 ", "Fundamental of software Security          ", "Data Structure and Algorithms             ", "Object-Oriented programming                "},
             {"Applied mathematics I                       ", "Fundamental of Database Systems            ", "Web design and programming                 ", "Fundamental of cloud computing            ", "Linear algebra                            ", "Numerical Analysis                         "},
             {"Computer programming                        ", "Discrete Mathematics and Combinator        ", "Advanced programming                       ", "Fundamental of Distributed System         ", "Android Development                       ", "Requirement Engineering                    "},
             {"Internet programming                        ", "Advanced Database Systems                  ", "Microprocessor and assembly language       ", "computer organization and architecture    ", "Computer graphics and multimedia          ", "Software Design And Analysis               "}
     };

     static int[][] course_creditHour ={{4,4,3,3,3,3},{3,3,3,4,3,3},{3,3,3,4,4,3},{4,3,4,3,3,4}};
     static int[][] course_ECTS ={{7,7,5,5,5,5},{5,5,5,5,7,5},{5,5,5,7,7,5},{7,5,7,5,5,7}};
     static final int[] Total_creditHour = {20,19,20,21};
     static final int[] Total_ECTS = {34,32,34,36};
static  void display_table() {

    System.out.println(".....................................................................................................................................");
    System.out.println("                                              Welcome to Haramaya University                                                      ");
    System.out.println(".....................................................................................................................................");
    System.out.println("                                             Department Of " + Register.Depart +"                                                 ");
    System.out.println(".................................................................................................................................... ");
    System.out.println("                                  First-name: " + Register.firstname + "       Last-name: " + Register.lastName + "        ID-Number: " + Register.idNumber);
    System.out.println("......................................................................................................................................");
    System.out.println("                          Email : " + Register.email + "                        "+"Age: " + Register.age + "                          "+"Sex: "+ Register.Sex);
    System.out.println("......................................................................................................................................");
    System.out.println("                Course                                   Credit Hour                       ECTS                                       ");
    System.out.println("......................................................................................................................................");
    System.out.println("1.     " + CourseList[i][0] + "             " + course_creditHour[i][0] + "                          " + course_ECTS[i][0]);
    System.out.println("2.     " + CourseList[i][1] + "              " + course_creditHour[i][1] + "                          " + course_ECTS[i][1]);
    System.out.println("3.     " + CourseList[i][2] + "              " + course_creditHour[i][2] + "                          " + course_ECTS[i][2]);
    System.out.println("4.     " + CourseList[i][2] + "              " + course_creditHour[i][3] + "                          " + course_ECTS[i][3]);
    System.out.println("5.     " + CourseList[i][3] + "               " + course_creditHour[i][4] + "                          " + course_ECTS[i][4]);
    System.out.println("6.     " + CourseList[i][4] + "               " + course_creditHour[i][5] + "                          " + course_ECTS[i][5]);
    System.out.println(".......................................................................................................................................");
    System.out.println("                                                    TOTAl Chr:" + Total_creditHour[i] + "                    TOTAL ECTS:" + Total_ECTS[i]);
    System.out.println(".......................................................................................................................................");
    System.out.println("                                    Congratulation you have been Registered                                                            ");
    System.out.println(".......................................................................................................................................");
    }
}
class CourseCheck extends Courses{
    public static int Total_Array(int[][] array) {
        int sum = 0;
        for (int[] row : course_ECTS) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
}


