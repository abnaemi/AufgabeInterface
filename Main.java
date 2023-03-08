public class Main {

    public static void main(String[] args) {
        ComputerScienceStudent studentOne = new ComputerScienceStudent("Toms", 2323, "Hamburg" );
        Student studentTwo = new ComputerScienceStudent("Kai", 2333, "ad");


        System.out.println(studentOne);
        System.out.println(studentTwo);

        studentOne.getIdentityCardNumber();
        studentTwo.getName();
        studentOne.getAdress();

     Citizen mycitizen = new BiologyStudent("Tom", 2);
        System.out.println(mycitizen);

        System.out.println(studentOne.getNameAndAdress());
    }
}
