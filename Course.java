package app;

public class Course{
    public String Order;
    public String courseId;
    public String courseTitle;
    public double Credit;
    public String Grade;
    public Course(String order, String courseId, String courseTitle, double Credit, String grade){
        this.Order = order;
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.Credit = Credit;
        this.Grade = grade;
    }
    
    public String sum(){
        return "{" + this.Order + " : " + this.courseId + " : " + this.courseTitle + " : " + this.Credit + " : " + this.Grade + "}";
    }
    
}