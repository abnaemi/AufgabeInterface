public class ComputerScienceStudent extends  Student {


    String adress;

    public ComputerScienceStudent() {
    }
    public  ComputerScienceStudent(String name, int identityCardNumber, String adress){
        super(name, identityCardNumber);
        this.adress = adress;
    }

     public String getNameAndAdress(){
        return name + " aus "+ adress;
       }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
