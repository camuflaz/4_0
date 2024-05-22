public class Student {

  private String Name;
  private int Age;
  private String Surname;
  private String Data;
  private int Datad;
  private int Datam;
  private int Datar;

  public Student(String name, String surname, int age, String data /*int datad, int datam, int datar*/) {
    Name = name;
    Age = age;
    Surname = surname;
    Data = data;
    Datad = datad;
    Datam = datam;
    Datar = datar;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSurname() {return Surname;}
  public String GetData() {return Data;}
  public int GetDatad() {return Datad;}
  public int GetDatam() {return Datam;}
  public int GetDatar() {return Datar;}

  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age) + " " + Data; /*" " + Datad + "-" + Datam + "-" + Datar;
    */
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse error","Parse Error", -1, "Parse Error"/*-1, -1, -1, -1*/);
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]     /* Integer.parseInt(data[3]),Integer.parseInt(data[4]),Integer.parseInt(data[5])*/);
  }
}