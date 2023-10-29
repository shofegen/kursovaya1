public class Main {
    private static final Employee[] empl = new Employee[10];

    public static void main(String[] args) {
        empl[0] = new Employee("ФИО1", "Отдел1", 25_000);
        empl[1] = new Employee("ФИО2", "Отдел2", 26_000);
        empl[2] = new Employee("ФИО3", "Отдел1", 27_000);
        empl[3] = new Employee("ФИО4", "Отдел2", 28_000);
        empl[4] = new Employee("ФИО5", "Отдел3", 29_000);
        empl[5] = new Employee("ФИО6", "Отдел4", 30_000);
        empl[6] = new Employee("ФИО7", "Отдел3", 31_000);
        empl[7] = new Employee("ФИО8", "Отдел4", 32_000);
        empl[8] = new Employee("ФИО9", "Отдел5", 33_000);
        empl[9] = new Employee("ФИО10", "Отдел5", 34_000);
        allEmpl();
        salaryInMonth();
        emplMinSalary();
        emplMaxSalary();
        emplMidlSalary();
    }
// Получить список всех сотрудников.
    private static void allEmpl() {
        for (Employee employee : empl) System.out.println(employee);
    }
// Посчитать сумму затрат на зарплаты.
    private static float salaryInMonth() {
        float totalSalary = 0;
        for (Employee empl : empl) {
            if (empl != null) {
                totalSalary += empl.getSalary();
            }
        }
        System.out.println(totalSalary);
        return totalSalary;
    }

    // Найти сотрудника с минимальной заплатой.
    private static Employee emplMinSalary() {
        Employee minSalary = empl[0];
        for (Employee empl : empl) {
            if (empl != null) {
                if (empl.getSalary() < minSalary.getSalary()) {
                    minSalary = empl;
                }
            }
    }
        System.out.println("Cотрудник с минимальной заплатой: " + minSalary.getFio() + ", зарплата составляет: " + minSalary.getSalary());
        return minSalary;
    }

    //Найти сотрудника с максимальной зарплатой.
    private static Employee emplMaxSalary() {
        Employee maxSalary = empl[0];
        for (Employee empl : empl) {
            if (empl != null) {
                if (empl.getSalary() > maxSalary.getSalary()) {
                    maxSalary = empl;
                }
            }
        }
        System.out.println("Cотрудник с максимальной заплатой: " + maxSalary.getFio() + ", зарплата составляет: " + maxSalary.getSalary());
        return maxSalary;
    }
    //Подсчитать среднее значение зарплат.
    private static float emplMidlSalary() {
        float midlSalary = 0;
        System.out.println("Средняя зарплата в организации: " + salaryInMonth()/empl.length);
        return midlSalary;
    }
}
