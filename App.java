package app;

//62 21 15 039
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public String getStudentID() {
        return studentId;
    }

    private String studentId;

    public static void main(String args[]) {
        App app = new App();
        app.setStudentId("622115039");
    }

    public void setStudentId(String studentId) {

        if (!studentId.matches("[0-9]+")) {
            System.out.println("Invalid");
            return;
        }

        if (studentId.length() != 9) {
            System.out.println("Invalid");
            return;
        }

        String year = studentId.substring(0, 2);
        String faculty = studentId.substring(2, 4);
        String type = studentId.substring(4, 7);
        int b = Integer.valueOf(year);
        int n = Integer.valueOf(faculty);

        if (b > 62) {
            System.out.println("Invalid");
        } else if (n > 21) {
            System.out.println("Invalid");
        } else {
            this.studentId = studentId;
        }
    }
    
}
