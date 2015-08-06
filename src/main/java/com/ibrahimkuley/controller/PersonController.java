package com.ibrahimkuley.controller;

import com.ibrahimkuley.entity.Person;
import com.ibrahimkuley.util.genericController.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikuley on 21.06.2015.
 */

@Controller
@RequestMapping("/rest/person")
public class PersonController extends GenericController<Person> {
}