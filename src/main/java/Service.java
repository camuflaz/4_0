import java.util.Collection;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
public class Service {

  public void addStudent(Student student) throws IOException {
    var f = new FileWriter("db.txt", true);
    var b = new BufferedWriter(f);
    b.append(student.ToString());
    b.newLine();
    b.close();
  }

  public Collection<Student> getStudents() throws IOException {
    var ret = new ArrayList<Student>();
    var f = new FileReader("db.txt");
    var reader = new BufferedReader(f);
    String line = "";
    while (true) {
      line = reader.readLine();
      if(line == null)
        break;
      ret.add(Student.Parse(line));
    }
    reader.close();
    return ret;
  }

  public Student addStudent(String name, String surname, int age, String data){
          return null;
  }

  public Student findStudentByName(String surname) {
        try {
          FileReader file = new FileReader("db.txt");
          BufferedReader br = new BufferedReader(file);
          String line;
          while ((line = br.readLine()) != null) {
              Student student = Student.Parse(line);
              if (student.getSurname().equalsIgnoreCase(surname)) {
                  return student;
              }
          }
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
        return null;
     }
}