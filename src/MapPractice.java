import java.io.IOException;
import java.util.LinkedHashMap;

public class MapPractice {

  public static void main(String[] args) throws IOException {
    linkedHashMapOrder();
  }

  static void linkedHashMapOrder() {
    LinkedHashMap<String, String> hashMap = new java.util.LinkedHashMap<>();

    hashMap.put("test1", "before");
    hashMap.put("test2", "test2");

    System.out.println(hashMap.entrySet());
    System.out.println(hashMap.keySet());
    System.out.println(hashMap.values());
    System.out.println();

    hashMap.put("test1", "after");

    System.out.println(hashMap.entrySet());
    System.out.println(hashMap.keySet());
    System.out.println(hashMap.values());
  }

}
