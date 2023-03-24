import java.util.Comparator;

public class Footballer implements Comparable {
    String dni;
    String name;
    int age;
    int goals;

    public Footballer(String dni, String name, int age, int goals){
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.goals = goals;
    }

    public String toString(){
        return "DNI: " + dni + " | Name: " + name + " | Age: " + age + " | Goals: " + goals + "\n";
    }

    public boolean equals(Footballer f){
        boolean equals = true;
        int counter = 0;
        while (equals && counter < dni.length()){
            if (dni.charAt(counter) != f.dni.charAt(counter)){
                equals = false;
            }
            counter++;
        }
        return equals;
    }

    @Override
    public int compareTo(Object o) {
        int result = 0;
        Footballer f = (Footballer) o;
        boolean equal = true;
        int counter = 0;
        if (dni.equals(f)){
            result = 0;
        }
        else {
            while (equal && counter < dni.length()){
                if (dni.charAt(counter) < f.dni.charAt(counter)){
                    result = -1;
                    equal = false;
                }
                else if (dni.charAt(counter) > f.dni.charAt(counter)){
                    result = 1;
                    equal = false;
                }
                counter++;
            }
        }
        return result;
    }
}