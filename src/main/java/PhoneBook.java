import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> phbMap = new HashMap<>();
    public int add(String name, Integer number){
        phbMap.put(name, number);
        return 0;
    }

    public String findByNumbers(){
        return null;
    }

    public Integer getPhonebookSize(){
        return phbMap.size();
    }
}
