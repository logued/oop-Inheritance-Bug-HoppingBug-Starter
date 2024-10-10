package dkit.sd2;       // October 2024

import java.util.ArrayList;

/**
 * Bug demo  - solution to  question P8.12 from Big Java Book
 * and Starter code and Questions for HoppingBug
 */
public class AppMain {
    public static void main(String[] args) {
        System.out.println("\n*** BUG - AppMain ***");
        AppMain appMain = new AppMain();
        appMain.start();
    }

    public void start() {

        Bug bug1 = new Bug(0);
        System.out.println(bug1);
        bug1.move();
        bug1.move();
        System.out.println(bug1);
        bug1.turn();
        bug1.move();

        System.out.println(bug1);

//     Create ArrayList of Bug objects. Populate & display
        ArrayList<Bug> bugList = new ArrayList<>();
        bugList.add(bug1);  // add object that already exists
        bugList.add( new Bug(5) );
        bugList.add(new Bug(25));

        System.out.println("\nInitial Bugs in ArrayList");
        for (Bug bug : bugList) {
            System.out.println(bug.toString());
        }

        //HoppingBug hoppingBug1 = new HoppingBug(0,3);
        //bugList.add(hoppingBug1);

        //TODO Move all bugs in the list
        for (Bug bug : bugList) {
            bug.move();
        }

        for (Bug bug : bugList) {
            System.out.println(bug);
        }

        // TODO change direction of all bugs
        //

        //TODO complete the "HoppingBug" class as outlined in the empty starter class.

        //TODO #1 Create a single HoppingBug object and test the move() and toString methods.

        //TODO #2 Create and populate a single ArrayList of both Bug and HoppingBug objects
        //        ( Use an ArrayList<Bug> )

        //TODO #3 Display details of all bugs in the ArrayList (use toString())

        //TODO #4 Iterate over all bugs in the ArrayList, and call move() for each one.
        // Display their new details (use toString())

        //TODO #5  Display id and hoppingDistance for all hoppingBugs in ArrayList.

        //TODO #6 Implement and test .equals() for Bug objects (Compare based on id only)

        //TODO #7 WHat about .equals() for HoppingBug objects ?  discuss

    }


//    public static void displayBugs(ArrayList<Bug> bugs)
//    {
//        for (int i = 0; i < bugs.size(); i++)
//        {
//            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
//        }
//    }

}

