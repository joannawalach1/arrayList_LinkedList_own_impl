package pl.great.waw.company3.listimpl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class genericLinkedListTest {

    @Test
    void testAddElement() {
        genericLinkedList genericLinkList1 = new genericLinkedList();
        genericLinkedList genericLinkList2 = new genericLinkedList();

        Object result1 = genericLinkList1.addElement(3);
        Object result2 = genericLinkList1.addElement(8);
        Object result3 = genericLinkList2.addElement("Anna");
        Object result4 = genericLinkList2.addElement("Magda");

        assertEquals(result1, 3);
        assertEquals(result2, 8);
        assertEquals(result3, "Anna");
        assertEquals(result4, "Magda");
    }

    @Test
    void testGetElement() {
        genericLinkedList genericLinkList1 = new genericLinkedList();
        genericLinkedList genericLinkList2 = new genericLinkedList();

        Object result1 = genericLinkList1.addElement(3);
        Object result2 = genericLinkList1.getElement(0);
        Object result3 = genericLinkList2.addElement("Anna");
        Object result4 = genericLinkList2.getElement(0);

        assertEquals(result2, 3);
        assertEquals(result4, "Anna");
        assertEquals(result1, 3);
        assertEquals(result3, "Anna");

    }
}