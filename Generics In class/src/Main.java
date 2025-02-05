public class Main {
    public static void main(String[] args) {

        /**
        Class as Generic
         */
        Pair<String,Integer> pair=new Pair<>("Age",20);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        /**
         *        Interface as Generic
         */


    }
}

/** Notes**
 *   T:Type
 *   E:Element(used in collection)
 *   K:Key(used in maps)
 *   V:Value(used in maps)
 *   N:Number
 */