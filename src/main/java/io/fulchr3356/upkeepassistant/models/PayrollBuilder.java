package io.fulchr3356.upkeepassistant.models;

import java.sql.Date;

public final class PayrollBuilder {
    private Integer employeeId;
    private Double amount;
    private Date payDate;

    private PayrollBuilder() {
    }

    public static PayrollBuilder aPayroll() {
        return new PayrollBuilder();
    }

    public PayrollBuilder withEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public PayrollBuilder withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public PayrollBuilder withPayDate(Date payDate) {
        this.payDate = payDate;
        return this;
    }

    public Payroll build() {
        Payroll payroll = new Payroll();
        payroll.setId(employeeId);
        payroll.setAmount(amount);
        payroll.setPayDate(payDate);
        return payroll;
    }
}
