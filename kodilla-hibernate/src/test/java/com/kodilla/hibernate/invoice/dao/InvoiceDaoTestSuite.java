package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){

        //Given
        BigDecimal bd1,bd2,bd3;
        bd1 = new BigDecimal("40.0");
        bd2 = new BigDecimal("30.0");
        bd3 = new BigDecimal("20.0");

        Item item1 = new Item(bd1,2,bd1);
        Item item2 = new Item(new BigDecimal("30.0"),3,bd2);
        Item item3 = new Item(bd3,100,bd2);

        Invoice invoice1 = new Invoice("nr.1-04/2020");
        Invoice invoice2 = new Invoice("nr.2-04/2020");
        Invoice invoice3 = new Invoice("nr.3-04/2020");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item2);

        invoice2.getItems().add(item1);
        invoice2.getItems().add(item1);
        invoice2.getItems().add(item1);

        invoice3.getItems().add(item1);
        invoice3.getItems().add(item2);
        invoice1.getItems().add(item3);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3Id = invoice3.getId();

        //Then
        Assert.assertEquals(0,invoice1Id);
        Assert.assertEquals(0,invoice2Id);
        Assert.assertEquals(0,invoice3Id);

        //CleanUp
        try{
            invoiceDao.deleteById(invoice1Id);
            invoiceDao.deleteById(invoice2Id);
            invoiceDao.deleteById(invoice3Id);
        }catch (Exception e){
            //do nothing
        }
    }
}
