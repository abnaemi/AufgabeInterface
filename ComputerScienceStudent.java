public class ComputerScienceStudent implements  Citizen{

    String adress;
    int identityCardNumber;

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return identityCardNumber;
    }
}
