public class Employee {
    int baseSalary;
    int extraHours;
    public  Employee(int baseSalary){
      this(baseSalary, 0);
    }
    public  Employee(int baseSalary, int extraHours){
        setBaseSalary(baseSalary);
        setExtraHours(extraHours);
    }

   private int getBaseSalary(){
       return baseSalary;
   }

    private int getExtraHours() {
        return extraHours;
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private void setExtraHours(int extraHours) {
        if(extraHours < 0)
            throw new IllegalArgumentException("Hours cannot be 0 or less");
        this.extraHours = extraHours;
    }

    public int calculateWage(int hourlyRate ){
        return getBaseSalary() + (getExtraHours() * hourlyRate);
    }

    // overloading calculate wage
    public int calculateWage(){
        return calculateWage(0);
    }
}
