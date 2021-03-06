/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kauro
 */
public class Manager extends Employee {

    protected double _bonus;
    protected double _vacPay;

    public Manager(String name, double wage, double numHours, double bonus, double vacPay) {
        super(name, wage, numHours);
        _bonus = bonus;
        _vacPay = vacPay;
    }

    @Override
    protected double calculatePay() {
        return (super.calculatePay() +_vacPay + _bonus);
    }
}
