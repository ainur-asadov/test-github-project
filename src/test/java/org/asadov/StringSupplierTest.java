package org.asadov;

import org.junit.Assert;
import org.junit.Test;

/**
 * Класс для проверки {@link org.asadov.StringSupplier}.
 */
public class StringSupplierTest {

    /**
     * Тестовый сценарий на проверку корректности ответа при вызове {@link
     * StringSupplier#getString()}.
     */
    @Test
    public void getString_default_correctStringReturned() {
        Assert.assertEquals("Some String", new StringSupplier().getString());
    }

}