package com.practice.java.reflection.di;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ContainerServiceTest {
    @Test
    public void getObject() throws ReflectiveOperationException {
        BookRepository object = ContainerService.getObject(BookRepository.class);
        assertThat(object).isNotNull();
    }

    @Test
    public void getObjectWithDI() {
        BookService object = ContainerService.getObject(BookService.class);
        assertThat(object).isNotNull();
        assertThat(object.bookRepository).isNotNull();
    }
}