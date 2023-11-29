package RegistrationSystem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseTest {
    @Test
    public void test(){
        int result = CourseCheck.Total_Array(Courses.course_ECTS);
        int result2 = CourseCheck.Total_Array(Courses.course_creditHour);
        assertEquals(136,result);
        assertEquals(136,result2);

    }
}


