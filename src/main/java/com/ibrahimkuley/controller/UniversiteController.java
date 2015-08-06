package com.ibrahimkuley.controller;

import com.ibrahimkuley.entity.Universite;
import com.ibrahimkuley.util.genericController.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikuley on 24.07.2015.
 */

@Controller
@RequestMapping("/rest/universite")
public class UniversiteController extends GenericController<Universite> {
}
