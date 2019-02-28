package ConnectionDB;

import Table.Faculty;
import Table.Lesson;
import Table.Major;
import Table.Student;
import Table.StudentLesson;
import Table.StudentPoints;
import Table.TeacherLesson;
import Table.Teacher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnMySql {

    private Connection connection;
    private Statement st;
    private ResultSet rs;

    //CONNECTION TO MYSQL
    public ConnMySql() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sims";
            String user = "root";
            String pasword = "123456";
            connection = DriverManager.getConnection(url, user, pasword);
            st = connection.createStatement();
        } catch (Exception e) {
            System.out.println("Error connection" + e);
        }
    }

//INSERT FOR STUDENT
    public void InsUpStudent(Student stu) {
        try {
            String SqlEmri = "";
            if (stu.idStudent == 0) {
                SqlEmri = "insert into student(name,surname,birth,idFaculty,idMajor,Password)values(?,?,?,?,?,?)";
            } else {
                SqlEmri = "update student set name=?,surname=?,birth=?,idFaculty=?,idMajor=?,Password=? where idStudent=?";
            }
            PreparedStatement prSql = connection.prepareStatement(SqlEmri);
            prSql.setString(1, stu.name);
            prSql.setString(2, stu.surname);
            prSql.setString(3, stu.birth);
            prSql.setInt(4, stu.idFaculty);
            prSql.setInt(5, stu.idMajor);
            prSql.setString(6, stu.Password);
            if (stu.idStudent != 0) {
                prSql.setInt(7, stu.idStudent);
            }
            prSql.execute();
        } catch (Exception e) {
            System.out.println("Error insertStudent: " + e);
        }
    }

