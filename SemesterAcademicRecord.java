import java.util.ArrayList;
import java.util.List;

public class SemesterAcademicRecord {
    private String recId;
    private String academicYear;
    private String semester;

private List&lt;CourseInfo&gt; courselist = new ArrayList&lt;CourseInfo&gt;();
public SemesterAcademicRecord(String id,String ayear,String s)
{
this.recId = id;this.academicYear = ayear;this.semester = s;
}

    public void AddCourse(CourseInfo c) {
        courselist.add(c);
    }

public List&lt;CourseInfo&gt; getAllCourseRegis()
{
return this.courselist;
}

public String GetSemesterInfo()
{
return &quot;Semester &quot;+ semester + &quot; Academic Year &quot; +

academicYear;
}

    public void AddCourseGrade(String courseid, String grade) {
        for (CourseInfo c : courselist) {
            if (c.getCourseId() == courseid) {
                c.setCourseGrade(grade);
            }
        }
    }

    public double GetSemesterCredits() {
        double cre = 0.0;
        for (CourseInfo c : courselist) {
            cre = cre + c.getCourseCredits();
        }
        return cre;
    }

    public double GetSemesterGPA() {
        double d = 0.0; // double cre = 0.0;
        for (CourseInfo c : courselist) {
            d = d + c.getCourseGradeValue() * c.getCourseCredits();
        }
        return d / this.GetSemesterCredits();
    }

    public double GetTotalGval() {

        double d = 0.0; // double cre = 0.0;
        for (CourseInfo c : courselist) {
            d = d + c.getCourseGradeValue() * c.getCourseCredits();
        }
        return d;
    }
}

public class StudentRegistrationInfo {
    public StudentInfo s;
    public SemesterAcademicRecord[] rec;

    public StudentRegistrationInfo() {
        rec = new SemesterAcademicRecord[24];
    }
}