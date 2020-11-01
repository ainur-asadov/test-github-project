package org.asadov.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Тестовые сценарии для проверки {@link StringSupplierService}.
 */
class StringSupplierServiceTest {

    /**
     * Проверяет корректность ответа при вызове {@link StringSupplierService#getString()}.
     */
    @Test
    void getString_default_correctStringReturned() {
        Assertions.assertEquals("Some String", new StringSupplierService().getString());
    }

}