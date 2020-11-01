package org.asadov.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.asadov.service.StringSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class StringSupplierController {

    @Autowired
    private StringSupplierService stringSupplierService;

    @ApiOperation(value = "Get string value", response = String.class)
    @GetMapping(value = "/strings")
    public String getString() {
        return stringSupplierService.getString();
    }

}