// INSERT TEACHER
    public void InsUpTeacher(Teacher teac) {
        try {
            String SqlEmri = "";
            if (teac.idTeacher == 0) {
                SqlEmri = "insert into teacher(name,surname,birth,number)values(?,?,?,?)";
            } else {
                SqlEmri = "update teacher set name=?,surname=?,birth=?,number=? where idTeacher=?";
            }
            PreparedStatement prSql = connection.prepareStatement(SqlEmri);
            prSql.setString(1, teac.name);
            prSql.setString(2, teac.surname);
            prSql.setString(3, teac.birth);
            prSql.setString(4, teac.number);
            if (teac.idTeacher != 0) {
                prSql.setInt(5, teac.idTeacher);
            }
            prSql.execute();
        } catch (Exception e) {
            System.out.println("Error insertTeacher: " + e);
        }

    }

    // INSERT FACULTY
    public void InsUpFaculty(Faculty fac) {
        try {
            String SqlEmri = "";
            if (fac.idFaculty == 0) {
                SqlEmri = "insert into faculty(name)values(?)";
            } else {
                SqlEmri = "update faculty set name=? where idFaculty=?";
            }
            PreparedStatement prSql = connection.prepareStatement(SqlEmri);
            prSql.setString(1, fac.name);
            if (fac.idFaculty != 0) {
                prSql.setInt(2, fac.idFaculty);
            }
            prSql.execute();
        } catch (Exception e) {
            System.out.println("Error insertFaculty: " + e);
        }
    }

    // INSERT MAJOR
    public void InsUpMajor(Major maj) {
        try {
            String SqlEmri = "";
            if (maj.idMajor == 0) {
                SqlEmri = "insert into major(name)values(?)";
            } else {
                SqlEmri = "update major set name=? where idMajor=?";
            }
            PreparedStatement prSql = connection.prepareStatement(SqlEmri);
            prSql.setString(1, maj.name);
            if (maj.idMajor != 0) {
                prSql.setInt(22, maj.idMajor);
            }
            prSql.execute();
        } catch (Exception e) {
            System.out.println("Error insertMajor: " + e);
        }
    }

    // INSERT LESSON
    public void InsUpLesson(Lesson les) {
        try {
            String SqlEmri = "";
            if (les.idLesson == 0) {
                SqlEmri = "insert into lesson(name,code,idFaculty,idTeacher,credit)values(?,?,?,?,?)";
            } else {
                SqlEmri = "update lesson set name=?,code=?,idFaculty=?,idTeacher=?,credit=? where idLesson=?";
            }
            PreparedStatement prSql = connection.prepareStatement(SqlEmri);
            prSql.setString(1, les.name);
            prSql.setString(2, les.code);
            prSql.setInt(3, les.idFaculty);
            prSql.setInt(4, les.idTeacher);
            prSql.setInt(5, les.credit);

            if (les.idLesson != 0) {
                prSql.setInt(6, les.idLesson);
            }
            prSql.execute();
        } catch (Exception e) {
            System.out.println("Error insertLesson: " + e);
        }
    }

    // INSERT StudentLesson
    public void InsUpStudentLesson(StudentLesson stule) {
        try {
            String SqlEmri = "";
            if (stule.idStudentLesson == 0) {
                SqlEmri = "insert into studentlesson(idStudent,idLesson,isActive,isPassed)values(?,?,?,?)";
            } else {
                SqlEmri = "update studentlesson set idStudent=?,idLesson=?,isActive=?,isPassed=? where idStudentLesson=?";
            }
            PreparedStatement prSql = connection.prepareStatement(SqlEmri);
            prSql.setInt(1, stule.idStudent);
            prSql.setInt(2, stule.idLesson);
            prSql.setInt(3, stule.isActive);
            prSql.setInt(4, stule.isPassed);

            if (stule.idStudentLesson != 0) {
                prSql.setInt(5, stule.idStudentLesson);
            }
            prSql.execute();
        } catch (Exception e) {
            System.out.println("Error insertStudentLesson: " + e);
        }
    }

    // INSERT StudentPoints
    public void InsUpStudentPoints(StudentPoints stupo) {
        try {
            String SqlEmri = "";
            if (stupo.idStudentPoints == 0) {
                SqlEmri = "insert into studentpoints(idStudent,idLesson,Mid,Quiz,Activity,Fin,Total)values(?,?,?,?,?,?,?)";
            } else {
                SqlEmri = "update studentpoints set idStudent=?,idLesson,Mid=?,Quiz=?,Activity=?,Fin=?,Total=? where idStudentPoints=?";
            }
            PreparedStatement prSql = connection.prepareStatement(SqlEmri);
            prSql.setInt(1, stupo.idStudent);
            prSql.setInt(2, stupo.idLesson);
            prSql.setInt(3, stupo.Mid);
            prSql.setInt(4, stupo.Quiz);
            prSql.setInt(5, stupo.Activity);
            prSql.setInt(6, stupo.Fin);
            prSql.setInt(7, stupo.GetTotal());

            if (stupo.idStudentPoints != 0) {
                prSql.setInt(8, stupo.idStudentPoints);
            }
            prSql.execute();
        } catch (Exception e) {
            System.out.println("Error insertStudentPoints: " + e);
        }
    }

    // INSERT TeacherLesson
    public void InsUpTeacherLesson(TeacherLesson tele) {
        try {
            String SqlEmri = "";
            if (tele.idTeacherLesson == 0) {
                SqlEmri = "insert into teacherlesson(idTeacher,idLesson)values(?,?)";
            } else {
                SqlEmri = "update teacherlesson set idTeacher=?,idLesson=? where idTeacherLesson=?";
            }
            PreparedStatement prSql = connection.prepareStatement(SqlEmri);
            prSql.setInt(1, tele.idTeacher);
            prSql.setInt(2, tele.idLesson);

            if (tele.idTeacherLesson != 0) {
                prSql.setInt(3, tele.idTeacherLesson);
            }
            prSql.execute();
        } catch (Exception e) {
            System.out.println("Error insertTeacherLesson: " + e);
        }
    }

