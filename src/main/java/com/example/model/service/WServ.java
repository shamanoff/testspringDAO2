package com.example.model.service;


import com.example.model.entity.Employee;
import com.example.model.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WServ implements IWServ {

    @Autowired
//    private IDao iDao;
    private EmployeeRepository employeeRepository;



    @Override
    public void save(Employee employee) {
     employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
       return employeeRepository.findAll();
    }

    @Override
    public Employee find(Integer id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public Employee findByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public Employee delete(Integer id) {
        Employee employee = employeeRepository.findOne(id);
        employeeRepository.delete(id);
        return employee;
    }


/*
    @Override
    public void print(Integer id) {
        Employee employee = (Employee) iDao.findOne(id);
        System.out.println(employee.toString());
    }

    @Override
    public void save(Employee employee) {
        iDao.save(employee);

    }

    @Override
    public List<Employee> findAll() {
        return iDao.findAll();
    }

    @Override
    public Employee find(Integer id) {
        return iDao.findOne(id);
    }


    public Employee delete(Integer id) {
        return iDao.delete(id);

    }
*/


}
