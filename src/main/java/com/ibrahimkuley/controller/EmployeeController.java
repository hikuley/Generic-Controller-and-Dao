package com.ibrahimkuley.controller;

import com.ibrahimkuley.entity.Employee;
import com.ibrahimkuley.util.genericController.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikuley on 21.06.2015.
 */
@Controller
@RequestMapping("/rest/employee")
public class EmployeeController extends GenericController<Employee> {


}