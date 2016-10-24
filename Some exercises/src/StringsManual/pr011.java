package StringsManual;





        import java.util.*;

        public class pr011 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String[] input = sc.nextLine().split("[ ,.?!]+");

                List<String> list = new ArrayList<>();

                for (String el : input) {
                    String oldString = el;
                    StringBuilder sb = new StringBuilder(el);
                    sb = sb.reverse();

                    if (sb.toString().equals(oldString)){
                        if (!list.contains(oldString)){
                            list.add(oldString);
                        }

                    }
                }


                Collections.sort(list);
                System.out.println(list);

            }
        }

