import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class PhoneBookTest {
    PhoneBook sut = new PhoneBook();
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

    @Test
    public void testPrintAllNames(){
        //arrange
        sut.add("a", 1);
        sut.add("b", 2);
        sut.add("c", 3);

        String expected = "a";
        //act

        sut = Mockito.mock(PhoneBook.class);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(sut, Mockito.times(1)).printAllNames();
        //assert
        Assertions.assertEquals(String.format("Name ", sut.findByNumber(1)),
                argumentCaptor.getValue());
    }
}
