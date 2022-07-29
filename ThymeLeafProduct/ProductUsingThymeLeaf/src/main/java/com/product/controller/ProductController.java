package com.product.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.entity.Product;
import com.product.service.ProductService;
@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/productList")
	public String findAll(Model model) {
		List<Product> productList = productService.findAll();
		model.addAttribute("productDetails", productList);
		return "/UI/productDetails.html";
	}
	
	@GetMapping("/addProductDetails")
	public String productForm(Model model) {
		Product product = new Product();
		model.addAttribute("employeeDetails", product);
		return "/UI/productForm.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("productDetails") Product product) {
		productService.save(product);
		return "redirect:/product/productList";
	}
	
	@GetMapping("/updateForm")
	public String updateProduct(@RequestParam("id")Integer id,Model model) {
		Product product = productService.findById(id);
		model.addAttribute("productDetails", product);
		return "UI/productForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("id")Integer id) {
		productService.deleteById(id);
		return "redirect:/product/productList";
	}
}
