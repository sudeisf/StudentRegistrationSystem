package RegistrationSystem;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main extends Register {
    public static void main(String[] args) {


        Scanner Input = new Scanner(System.in);
        boolean addAnotherUser = true;

        while (addAnotherUser) {
            addUser(Input);

            // Ask if the user wants to add another user
            System.out.println();
            System.out.print("Do you want to add another user? (yes/no): ");
            String response = Input.next().toLowerCase();

            if (!response.equals("yes")) {
                addAnotherUser = false;
            }
        }

        Input.close();
    }

    private static void addUser(Scanner  Input) {
        
        try {

            
            //Register register = new Register();
            Department department = new Department();
            //Table tb = new Table();

            System.out.println("Welcome to Haramaya university Registration System ");
            System.out.println();
            System.out.println(".....................................................");
            System.out.println();
            System.out.print("please enter your first name : ");
            firstname = Input.next();
            System.out.print("Please enter your last name : ");
            lastName = Input.next();

            while (true) {
                try {
                    System.out.print("please enter your Age : ");
                    age = Input.nextInt();
                    if (age < 0) {
                        throw new InputMismatchException("please enter the correct age.");
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println(e.getMessage());
                    Input.nextLine();
                }
            }

            Input.nextLine();
            while(true) {
                try {
                    System.out.print("please enter your Sex: ");
                    Sex = Character.toUpperCase(Input.next().charAt(0));
                    if (Sex != 'M' && Sex != 'F') {
                        throw new NoSuchElementException("please enter M for male or F for Female");
                    }
                    break;
                }catch (NoSuchElementException e){
                    System.out.println(e.getMessage());
                    Input.nextLine();
                }
            }
            Input.nextLine();

            System.out.print("please enter your iD number : ");
            idNumber = Input.next();
            System.out.print("please enter your email : ");
            email = Input.next();
            if(email.isEmpty()){
                System.out.println("please enter your email.");
            }
            System.out.println("........................................................");


            department.display_choice();
            chosenSwitch = Input.nextInt();
            Depart  = String.valueOf(department.choose_department(chosenSwitch));
            System.out.println("you chosen : "+ Depart);
            System.out.println();
            System.out.println();
            Courses.display_table();

        }catch (InputMismatchException e){
            System.out.println("Invalid Input : " + e.getMessage());
            Input.nextLine();
        }catch (NoSuchElementException N){
            System.out.println("Input error. Please provide valid input.");
            Input.nextLine();
        }catch (Exception S){
            System.out.println("Unexpected Error.");
            Input.nextLine();
        }
    
    
        

    }
    
}
