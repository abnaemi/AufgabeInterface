public class BiologyStudent implements Citizen {

    String adress;
    int identityCardNumber;

    public BiologyStudent() {
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public BiologyStudent(String adress, int identityCardNumber) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BiologyStudent that)) return false;

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
        return "BiologyStudent{" +
                "adress='" + adress + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }
}
