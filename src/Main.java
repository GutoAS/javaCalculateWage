public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        var employee2 = new  Employee(50_000);

        int wage = employee.calculateWage(20);
        int wage2 = employee2.calculateWage(20);

        System.out.println(wage);
        System.out.println(wage2);

    }

}