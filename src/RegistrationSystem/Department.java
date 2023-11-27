package RegistrationSystem;

class Department extends Register {
    Department(){
        super();
    }
     String[] department = new String[]{"Computer science", "Software engineering", "information system", "information science"};
        void display_choice(){
           System.out.println("please choose the department you are in this semester");
           System.out.println("................................................................");
           System.out.println("press 0 for computer science .");
           System.out.println("press 1 for software engineering.");
           System.out.println("press 2 information system .");
           System.out.println("press 3 information science.");
           System.out.println("................................................................");
       }

     String choose_department(int c) {
             String result;
             switch (c) {
                 case 0:
                     result = department[0];
                     break;
                 case 1:
                     result = department[1];
                     break;
                 case 2:
                     result = department[2];
                     break;
                 case 3:
                     result = department[3];
                     break;
                 case 4:
                     result = department[4];
                     break;
                 default:
                     result = "unknown";
             }
             return result;

 }
 }
        
