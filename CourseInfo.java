package app;

public class CourseInfo {
    private String courseId;
    private String courseName;
    private int courseCredits;
    private String courseGrade;

    public CourseInfo() {
    }

    public CourseInfo(String id, String cname, int credits) {
        this.courseId = id;
        this.courseName = cname;
        this.courseCredits = credits;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {

        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

public double getCourseGradeValue()
{
double gvalue = 0.0;
switch(courseGrade)
{
case &quot;A&quot;:
gvalue = 4.0;
break;
case &quot;B+&quot;:
gvalue = 3.5;

break;
case &quot;B&quot;:
gvalue = 3.0;
break;
case &quot;C+&quot;:
gvalue = 2.5;
break;
case &quot;C&quot;:
gvalue = 2.0;
break;
case &quot;D+&quot;:
gvalue = 1.5;
break;
case &quot;D&quot;:
gvalue = 1.0;
break;
case &quot;F&quot;:
gvalue = 0.0;
break;

}
return gvalue;
}

public String getCourseFullInfo()
{
return courseId + &quot; &quot;+ courseName + &quot; &quot;+ courseCredits+ &quot; &quot; +courseGrade;
}
}
