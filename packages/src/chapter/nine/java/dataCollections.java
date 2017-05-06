package chapter.nine.java;

/**
 * Created by edytawrobel on 05/05/2017.
 */
public class dataCollections {

    public static void main(String[] args) {

        String[][] states = new String[3][2]; //2-dimensional array
        states[0][0] = "California"; // add to the first array on position zero - the state
        states[0][1] = "Sacramento"; // add to the first array, on the first position - the capital
        states[1][0] = "Oregon";
        states[1][1] = "Salem";
        states[2][0] = "Washington";
        states[2][1] = "Olympia";

        for (int i = 0; i < states.length; i++) { //it refers to the outer array, looping 3 times
            StringBuilder sb = new StringBuilder();
            sb.append("The capital of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(".");
            System.out.println(sb);
        }
    }

}