//SQLEMRI FOR STUDENT
    private List<Student> AllStudent(String where) {
        try {
            String SqlEmri = "Select * from student " + where;
            List<Student> list = new ArrayList<>();
            rs = st.executeQuery(SqlEmri);
            while (rs.next()) {
                list.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7)));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error getAllStudent: " + e);
            return null;
        }
    }

    //SQLEMRI FOR TEACHER
    public List<Teacher> AllTeacher(String where) {
        try {
            String SqlEmri = "Select * from teacher " + where;
            List<Teacher> list = new ArrayList<>();
            rs = st.executeQuery(SqlEmri);
            while (rs.next()) {
                list.add(new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error getAllTeacher: " + e);
            return null;
        }
    }

    //SQLEMRI FOR FACULTY
    public List<Faculty> AllFaculty(String where) {
        try {
            String SqlEmri = "Select * from faculty " + where;
            List<Faculty> list = new ArrayList<>();
            rs = st.executeQuery(SqlEmri);
            while (rs.next()) {
                list.add(new Faculty(rs.getInt(1), rs.getString(2)));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error getAllFaculty: " + e);
            return null;
        }
    }

    //SQLEMRI FOR MAJOR
    public List<Major> AllMajor(String where) {
        try {
            String SqlEmri = "Select * from Major " + where;
            List<Major> list = new ArrayList<>();
            rs = st.executeQuery(SqlEmri);
            while (rs.next()) {
                list.add(new Major(rs.getInt(1), rs.getString(2)));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error getAllMajor: " + e);
            return null;
        }
    }

//SQLEMRI FOR LESSON
    public List<Lesson> AllLesson(String where) {
        try {
            String SqlEmri = "Select * from lesson " + where;
            List<Lesson> list = new ArrayList<>();
            rs = st.executeQuery(SqlEmri);
            while (rs.next()) {
                list.add(new Lesson(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error getAllLesson: " + e);
            return null;
        }
    }

    //SQLEMRI FOR STUDENTLESSON
    public List<StudentLesson> AllStudentLesson(String where) {
        try {
            String SqlEmri = "Select * from studentlesson " + where;
            List<StudentLesson> list = new ArrayList<>();
            rs = st.executeQuery(SqlEmri);
            while (rs.next()) {
                list.add(new StudentLesson(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error getAllStudentLesson: " + e);
            return null;
        }
    }
    //SQLEMRI FOR StudentPoints

    public List<StudentPoints> AllStudentPoints(String where) {
        try {
            String SqlEmri = "Select * from studentpoints " + where;
            List<StudentPoints> list = new ArrayList<>();
            rs = st.executeQuery(SqlEmri);
            while (rs.next()) {
                list.add(new StudentPoints(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8)));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error getAllStudentPoints: " + e);
            return null;
        }
    }
    //SQLEMRI FOR TeacherLESSON

    public List<TeacherLesson> AllTeacherLesson(String where) {
        try {
            String SqlEmri = "Select * from teacherlesson " + where;
            List<TeacherLesson> list = new ArrayList<>();
            rs = st.executeQuery(SqlEmri);
            while (rs.next()) {
                list.add(new TeacherLesson(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error getAllTeacherLesson: " + e);
            return null;
        }
    }

//GET INFORMATION FOR STUDENT 
    public List<Student> GetAllStudent() {
        return AllStudent("");
    }

    public Student GetStudentByName(String name) {
        return AllStudent("where name = '" + name + "'").get(0);
    }

    public Student GetStudentByLogin(int idStudent, String Password) {
        return AllStudent("where idStudent = '" + idStudent + "' and Password=" + Password).get(0);
    }

    public Student GetStudentBySurname(String surname) {
        return AllStudent("where surname = '" + surname + "'").get(0);
    }

    public Student GetStudentByBirth(String birth) {
        return AllStudent("where birth = '" + birth + "'").get(0);
    }

    public Student GetStudentByidFaculty(int idFaculty) {
        return AllStudent("where idFaculty = " + idFaculty).get(0);
    }

    public Student GetStudentByidMajor(int idMajor) {
        return AllStudent("where idMajor = " + idMajor).get(0);
    }

    public Student GetStudentByidStudent(int idStudent) {
        return AllStudent("where idStudent = " + idStudent).get(0);
    }

//GET INFORMATION FOR TEACHER 
    public List<Teacher> GetAllTeacher() {
        return AllTeacher("");
    }

    public Teacher GetTeacherByName(String name) {
        return AllTeacher("where name = '" + name + "'").get(0);
    }

    public Teacher GetTeacherBySurname(String surname) {
        return AllTeacher("where surname = '" + surname + "'").get(0);
    }

    public Teacher GetTeacherBirth(String birth) {
        return AllTeacher("where birth = '" + birth + "'").get(0);
    }

    public Teacher GetTeacherByNumber(String number) {
        return AllTeacher("where number = '" + number + "'").get(0);
    }

    public Teacher GetTeacherbyidTeacher(int idTeacher) {
        return AllTeacher("where idTeacher = " + idTeacher).get(0);
    }

//GET INFORMATIN FOR LESSON
    public List<Lesson> GetAllLesson() {
        return AllLesson("");
    }

    public Lesson GetLessonByName(String name) {
        return AllLesson("where name = '" + name + "'").get(0);
    }

    public Lesson GetLessonByCode(String code) {
        return AllLesson("where code = '" + code + "'").get(0);
    }

    public Lesson GetLessonByidTeacher(int idTeacher) {
        return AllLesson("where idTeacher = " + idTeacher).get(0);
    }

    public Lesson GetLessonByidFaculty(int idFaculty) {
        return AllLesson("where idFaculty = " + idFaculty).get(0);
    }

    public Lesson GetLessonByCredit(int credit) {
        return AllLesson("where credit = " + credit).get(0);
    }

    public Lesson GetLessonByidLesson(int idLesson) {
        return AllLesson("where idLesson = " + idLesson).get(0);
    }

//GET INFORMATIN FOR FACULTY
    public List<Faculty> GetAllFaculty() {
        return AllFaculty("");
    }

    public Faculty GetFacultyByName(String name) {
        return AllFaculty("where name = '" + name + "'").get(0);
    }

    public Faculty GetFacultyByidFaculty(int idFaculty) {
        return AllFaculty("where idFaculty = " + idFaculty).get(0);
    }

//GET INFORMATIN FOR Major
    public List<Major> GetAllMajor() {
        return AllMajor("");
    }

    public Major GetMajorByName(String name) {
        return AllMajor("where name = '" + name + "'").get(0);
    }

    public Major GetMajorByidMajor(int idMajor) {
        return AllMajor("where idMajor = " + idMajor).get(0);
    }

    //GET INFORMATIN FOR STUDENTLESSON
    public List<StudentLesson> GetAllStudentLesson() {
        return AllStudentLesson("");
    }

    public List<StudentLesson> GetStudentLessonByidStudent(int idStudent) {
        return AllStudentLesson("where isActive=1 and isPassed=0 and idStudent = " + idStudent);
    }

    public List<Lesson> getLessonsForStudent(int idStudent) {
        return AllLesson("where lesson.idlesson not in(select stule.idlesson from studentlesson stule where (stule.isActive=1 or stule.isPassed=1) and stule.idStudent = " + idStudent + ")");
    }

    public StudentLesson GetStudentLessonByidLesson(int idLesson) {
        return AllStudentLesson("where idLesson = " + idLesson).get(0);
    }

    public StudentLesson GetStudentLessonByidStudentLesson(int idStudentLesson) {
        return AllStudentLesson("where idStudentLesson = " + idStudentLesson).get(0);
    }

    //GET INFORMATIN FOR TeacherLESSON
    public List<TeacherLesson> GetAllTeacherLesson() {
        return AllTeacherLesson("");
    }

    public TeacherLesson GetTeacherLessonByidTeacher(int idTeacher) {
        return AllTeacherLesson("where idTeacher = " + idTeacher).get(0);
    }

    public TeacherLesson GetTeacherLessonByidLesson(int idLesson) {
        return AllTeacherLesson("where idLesson = " + idLesson).get(0);
    }

    public TeacherLesson GetTeacherLessonByidTeacherLesson(int idTeacherLesson) {
        return AllTeacherLesson("where idTeacherLesson = " + idTeacherLesson).get(0);
    }

    //GET INFORMATIN FOR STUDENTPOINTS
    public List<StudentPoints> GetAllStudentPoints() {
        return AllStudentPoints("");
    }

    public List<StudentPoints> GetStudentPointsByidStudent(int idStudent) {
        return AllStudentPoints("where idStudent = " + idStudent);
    }

    public StudentPoints GetStudentPointsByidLesson(int idLesson) {
        return AllStudentPoints("where idLesson = " + idLesson).get(0);
    }

    public StudentPoints GetStudentPointsByMid(int mid) {
        return AllStudentPoints("where mid = " + mid).get(0);
    }

    public StudentPoints GetStudentPointsByQuiz(int quiz) {
        return AllStudentPoints("where quiz = " + quiz).get(0);
    }

    public StudentPoints GetStudentPointsByActivity(int activity) {
        return AllStudentPoints("where activity = " + activity).get(0);
    }

    public StudentPoints GetStudentPointsByFinal(int fin) {
        return AllStudentPoints("where final = " + fin).get(0);
    }

    public StudentPoints GetStudentPointsByTotal(int total) {
        return AllStudentPoints("where total = " + total).get(0);
    }

    public StudentPoints GetStudentPointsByidStudentPoints(int idStudentPoints) {
        return AllStudentPoints("where idStudentPoints = " + idStudentPoints).get(0);
    }

    //DELETE
    public void DelStudentLesson(int id) {
        try {
            String sql = "Delete from StudentLesson where idStudentLesson = " + id;
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error DelStudentLesson: " + e);
        }
    }

}
