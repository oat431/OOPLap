package app;

public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
CourseInfo c1 = new CourseInfo(&quot;953231&quot;,&quot;Obj Oriented

Programming&quot;,3);

CourseInfo c2 = new CourseInfo(&quot;953212&quot;,&quot;Database&quot;, 3);
CourseInfo c3 = new CourseInfo(&quot;953101&quot;,&quot;Computers and

Programming&quot;, 3);

CourseInfo c4 = new CourseInfo(&quot;001101&quot;,&quot;Listening and Speaking

in Engl&quot;, 3);

CourseInfo c5 = new CourseInfo(&quot;206113&quot;,&quot;Cal for Software

Engineering&quot;, 3);

CourseInfo c6 = new CourseInfo(&quot;259109&quot;,&quot;Telecom in Thailand&quot;,

3);

CourseInfo c7 = new CourseInfo(&quot;955100&quot;,&quot;Learning through

Activities 1&quot;, 1);

CourseInfo c8 = new CourseInfo(&quot;001102&quot;,&quot;Reading and Writing in

Engl&quot;, 3);

CourseInfo c9 = new CourseInfo(&quot;207110&quot;,&quot;PHYS SC that changed

world&quot;, 3);

CourseInfo c10 = new CourseInfo(&quot;951100&quot;,&quot;Modern life and

Animation&quot;, 3);

CourseInfo c11 = new CourseInfo(&quot;953102&quot;,&quot;ADT and Problem

Solving&quot;, 3);

CourseInfo c12 = new CourseInfo(&quot;955101&quot;,&quot;Learning through

Activities 2&quot;, 1);

CourseInfo c13 = new CourseInfo(&quot;751100&quot;,&quot;Economics for

everyday life&quot;, 3);

StudentInfo s1 = new StudentInfo();
s1.setStudentId(&quot;492115001&quot;);
s1.setStudentFirstname(&quot;Alex&quot;);
s1.setStudentLastname(&quot;Anderson&quot;);
StudentRegistrationInfo StuRegInfo = new

StudentRegistrationInfo();
StuRegInfo.s = s1;
SemesterAcademicRecord sem1 = new
SemesterAcademicRecord(&quot;01&quot;,&quot;2549&quot;,&quot;1&quot;);

sem1.AddCourse(c4);
sem1.AddCourse(c5);
sem1.AddCourse(c6);
sem1.AddCourse(c7);
sem1.AddCourse(c3);
sem1.AddCourse(c13);
sem1.AddCourseGrade(&quot;001101&quot;,&quot;C&quot;);
sem1.AddCourseGrade(&quot;206113&quot;, &quot;B&quot;);
sem1.AddCourseGrade(&quot;259109&quot;,&quot;D+&quot;);
sem1.AddCourseGrade(&quot;751100&quot;,&quot;B+&quot;);
sem1.AddCourseGrade(&quot;953101&quot;,&quot;C&quot;);
sem1.AddCourseGrade(&quot;955100&quot;,&quot;C+&quot;);
StuRegInfo.rec[0] = sem1;

SemesterAcademicRecord sem2 = new
SemesterAcademicRecord(&quot;02&quot;,&quot;2549&quot;,&quot;2&quot;);

sem2.AddCourse(c8);
sem2.AddCourse(c9);
sem2.AddCourse(c10);
sem2.AddCourse(c11);
sem2.AddCourse(c12);
sem2.AddCourse(c1);
sem2.AddCourseGrade(&quot;953231&quot;,&quot;A&quot;);
sem2.AddCourseGrade(&quot;207110&quot;, &quot;C&quot;);
sem2.AddCourseGrade(&quot;001102&quot;,&quot;B+&quot;);
sem2.AddCourseGrade(&quot;955101&quot;,&quot;C+&quot;);
sem2.AddCourseGrade(&quot;951100&quot;,&quot;C&quot;);
sem2.AddCourseGrade(&quot;953102&quot;,&quot;D&quot;);
StuRegInfo.rec[1] = sem2;
PrintTranscriptInfo(StuRegInfo);
}

public static void PrintTranscriptInfo(StudentRegistrationInfo sinfo)
{
System.out.println(&quot;Transcript Information&quot;);
System.out.println(&quot;Student Id: &quot; + sinfo.s.getStudentId());
System.out.println(&quot;Student Name : &quot; +

sinfo.s.getStudentFirstname() + sinfo.s.getStudentLastname());

System.out.println(&quot; &quot;);
double totalgval = 0.0;
double totalcountcred = 0.0;
for(int i = 0; i &lt; sinfo.rec.length;i++)
{
if(sinfo.rec[i] != null){
System.out.println(sinfo.rec[i].GetSemesterInfo());
System.out.println(&quot;&quot;);
for(CourseInfo c : sinfo.rec[i].getAllCourseRegis())
{
System.out.println(c.getCourseFullInfo());
}
System.out.println(&quot;Semester Result =&quot;+
sinfo.rec[i].GetSemesterCredits() +&quot; credits with GPA = &quot;+
sinfo.rec[i].GetSemesterGPA());

totalcountcred = totalcountcred +

sinfo.rec[i].GetSemesterCredits();

totalgval = totalgval + sinfo.rec[i].GetTotalGval();
System.out.println(&quot;Total Result =&quot;+ totalcountcred +&quot;

credits with GPA = &quot;+ totalgval/totalcountcred);
System.out.println(&quot; &quot;);
}
}
}
}