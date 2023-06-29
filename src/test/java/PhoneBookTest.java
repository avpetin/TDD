import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.stream.Stream;

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
    @MethodSource("addSourceNumber")
    public void testFindByNumber(String expected){
        var result = sut.findByNumbers(Mockito.anyInt());
        //assert
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> addSourceNumber() {
        return Stream.of(
                Arguments.of(Mockito.anyString())
        );
    }
}
