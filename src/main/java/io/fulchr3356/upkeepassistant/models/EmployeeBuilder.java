package io.fulchr3356.upkeepassistant.models;

public final class EmployeeBuilder {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String position;
    private Double salary;

    public EmployeeBuilder() {
    }

    public EmployeeBuilder(Employee dataToBeUpdated){
        this.id = dataToBeUpdated.getId();
        this.firstName = dataToBeUpdated.getFirstName();
        this.lastName = dataToBeUpdated.getLastName();
        this.email = dataToBeUpdated.getEmail();
        this.department = dataToBeUpdated.getDepartment();
        this.position = dataToBeUpdated.getPosition();
        this.salary = dataToBeUpdated.getSalary();
    }

    public static EmployeeBuilder anEmployee() {
        return new EmployeeBuilder();
    }

    public EmployeeBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder withDepartment(String  department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public EmployeeBuilder withSalary(Double salary) {
        this.salary = salary;
        return this;
    }



    public Employee build() {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmail(email);
        employee.setDepartment(department);
        employee.setPosition(position);
        employee.setSalary(salary);
        return employee;
    }
}
