import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    private Map<String, Integer> phbMap = new HashMap<>();
    public int add(String name, Integer number){
        phbMap.put(name, number);
        return 0;
    }

    public String findByNumbers(int number){
        Object value = new Object();
        Optional<String> result = phbMap.
                entrySet().
                stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        return result.get();

    }

    public Integer getPhonebookSize(){
        return phbMap.size();
    }
}
