import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        //Объявление групп и студентов//

        StudentGroup studentGroup = new StudentGroup();

        Student ivan = new Student("Ivan", 1);
        Student igor = new Student("Igorechick", 2);
        Student alex = new Student("Alex", 4);
        Student alexey = new Student("Alexey", 3);
        Student sidor = new Student("Sidor", 5);

        studentGroup.addStudent(ivan);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(alexey);
        

        System.out.println("Cтуденты (1 группа): " + studentGroup.students);

        StudentGroup studentGroup1 = new StudentGroup();

        Student karl = new Student("Karl", 4);
        Student artur = new Student("Artur", 1);
        Student semyon = new Student("Semyon", 2);
        Student eduard = new Student("Eduard", 3);

        studentGroup1.addStudent(karl);
        studentGroup1.addStudent(artur);
        studentGroup1.addStudent(semyon);
        studentGroup1.addStudent(eduard);

        System.out.println("Cтуденты (2 группа): " + studentGroup1.students);

        StudentGroup studentGroup2 = new StudentGroup();

        Student foma = new Student("Foma", 4);
        Student maks = new Student("Maks", 1);
        Student leonty = new Student("Leonty", 2);
        Student abram = new Student("Abram", 3);


        studentGroup2.addStudent(foma);
        studentGroup2.addStudent(maks);
        studentGroup2.addStudent(leonty);
        studentGroup2.addStudent(abram);
        studentGroup2.addStudent(sidor);

        System.out.println("Cтуденты (3 группа): " + studentGroup2.students);

        StudentGroup studentGroup3 = new StudentGroup();

        Student ilya = new Student("Ilya", 4);
        Student david = new Student("David", 1);
        Student vasil = new Student("Vasil", 2);
        Student dimitri = new Student("Dimitri", 3);

        studentGroup3.addStudent(ilya);
        studentGroup3.addStudent(david);
        studentGroup3.addStudent(vasil);
        studentGroup3.addStudent(dimitri);

        System.out.println("Cтуденты (4 группа): " + studentGroup3.students);

        //Объявление массива групп и потоков//

        ArrayList<StudentGroup> groups = new ArrayList<StudentGroup>();

        groups.add(studentGroup);
        groups.add(studentGroup1);

        ArrayList<StudentGroup> groups1 = new ArrayList<StudentGroup>();

        groups1.add(studentGroup2);
        //groups1.add(studentGroup3);

        Stream stream = new Stream("stream", groups);
        Stream stream1 = new Stream("stream1", groups1);

        StudentComparator studentComparator = new StudentComparator();
        System.out.println(studentComparator.compare(vasil, dimitri));
        System.out.println(studentComparator.compare(ilya, vasil));

        //Объявление итераторов//

        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
        Iterator<Student> iterator1 = new StudentGroupIterator(studentGroup1);
        Iterator<Student> iterator2 = new StudentGroupIterator(studentGroup2);
        Iterator<Student> iterator3 = new StudentGroupIterator(studentGroup3);

        Iterator<StudentGroup> iteration = stream.iterator();
        Iterator<StudentGroup> iteration1 = stream1.iterator();

        System.out.println("\n");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n");

        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        System.out.println("\n");

        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }

        System.out.println("\n");

        while (iterator3.hasNext()) {
            System.out.print(iterator3.next() + " ");
        }

        System.out.println("\n");

        while (iteration.hasNext()) {
            System.out.println("stream: " + iteration.next().students);
        }

        System.out.println("\n");

        while (iteration1.hasNext()) {
            System.out.println("stream1: " + iteration1.next().students);
        }

        System.out.println("\n");

        List<Stream> studentss = new ArrayList<Stream>();

        studentss.add(stream);
        studentss.add(stream1);

        StreamService service = new StreamService();
        service.sortByGroupCount(studentss);

        Iterator<StudentGroup> iteration3 = studentss.get(0).iterator();
        Iterator<StudentGroup> iteration4 = studentss.get(1).iterator();

        while (iteration3.hasNext()) {
            System.out.println(studentss.get(0).name + " : " + iteration3.next().students);
        }

        while (iteration4.hasNext()) {
            System.out.println(studentss.get(1).name + " : " + iteration4.next().students);
        }
        
    }
}