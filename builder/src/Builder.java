public class Builder {
    /*
    цель: отделить конструирование сложного объекта(с большим количеством полей) от его представления таким образом,
    чтобы в результате одного и того же конструирования мы могли получать разные представления
    Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();



    Builder (Строитель) - используется для создания сложного объекта с использованием простых объектов.
    Постепенно он создает больший объект от малого и простого объекта.
     */

    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC")
                .setHasBike(false)
                .setHasBike(true)
                .build();

        System.out.println(employee);
    }

}
