import static org.junit.Assert.*;
import  org.junit.Before;
import  org.junit.Test;

import java.util.NoSuchElementException;

public class ListaTest {
    private ListaID lista;
    @Before
    public void setup(){
        lista = new ListaID();
    }
    @Test
    public void testEmptyListIsEmpty(){
        assertTrue(lista.isEmpty());
    }
    @Test
    public void testSizeIsZeroInitially(){
        assertEquals(0,lista.size());
    }
    @Test
    public void testSizeIsNotZeroWhenElementsAreAdded(){
        lista.add(1);
        assertEquals(1,lista.size());
    }

    @Test
    public void testEmptyListIsFalseWhenElementsAreAdded(){
        lista.add(1);
        assertFalse(lista.isEmpty());
    }
    @Test (expected = NoSuchElementException.class)
    public void testGetNegativeNumbersFails(){
        lista.get(-1);
    }
    @Test
    public void testToStringEmptyList(){
        assertEquals("[]",lista.toString());
    }
    @Test
    public void testToStringNotEmptyList(){
        lista.add(3);
        lista.add(5);
        assertEquals("[3, 5, ] ",lista.toString());
    }
    @Test
    public void testToStringNotEmptyListTwice(){
        lista.add(3);
        lista.add(5);
        assertEquals("[3, 5, ] ",lista.toString());
        assertEquals("[3, 5, ] ",lista.toString());
    }
}