import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        System.out.println(vowels.length);
//        for(char item:vowels){
//            System.out.println(item);


        List<String> langs = new ArrayList<>();

        langs.add("Java");
        langs.add("Python");
        langs.add(1, "C#");
        langs.add(0, "Ruby");

        for (String lang : langs) {
            System.out.printf("%s ", lang);
        }
    }
}
