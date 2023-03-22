package edu.iu.p565.customerservice.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.iu.p565.customerservice.model.customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    public List<customer> findAll (){
        return null;
    }
}