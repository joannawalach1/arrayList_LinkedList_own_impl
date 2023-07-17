package pl.great.waw.company3.listimpl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class genericArrayListTest {

    @Test
    void testAddElement() {
        genericArrayList genericArrayList1 = new genericArrayList();
        genericArrayList genericArrayList2 = new genericArrayList();

        Object result1 = genericArrayList1.addElement(3);
        Object result2 = genericArrayList1.addElement(8);
        Object result3 = genericArrayList2.addElement("Anna");
        Object result4 = genericArrayList2.addElement("Magda");

        assertEquals(result1, 3);
        assertEquals(result2, 8);
        assertEquals(result3, "Anna");
        assertEquals(result4, "Magda");
    }

    @Test
    void testGetElement() {
        genericArrayList genericArrayList1 = new genericArrayList();
        genericArrayList genericArrayList2 = new genericArrayList();

        Object result1 = genericArrayList1.addElement(3);
        Object result2 = genericArrayList1.getElement(0);
        Object result3 = genericArrayList2.addElement("Anna");
        Object result4 = genericArrayList2.getElement(0);

        assertEquals(result2, 3);
        assertEquals(result4, "Anna");
        assertEquals(result1, 3);
        assertEquals(result3, "Anna");

    }
}


