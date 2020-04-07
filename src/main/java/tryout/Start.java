package tryout;

public class Start {

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
        Doubling doubling = new Doubling();
        System.out.println("iterative: " + doubling.doubleAndSumParallel());
        System.out.println("sequential: " + doubling.doubleAndSumSequential());
      //  System.out.println("parallel: " + doubling.parallelStreamSum());
    }
}
