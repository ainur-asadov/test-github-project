package org.asadov.service;

import org.springframework.stereotype.Service;

/**
 * Поставщик строк.
 */
@Service
public class StringSupplierService {

    /**
     * Строка, которая будет возвращена при вызове {@link StringSupplierService#getString()}.
     */
    private static final String SOME_STRING = "Some String";

    /**
     * Возвращает строку.
     */
    public String getString() {
        return SOME_STRING;
    }

}
