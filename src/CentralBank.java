public class CentralBank {
    int getInterestRate(){
        return 0;
    }
}
class BOC extends CentralBank{
    @Override
    int getInterestRate() {
        return 8;
    }
}
class PeoplesBank extends CentralBank{
    @Override
    int getInterestRate() {
        return 10;
    }
}
class CommercialBank extends CentralBank{
    @Override
    int getInterestRate() {
        return 12;
    }
}
class Testoveridding{
    public static void main(String[] args) {
        BOC b=new BOC ();
        PeoplesBank p=new PeoplesBank();
        CentralBank c=new CommercialBank();
        System.out.println("INTEREST RATE IS "+b.getInterestRate());
        System.out.println("INTEREST RATE IS "+p.getInterestRate());
        System.out.println("INTEREST RATE IS "+c.getInterestRate());

}}
