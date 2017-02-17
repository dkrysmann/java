import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InitialSetup {
    public static void main(String[] args) {
        Path studentsDataPath = Paths.get("StudentData.txt");
        List<String> data = new ArrayList<>();
        try {
            data = Files.readAllLines(studentsDataPath);
        }catch (IOException e){
            e.printStackTrace();
        }
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String[] tokens = data.get(i).split("\\s+");
            String facNum = tokens[0];
            String firstName = tokens[1];
            String lastName = tokens[2];
            String email = tokens[3];
            Integer age = Integer.parseInt(tokens[4]);
            Integer group = Integer.parseInt(tokens[5]);
            String phone = tokens[10];
            Student student = new Student(facNum,firstName,lastName,email,age,group,phone);
            for (int gradeIndex = 6; gradeIndex <= 9; gradeIndex++) {
                Integer grade = Integer.parseInt(tokens[gradeIndex]);
                student.getGrades().add(grade);
            }
            students.add(student);
        }
        students.stream().filter(student -> student.getGroup() == 2).sorted((s1,s2)-> s1.getFirstName()
                .compareTo(s2.getFirstName())).forEach(student -> System.out.println(student.getFirstName()
        + " " + student.getLastName()));
    }

}
