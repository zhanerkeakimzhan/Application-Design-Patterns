import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDocument document = createDocumentsByProtocol("Протокол 2");
        IProtocol protocol = document.createProtocol();
        protocol.protocolType();

        Student student = new Student(1, "Aaaa", false);
        Student student1 = new Student(2, "Bbbb", true);
        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student1);

        University university = new University(students);

        Student student2 = new Student(3, "Cccc", true);
        university.addStudent(student2);

        university.toString();

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