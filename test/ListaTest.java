import static org.junit.Assert.*;
import  org.junit.Before;
import  org.junit.Test;

import java.util.NoSuchElementException;

public class ListaTest {
    private Lista lista;
    @Before
    public void setup(){
        lista = new Lista();
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
        assertEquals("[3], ",lista.toString());
    }
}