package Chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceClassTest {
    InvoiceClass invoiceClass;

    @BeforeEach
    void setUp() {
        invoiceClass = new InvoiceClass("123", "Iphone", 12, 200);
    }

    @AfterEach
    void tearDown() {
        invoiceClass = null;
    }

    @Test
    void newInvoiceClassHasBeenCreated() {
        assertNotNull(invoiceClass);
    }

    @Test
    void invoiceWouldReturnZeroIfItemBeingPurchasedIsLessThanZero() {
        invoiceClass.setItemBeingPurchased(-67);
        assertEquals(0, invoiceClass.getItemBeingPurchased());
    }

    @Test
    void invoiceWouldReturnZeroIfPriceIsLessThanZero() {
        invoiceClass.setPricePerItem(-67);
        assertEquals(0, invoiceClass.getPricePerItem());
    }

    @Test
    public void defaultPartNumberIsAddedToAnyPartNumberGiven() {
        invoiceClass.setPartNumber("123");
        assertEquals("01123", invoiceClass.getPartNumber());
    }

    @Test
    public void partDescriptionIsNoTNull() {
        invoiceClass.setPartDescription("A Spanner");
        assertEquals("A Spanner",invoiceClass.getPartDescription());
            }

    @Test
    public void quantityOfItemPurchasedIsNotNull() {
        invoiceClass.setItemBeingPurchased(388);
        assertEquals(388,  invoiceClass.getItemBeingPurchased());
         }
         @Test
    void invoiceAmountCanBeCalculated(){
        invoiceClass.setItemBeingPurchased(500);
        invoiceClass.setPricePerItem(2);
        assertEquals(1000, invoiceClass.getInvoiceAmount());
         }
}
