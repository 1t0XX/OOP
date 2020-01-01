//Создать класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст;
//Конструктор класса должен заполнять эти поля при создании объекта;
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;


public class Employee{


    private String FIO;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;


    public Employee(String FIO, String position, String email, String number, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }


        public void printInfo() {
            System.out.println( "fio: " + FIO + " position: " + position + " email: " + email + " phoneNumber: " + number +
                    " salary: " +salary+ " age: " +age);
        }

        public int getAge(){
        return this.age;
        }
    }
