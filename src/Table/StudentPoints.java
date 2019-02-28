package Table;

public class StudentPoints {

    public int idStudentPoints;
    public int idStudent;
    public int idLesson;
    public int Mid;
    public int Quiz;
    public int Activity;
    public int Fin;
    public int Total;

    public StudentPoints() {
    }

    public int GetTotal() {
        return Mid + Quiz + Fin + Activity;
    }

    public StudentPoints(int idStudentPoints, int idStudent, int idLesson, int Mid, int Quiz, int Activity, int Fin, int Total) {
        this.idStudentPoints = idStudentPoints;
        this.idStudent = idStudent;
        this.idLesson = idLesson;
        this.Mid = Mid;
        this.Quiz = Quiz;
        this.Activity = Activity;
        this.Fin = Fin;
        this.Total = Total;

    }

}
