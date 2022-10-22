package service.Impl;

import org.springframework.stereotype.Service;
import service.DictionaryService;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public String translate(String search) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("House", "ngôi Nhà");
        stringMap.put("Mouse", "Con Chuột");
        stringMap.put("Dog", "Con Chó");
        stringMap.put("People", "Con Người");
        stringMap.put("Temperature", "Nhiệt Độ");
        String result = stringMap.get(search);
        if (result == null) {
            return "NOT FOUND!";
        }
        return result;
    }
}
