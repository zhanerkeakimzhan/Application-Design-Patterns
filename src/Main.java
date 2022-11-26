import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDocument document = createDocumentsByProtocol("Протокол 1");
        IProtocol protocol = document.createProtocol();
        protocol.protocolType();

        TypeOfTeachers teacher = new Teacher(1, "Park");
        teacher = new Professor(teacher);
        System.out.println(teacher.getType());


        Student student = new Student(1, "Aaaa");
        Student student1 = new Student(2, "Bbbb");


        State finish = new ThesisFinished(student);
        student.setState(finish);

        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student1);

        University university = new University(students);

        Student student2 = new Student(3, "Cccc");
        university.addStudent(student2);

        System.out.println(university.toString());

        //builder
        Director director = new Director();

        director.setBuilder(new MondayDiploma());
        Diploma diploma = director.buildDiploma();
        System.out.println(diploma);
    }

    static IDocument createDocumentsByProtocol(String documents) {
        if (documents.equalsIgnoreCase("Протокол 1")){
            return new ProtocolDocument_1();
        }
        else if (documents.equalsIgnoreCase("Протокол 2")) {
            return new ProtocolDocument_2();
        }
        else return null;
    }
}