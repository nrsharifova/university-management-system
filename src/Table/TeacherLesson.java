package Table;

public class TeacherLesson {

    public int idTeacherLesson;
    public int idTeacher;
    public int idLesson;

    public TeacherLesson() {
    }

    public TeacherLesson(int idTeacherLesson, int idTeacher, int idLesson) {
        this.idTeacherLesson = idTeacherLesson;
        this.idTeacher = idTeacher;
        this.idLesson = idLesson;
    }
}
