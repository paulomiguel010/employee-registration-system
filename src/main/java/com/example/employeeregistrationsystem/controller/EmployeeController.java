package com.example.employeeregistrationsystem.controller;

import com.example.employeeregistrationsystem.entity.Employee;
import com.example.employeeregistrationsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/list")
    public String findEmployees(Model model){
        List<Employee> employees =employeeService.findAll();
        model.addAttribute("employee", employees);
        return "list-employees";
    }
    @GetMapping("/showEmployeeForm")
    public String employeeForm(Model model){
         Employee employee = new Employee();
         model.addAttribute("employee", employee);
        return "employee-form";
    }

    @PostMapping("/save")
    public String submitEmployeeForm(@ModelAttribute("employee") Employee employee){
       employeeService.save(employee);
       return "redirect:/employees/list";
    }

    @GetMapping("/updateForm")
    public String updateForm(@RequestParam("employeeId") int id, Model model){
       Optional<Employee> employee =employeeService.findById(id);
       model.addAttribute("employee", employee);
       return "employee-form";
    }

    @GetMapping("deleteDetails")
    public String deleteEmployeeDetails(@RequestParam("employeeId")int id){
          employeeService.deleteById(id);
         return "redirect:/employees/list";
    }

}
