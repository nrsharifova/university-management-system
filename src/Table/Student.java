package Table;

public class Student {

    public int idStudent;
    public String name;
    public String surname;
    public String birth;
    public int idFaculty;
    public int idMajor;
    public String Password;

    public Student() {

    }

    public Student(int idStudent, String name, String surname, String birth, int idFaculty, int idMajor, String Password) {
        this.idStudent = idStudent;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.idFaculty = idFaculty;
        this.idMajor = idMajor;
        this.Password = Password;
    }

    public String GetFullName() {
        return name + " " + surname;
    }
}
