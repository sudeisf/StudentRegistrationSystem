package RegistrationSystem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegisterTest
{
    @Test
    public void test(){
        String result1 = Register.setDepart("Computer Science");
        String result2 = Register.setFirstname("sudeis");
        String result3 = Register.setIdNumber(String.valueOf(1595));

        //String result1;
        assertEquals("Computer Science",result1);
        assertEquals("sudeis",result2);
        assertEquals("1595",result3);

    }
}
