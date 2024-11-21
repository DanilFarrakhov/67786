
    public class Student {
        int numberbilet;
        String name;
        String familia;
        int yearseducation;
        double math;
        double economy;
        double Angl;
        double res;

    }
    class StudentTest {
        double sro(Student student){
            double sro1 =(student.math+student.economy+student.Angl)/3;
            System.out.println("Средняя оценка "+student.name+" "+student.familia+": "+sro1);
            return sro1;
        }
        public static void main(String[] args) {
            Student student1 = new Student();
            student1.numberbilet=45;
            student1.name="Danil";
            student1.familia="farrahov";
            student1.yearseducation=2015;
            student1.math=4.1;
            student1.economy=3.8;
            student1.Angl=3.9;
            Student student2= new Student();
            student2.numberbilet=67;
            student2.name="Mark";
            student2.familia="Abinov";
            student2.yearseducation=2015;
            student2.math=4.7;
            student2.economy=4.8;
            student2.Angl=2.9;
            Student student3= new Student();
            student3.numberbilet=55;
            student3.name="Almir";
            student3.familia="Bogdanov";
            student3.yearseducation=2015;
            student3.math=3.7;
            student3.economy=3.8;
            student3.Angl=4.0;
            StudentTest sTEST =new StudentTest();
            sTEST.sro(student1);
            sTEST.sro(student2);
            sTEST.sro(student3);
        }
    }


