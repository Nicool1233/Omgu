import org.junit.Test;
import java.net.PortUnreachableException;

import static org.junit.Assert.*;


public class test
{
    @Test
    public void testExpansion1()
    {
        StringProcessor d = new StringProcessor();
        StringBuilder n = new StringBuilder("123");
        int k = 5;
        String o = d.Expansion(k, n);
        String t = "123123123123123";
        assertEquals(t, o.toString());
    }
    @Test
    public void testExpansion2()
    {
        StringProcessor d = new StringProcessor();
        StringBuilder n = new StringBuilder("123");
        int k = 0;
        String o = d.Expansion(k, n);
        String t = "";
        assertEquals(t, o);
    }
    @Test
    public void testExpansion3()
    {
        StringProcessor d = new StringProcessor();
        StringBuilder n = new StringBuilder("123");
        int k = -1;
        String o;
        String t = "";
        try{
            d.Expansion(k, n);
        }catch (IllegalArgumentException e)
        {
            System.err.println("Отрицательный параметр N");
        }
    }
    @Test
    public void testRemake1()
    {
        String a = "123435618";
        String b = "ОдинДваТриТриОдин";
        StringProcessor d = new StringProcessor();
        String k = d.Remake(a);
        assertEquals(b, k);
    }
    @Test
    public void testRemake2()
    {
        String a = "4568";
        String b = "";
        StringProcessor d = new StringProcessor();
        String k = d.Remake(a);
        assertEquals(b, k);
    }
    @Test
    public void testOccurrences1()
    {
        String a = "12312345612378123456123";
        String b = "123";
        StringProcessor d = new StringProcessor();
        int k = d.Occurrences(a,b);
        assertEquals(5, k);
    }
    @Test
    public void testOccurrences2()
    {
        String a = "12312345612378123456123";
        String b = "";
        StringProcessor d = new StringProcessor();
        try{
            d.Occurrences(a,b);
        }catch (IllegalArgumentException e)
        {
            System.err.println("Че-то не то");
        }
    }
    @Test
    public void testDelete()
    {
        StringBuilder a = new StringBuilder("123456789");
        StringBuilder b = new StringBuilder("13579");
        StringProcessor c = new StringProcessor();
        String d = c.deleteSymbol(a);
        assertEquals(b.toString(), d.toString());
    }
    @Test
    public void testSwap()
    {
        StringProcessor b = new StringProcessor();
        String a = "1    2   3   4 5   6";
        String expected = "6   5 4   3   2    1";
        assertEquals(expected, b.swapWords(a));
    }
        @Test
        public void testReplaceHexadecimalNumbers() {
        StringProcessor n = new StringProcessor();
            String str = "На часах 0x00000010:0x000000000x00000005";
            String expected = "На часах 16:05";

            assertEquals(n.replaceHexadecimalNumbers(str), expected);
        }
    }


