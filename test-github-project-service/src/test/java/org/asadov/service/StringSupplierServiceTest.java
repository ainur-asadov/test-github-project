package org.asadov.service;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тестовые сценарии для проверки {@link StringSupplierService}.
 */
public class StringSupplierServiceTest {

    /**
     * Проверяет корректность ответа при вызове {@link StringSupplierService#getString()}.
     */
    @Test
    public void getString_default_correctStringReturned() {
        Assert.assertEquals("Some String", new StringSupplierService().getString());
    }

}