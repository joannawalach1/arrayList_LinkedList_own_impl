package pl.great.waw.company3.listimpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerformanceTest {
    private List<ListIn> listImpl;

    @BeforeEach
    public void setup() {
        listImpl = Arrays.asList(new genericArrayList(), new genericLinkedList());
    }

    @Test
    void listImpl() {
        listImpl.forEach(list -> {
            assertNotEquals(3, list.equals(3));
        });
    }


    @Test
    void listPerformance1() {
        for (ListIn list : listImpl) {
            boolean positive = false;
            long startTime = System.nanoTime();
            for (int i = 0; i < listImpl.size(); i++) {
                list.addElement(15);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(list.getClass().getSimpleName() + " Czas wykonania metody ADD: " + duration + " ns");
            positive = true;
            assertTrue(positive);
        }
    }
    @Test
    void listPerformance2() {
        for (ListIn list : listImpl) {
            boolean positive = false;
            long startTime = System.nanoTime();
            for (int i = 0; i < listImpl.size(); i++) {
                list.getElement(6);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(list.getClass().getSimpleName() + " Czas wykonania metody GET: " + duration + " ns");
            positive = true;
            assertTrue(positive);
        }
    }
    @Test
    void listPerformance3() {
        for (ListIn list : listImpl) {
            boolean positive = false;
            long startTime = System.nanoTime();
            for (int i = 0; i < listImpl.size(); i++) {
                list.deleteElement(2);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(list.getClass().getSimpleName() + " Czas wykonania metody DELETE: " + duration + " ns");
            positive = true;
            assertTrue(positive);
        }
    }
}
