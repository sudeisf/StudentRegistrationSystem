package RegistrationSystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DepartmentTest {
    @Test
    public void test(){
        Department department = new Department();
        String result = department.choose_department(1);
        assertEquals("Computer science",result);
    }
    
}

