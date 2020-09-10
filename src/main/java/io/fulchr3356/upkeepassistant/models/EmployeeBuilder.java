package io.fulchr3356.upkeepassistant.models;

public final class EmployeeBuilder {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;
    private String position;
    private Double salary;
    private String password;

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
        this.password = dataToBeUpdated.getPassword();
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

    public EmployeeBuilder withDepartment(Department department) {
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

    public EmployeeBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public Employee build() {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmail(email);
        employee.setDepartment(department);
        employee.setPosition(position);
        employee.setSalary(salary);
        employee.setPassword(password);
        return employee;
    }
}
