package app;

import java.io.*;
import java.util.*;
public class semester{

    public semester(int n,String[] data) {
        
        Course[] cr = new Course[n];
        for(int i=0; i<n;i++ ){
            String[] course = data[i].split("[,]");
            String Order = course[0];
            String courseId = course[1];
            String courseTitle = course[2];
            double Credit = Double.parseDouble(course[3]);
            String Grade = course[4];
            cr[i] = new Course(Order, courseId, courseTitle, Credit, Grade);
        }
        
        for(Course i : cr){
            System.out.println(i.sum());
        }
        
    }
}