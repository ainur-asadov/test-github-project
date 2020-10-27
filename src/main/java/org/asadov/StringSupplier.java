package org.asadov;

/**
 * Поставщик строк.
 */
public class StringSupplier {

    /**
     * Строка, которая будет возвращена при вызове {@link StringSupplier#getString()}.
     */
    private static final String SOME_STRING = "Some String";

    /**
     * Возвращает строку.
     */
    public String getString() {
        return SOME_STRING;
    }

}
