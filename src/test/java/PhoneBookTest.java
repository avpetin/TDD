import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class PhoneBookTest {
    PhoneBook sut = new PhoneBook();
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Test
    public void testAds(){
        //arrange
        int expected = 1, result;
        //act
        sut.add(Mockito.anyString(), Mockito.anyInt());
        result = sut.getPhonebookSize();
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber(){
        //arrange
        String expected = null;
        //act
        var result = sut.findByNumber(Mockito.anyInt());
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByName(){
        //arrange
        int expected = Mockito.anyInt();
        //act
        var result = sut.findByName(Mockito.anyString());
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void testPrintAllNames(){
        //arrange
        sut.printAllNames();
        //act
        String output = "";
        //assert
        assertEquals(output , outContent.toString());
    }
}
