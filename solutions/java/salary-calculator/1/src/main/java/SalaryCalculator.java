public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped<5?1:0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold<20?10:13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold*bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int sal = (int)(1000*salaryMultiplier(daysSkipped))+(int)bonusForProductsSold(productsSold);
        return sal<=2000?sal:2000;
    } 
}
