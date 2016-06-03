package Chapter9;

import java.util.ArrayList;

/**
 * Created by yuwang on 6/1/16.
 * <p>
 * return all subsets from a set
 * method: prevSetResult + (for loop over prevSetResult and add new element into each set)
 */
public class Four {

    private static ArrayList<ArrayList<String>> allSubSets(ArrayList<String> arrayList, int index) {

        ArrayList<ArrayList<String>> allSubSets = new ArrayList<>();

        // Base case
        if (index == arrayList.size()) {

            ArrayList<String> subSet = new ArrayList<>();
            allSubSets.add(subSet);

        }

        if (index < arrayList.size()) {
            //   System.out.println("index=" + index);

            allSubSets = allSubSets(arrayList, index + 1);
            String newElement = arrayList.get(index);

            ArrayList<ArrayList<String>> more = new ArrayList<>();


            // System.out.println("prev allset=" + allSubSets);

            for (ArrayList<String> singleSet : allSubSets) {

                ArrayList<String> temp = new ArrayList<>();
                temp.add(newElement);
                temp.addAll(singleSet);
                more.add(temp);

            }


            //   System.out.println("result=" + allSubSets);

            allSubSets.addAll(more);


        }


        return allSubSets;


    }


    public static void main(String[] argues) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a1");
        arrayList.add("a2");
        arrayList.add("a3");
        arrayList.add("a4");
        arrayList.add("a5");
        arrayList.add("a6");
        arrayList.add("a7");
        arrayList.add("a8");

        ArrayList<ArrayList<String>> result = allSubSets(arrayList, 0);

        System.out.println(arrayList);

        for (ArrayList<String> set : result) {

            System.out.println(set);
        }

    }


}
