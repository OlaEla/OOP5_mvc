import Controler.Controler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();

        // Создание преподавателя
        controler.createTeacher("John", "Doe", "Teacher", "1980-01-01", 1);

        // Создание студентов
        controler.createStudent("Alice", "Smith", "Student", "2000-05-15");
        controler.createStudent("Bob", "Johnson", "Student", "2001-08-22");
        controler.createStudent("Charlie", "Williams", "Student", "1999-12-03");

        // Получение всех студентов
        controler.getAllStudent();

        // Создание учебной группы
        int teacherId = 1; // Идентификатор преподавателя
        List<Integer> studentIds = List.of(1, 2, 3); // Идентификаторы студентов
        controler.createStudyGroup(teacherId, studentIds);
    }
}