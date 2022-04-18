import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String date1 = "2022-03-21";
        String date2 = "2022-03-21";
        String date3 = "2022-03-22";
        String date4 = "2022-03-20";
        List<String> list = new ArrayList<>();
        list.add(date4);
        list.add(date2);
        list.add(date1);
        list.add(date3);
        String date5 = "2022-03-19";
        int index = -1;
        for (String date : list) {
            System.out.println("date = " + date);
            int compare = date5.compareTo(date);
            System.out.println("compare = " + compare);
            if (compare < 0){
                index = list.indexOf(date);
                break;
            }
        }
        System.out.println(index);
        for (int i = index; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(date5);

        test01("ceshi");
    }


    public static void test01(String... strings){
        if (strings != null) {
            System.out.println(strings);
        }
    }
}
