package RegistrationSystem;

public class Register {
    static String firstname , lastName , email,idNumber;
    static int age ;
    static String Depart;
    static int chosenSwitch;
    static char Sex;

    public static String setFirstname(String firstname) {
        return Register.firstname = firstname;
    }

    public static String setLastName(String lastName) {
         return Register.lastName = lastName;
    }

    public static String setEmail(String email) {
        return Register.email = email;
    }

    public static String setIdNumber(String idNumber) {
        return Register.idNumber = idNumber;
    }

    public static int setAge(int age) {
        return Register.age = age;
    }

    public static String setDepart(String depart) {
         return Depart = depart;
    }
}
