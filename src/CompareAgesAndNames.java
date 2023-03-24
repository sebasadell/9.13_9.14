import java.util.Comparator;

public class CompareAgesAndNames implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int result = ((Footballer)o1).age - ((Footballer)o2).age;
        if (result == 0){
            Footballer f1 = (Footballer) o1;
            Footballer f2 = (Footballer) o2;
            boolean equal = true;
            int counter = 0;
            if (f1.name.equals(f2)){
                result = 0;
            }
            else {
                while (equal && counter < f1.name.length()){
                    if (f1.name.charAt(counter) < f2.name.charAt(counter)){
                        result = -1;
                        equal = false;
                    }
                    else if (f1.name.charAt(counter) > f2.name.charAt(counter)){
                        result = 1;
                        equal = false;
                    }
                    counter++;
                }
            }
        }
        return result;
    }
}
