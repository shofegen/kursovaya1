public class Employee {
    private final String fio;
    private String departament;
    private float salary;
    private static int counter = 0;
    private final int id;

    public Employee(String fio, String departament, float salary) {
        this.fio = fio;
        this.departament = departament;
        this.salary = salary;
        id = ++counter;
    }

    public String getFio() { return fio; }

    public String getDepartament() { return departament; }

    public float getSalary() { return salary; }

    public static int getCounter() { return counter; }

    public int getId() { return id; }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО - " + this.fio + ", Отдел - " + this.departament + ", Зарплата - " + this.salary + ", Id - " + this.id;
    }

    public float[] PrintSalary(float[] salary) {
        return salary;
    }
}

