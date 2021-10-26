package Chapter10;

import Chapter9.BasePlusCommissionEmployee;
import Chapter9.Commission_Employees;

public class PolymorphismMainMethod {
        public static void main(String[] args) {
            Commission_Employees commission_employees = new Commission_Employees("Sue", "Jones", "222-22-2222", 10000, .06);
            BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000.09, .04, 300);
            System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object", commission_employees.toString());
            System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass", "reference to subclass object", basePlusCommissionEmployee.toString());
            System.out.println( "subclass referencing subclass toString method" + basePlusCommissionEmployee.toString());
            System.out.println("superclass referencing superclass toString method" + basePlusCommissionEmployee.toString());
        }
    }


