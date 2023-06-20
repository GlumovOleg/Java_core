package hw3.company.workers;

public class Worker {

    String name;
    String role;
    String telephone;
    int salary;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Worker(String name, String role, String telephone, int salary, int age) {
        this.name = name;
        this.role = role;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник ФИО = " + name +
                ", должность = " + role +
                ", телефон = " + telephone +
                ", заработная плата = " + salary + "$" +
                ", возраст = " + age;
    }
}
