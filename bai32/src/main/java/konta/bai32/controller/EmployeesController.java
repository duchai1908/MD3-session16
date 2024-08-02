package konta.bai32.controller;

import konta.bai32.model.Employees;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeesController {
    @RequestMapping(value = {"/","initInsertEmployee"})
    public String initInsert(Model model){
        Employees employees = new Employees();
        model.addAttribute("employee", employees);
        return "insertEmployee";
    }
    @RequestMapping("/insertEmployee")
    public String insertEmployee(Employees employees,Model model){
        model.addAttribute("employee",employees);
        return "viewEmployee";
    }
}
