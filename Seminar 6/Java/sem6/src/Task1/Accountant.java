package Task1;

public class Accountant {
    private int baseSalary;

    /**
     * 
     * @param baseSalary - Зарплата до вычета
     */
    public Accountant(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    // Метод подсчитывает зарплату после вычета налога
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}
