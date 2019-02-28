package Table;

public class StudentLesson {

    public int idStudentLesson;
    public int idStudent;
    public int idLesson;
    public int isActive;
    public int isPassed;

    public StudentLesson() {
    }

    public StudentLesson(int idStudentLesson, int idStudent, int idLesson, int isActive, int isPassed) {
        this.idStudentLesson = idStudentLesson;
        this.idStudent = idStudent;
        this.idLesson = idLesson;
        this.isActive = isActive;
        this.isPassed = isPassed;
    }

}
