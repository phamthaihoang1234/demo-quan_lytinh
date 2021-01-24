package com.example.demo.controllers;



import com.example.demo.model.Customer;
import com.example.demo.model.Province;
import com.example.demo.service.CustomerService;

import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {


    @Autowired
    CustomerService customerService;

    @Autowired
    ProvinceService provinceService;


    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();

    }

    @GetMapping
    public String listCustomer(Model model){
        model.addAttribute("customers",customerService.findAll());
        return "/customer/list";
    }

    @GetMapping("/create-customer")
    public String showFormcreate(Model model){
        model.addAttribute("customer",new Customer());
        return "/customer/create";
    }

    @PostMapping("/create-customer")
    // ca một buổi chiều tìm ra cái lỗi nếu để annotation @PathVariable mà không để tham số vào trong sẽ bị lỗi
    // nên là nếu dùng annotation @PathVariable bắt buộc phải truyền giá trị tham số vào cho nó
    public String save(Customer customer , Model model){
        customerService.save(customer);
        model.addAttribute("messages","New customers was created successed!!");
        return "/customer/create";
    }






}
