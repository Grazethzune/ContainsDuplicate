import java.util.HashSet;
import java.util.Arrays;
public class Main {
    /**
     * Method untuk cek duplikasi string
     * @param string Input string.
     * @return boolean
     */
    public static boolean containsDuplicates(String string) {
        return string.length() != new HashSet(Arrays.asList(string.split(""))).size();
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicates("12     341"));
    }
}