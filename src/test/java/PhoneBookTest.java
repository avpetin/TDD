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
/*        PhoneBook phoneBook = Mockito.mock(PhoneBook.class);
        Mockito.when(phoneBook.add(Mockito.anyString(), Mockito.anyInt()))
                .thenReturn(0);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(phoneBook).add(Mockito.anyString(), Mockito.anyInt());*/

        //arrange
        int expected = 1, result;
        //act
        sut.add(Mockito.anyString(), Mockito.anyInt());
        result = sut.getPhonebookSize();
        //assert
        Assertions.assertEquals(expected, result);
    }
}
