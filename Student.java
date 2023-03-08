public abstract class Student {

    protected String name;
    protected int identityCardNumber;

    Student () {

    }


    Student (String name, int identityCardNumber){
        this.name = name;
        this.identityCardNumber = identityCardNumber;
    }

    abstract String getNameAndAdress();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (getIdentityCardNumber() != student.getIdentityCardNumber()) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getIdentityCardNumber();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }
}
