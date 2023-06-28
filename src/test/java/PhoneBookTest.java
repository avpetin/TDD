import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.verify;

public class PhoneBookTest {
    @Test
    public void testAds(){
        //arrange
        PhoneBook phoneBook = Mockito.mock(PhoneBook.class);
        Mockito.when(phoneBook.add(Mockito.anyString(), Mockito.anyInt()))
                .thenReturn(0);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(phoneBook).add(Mockito.anyString(), Mockito.anyInt());
        Assertions.assertEquals(phoneBook.add(Mockito.anyString(), Mockito.anyInt()), argumentCaptor.getValue());
    }
}
