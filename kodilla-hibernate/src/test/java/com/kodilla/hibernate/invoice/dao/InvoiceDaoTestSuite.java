package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;


    @Test
    void testInvoiceDaoSave() {
        Item item = new Item(new BigDecimal(100),100,new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(100),100,new BigDecimal(100));
        Product product = new Product("product");
        Product product2 = new Product("product2");
        item.setProduct(product);
        item2.setProduct(product2);

        Invoice invoice = new Invoice("123");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        //when
        productDao.save(product);
        productDao.save(product2);
        int productId = product.getId();
        int productId2 = product2.getId();

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //then
        assertNotEquals(0, invoiceId);
        assertNotEquals(0,productId);

        //cleanUp
        productDao.deleteById(productId);
        productDao.deleteById(productId2);
        invoiceDao.deleteById(invoiceId);

    }

}

