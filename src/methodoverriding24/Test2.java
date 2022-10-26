package methodoverriding24;
////Test class to create objects and call the methods
public class Test2 {
    public static void main(String[] args) {
        Sbi s=new Sbi();
        IcIci i=new IcIci();
        Axis a=new Axis();
        System.out.println("sbi rate of interest:" +s.getRateOfInterest());
        System.out.println("IcIci rate of interest:"+i.getRateOfInterest());
        System.out.println("Axis rate of interest" +a.getRateOfInterest());
    }
}
