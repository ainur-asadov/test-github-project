package org.asadov.contoller;

import org.asadov.service.StringSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringSupplierController {

    @Autowired
    private StringSupplierService stringSupplierService;

    @GetMapping(value = "/strings")
    public String getString() {
        return stringSupplierService.getString();
    }

}
