public class ComputerScienceStudent implements  Citizen{

    String adress;
    int identityCardNumber;


    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(String adress, int identityCardNumber) {
        this.adress = adress;
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerScienceStudent that)) return false;

        if (getIdentityCardNumber() != that.getIdentityCardNumber()) return false;
        return getAdress() != null ? getAdress().equals(that.getAdress()) : that.getAdress() == null;
    }

    @Override
    public int hashCode() {
        int result = getAdress() != null ? getAdress().hashCode() : 0;
        result = 31 * result + getIdentityCardNumber();
        return result;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "adress='" + adress + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }

}
