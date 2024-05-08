/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();
      System.out.println("1 - Dodawanie studenta 2 - Wyswietlanie informacji 3 - Wyszukiwanie studenta po nazwisku 4 - Wyjscie");
      int wybor = scanner.nextInt();
      switch(wybor){
        case 1:
          System.out.println("Podaj imie studenta:");
          String imie = scanner.next();
          System.out.println("Podaj nazwisko studenta");
          String nazwisko = scanner.next();
          System.out.println("Podaj wiek:");
          int wiek = scanner.nextInt();
          s.addStudent(new Student(imie, nazwisko, wiek));
          break;
        case 2:
          var students = s.getStudents();
          for(Student current : students) {
            System.out.println(current.ToString());
          }
          break;
        case 3:
          break;
        case 4:
          System.exit(0);
          break;
          
      }

    } catch (IOException e) {

    }
  }
}