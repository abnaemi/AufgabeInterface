public class ComputerScienceStudent extends  Student{


    String adress;

    public ComputerScienceStudent() {
    }
    public  ComputerScienceStudent(String name, int identityCardNumber, String adress){
        super( "Tom",  34324);
        this.adress = adress;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    @Override
    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerScienceStudent that)) return false;
        if (!super.equals(o)) return false;

        if (getIdentityCardNumber() != that.getIdentityCardNumber()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getAdress() != null ? getAdress().equals(that.getAdress()) : that.getAdress() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getAdress() != null ? getAdress().hashCode() : 0);
        result = 31 * result + getIdentityCardNumber();
        return result;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "adress='" + adress + '\'' +
                ", name='" + name + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }
}
