public class MyClass {
  public static void main(String args[]) {
      
        double monthlyInterestRate = 0.0325 / 12; // annual rate dividied by 12 months
        double investmentAmount = 1000;
        double numberOfYears = 1;

        double years = numberOfYears * 12; //exponent
        double exponent = Math.pow(1 + monthlyInterestRate, years); //exponent math

        double futureInvestmentValue = investmentAmount * exponent; // final formula
        System.out.println(futureInvestmentValue);
  }
}
