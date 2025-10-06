public class Employee {
     int empNumber;
     double payRate;
     final int MAX_EMP_NUMBER = 9999;
     final double MAX_RATE = 60.0;
     final double OVERTIME_MULTIPLIER = 1.5;

       public Employee(int empNumber, double payRate) {
       
         this.empNumber = Math.min(empNumber, MAX_EMP_NUMBER);
         this.payRate = Math.min(payRate, MAX_RATE);
    }

       public double getRegularPay(double hours) {
         return Math.min(hours, 40) * payRate;
    }

       public double getOvertimePay(double hours) {
          if (hours > 40) {
            return (hours - 40) * payRate * OVERTIME_MULTIPLIER;
        }
            return 0;
    }
}