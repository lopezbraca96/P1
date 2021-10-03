package dev.lopez.services;

import dev.lopez.Daos.EmployeeRepo;
import dev.lopez.exceptions.IncorrectPasswordException;
import dev.lopez.exceptions.NoUsernameFound;
import dev.lopez.models.Employee;

public class EmServices {
    private final EmployeeRepo employeeRepo;


    public EmServices() {

       this.employeeRepo = new EmployeeRepo();
    }





}
