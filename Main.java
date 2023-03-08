public class Main {

    public static void main(String[] args) {
        ComputerScienceStudent studentOne = new ComputerScienceStudent("Tom", 2323, "Hamburg" );
        Student studentTwo = new Student("Kai", 2333);

        // Kann man eine ComputerScienceStudent Object aus ComputerScienceStudent Klasse erstellen, die den Konstruktur von
        // Student benutzt?

        System.out.println(studentOne);
        System.out.println(studentTwo);


    }
}
