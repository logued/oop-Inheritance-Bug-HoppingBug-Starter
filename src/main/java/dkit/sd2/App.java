package dkit.sd2;

import java.util.ArrayList;

/**
 * Bug demo  - solution to  question P8.12 in Book
 * <p>
 * <p>

 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** BUG - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        Bug bug1 = new Bug(0);
        bug1.turn();
        bug1.move();

//     Create ArrayList of Bug objects. Populate & display

        ArrayList<Bug> bugList = new ArrayList<>();

        bugList.add(bug1);
        bugList.add(new Bug(5));
        bugList.add(new Bug(25));

        System.out.println("\nInitial Bugs in ArrayList");
        for (Bug bug : bugList)
        {
            System.out.println(bug);
        }


        //TODO complete the "HoppingBug" class as outlined in the empty starter class.

        //TODO #1 Create a single HoppingBug object. Test and correct your HoppingBug class

        //TODO #2 Create and populate a single ArrayList of both Bug and HoppingBug objects

        //TODO #3 Display details of all bugs in ArrayList (use toString())

        //TODO #4 Call move() for all bugs in ArrayList. Display their new details (use toString())

        //TODO #5  Display id and hoppingDistance for all hoppingBugs in ArrayList.

        //TODO #6 Implement and test .equals() for Bug objects

        //TODO #7 Implement and test .equals() for HoppingBug objects

    }


//    public static void displayBugs(ArrayList<Bug> bugs)
//    {
//        for (int i = 0; i < bugs.size(); i++)
//        {
//            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
//        }
//    }

}



