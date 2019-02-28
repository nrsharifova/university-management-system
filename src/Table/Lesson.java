package Table;

public class Lesson {

    public int idLesson;
    public String name;
    public String code;
    public int idTeacher;
    public int idFaculty;
    public int credit;

    public Lesson() {

    }

    public Lesson(int idLesson, String name, String code, int idTeacher, int idFaculty, int credit) {
        this.idLesson = idLesson;
        this.name = name;
        this.code = code;
        this.idTeacher = idTeacher;
        this.idFaculty = idFaculty;
        this.credit = credit;
    }
}
