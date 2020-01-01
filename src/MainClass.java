//С помощью цикла вывести информацию только о сотрудниках старше 40 лет

public class MainClass {

    public static void main(String[] args) {

        Employee[] arrayOfEmployee = new Employee [5]; // Вначале объявляем массив объектов
        arrayOfEmployee[0] = new Employee("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000,
                30);
        arrayOfEmployee[1] = new Employee("Ivanovich Ivano", "Engineer1", " ivivan@mail.com ", "89231454353", 32000,
                25);
        arrayOfEmployee[2] = new Employee("Petrov Petr", "Driver", " petrov@mailbox.com ", "89034563478", 33000,
                33);
        arrayOfEmployee[3] = new Employee("Sidorov Alex", "accountant", " sidorov@mailbox.com ", "89234567812", 29000,
                27);
        arrayOfEmployee[4] = new Employee("Fedorov Fedor", "accountant", " fedorov@mailbox.com ", "892345345", 45000,
                50);
        for(Employee employee : arrayOfEmployee){
            if(employee.getAge() >40) {
                employee.printInfo();
            }
                else{
                    System.out.println("Сотрудники младше 40 лет");
                }
            }
        }
}
