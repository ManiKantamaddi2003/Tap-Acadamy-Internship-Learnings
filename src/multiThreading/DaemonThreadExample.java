package multiThreading;

class Captain extends Thread {
    @Override
    public void run() {
        try {
            BattingCoach bc = new BattingCoach();
            BowlingCoach boc = new BowlingCoach();
            boc.setDaemon(true);
            bc.setDaemon(true);
            boc.start();
            bc.start();
            System.out.println("Captain Entered Into Ground");
            Thread.sleep(3000);
            System.out.println("Captain Started Warm-Up");
            Thread.sleep(3000);
            System.out.println("Captain Started Practicing Catches");
            Thread.sleep(3000);
            System.out.println("Captain Started Practicing Batting");
            Thread.sleep(3000);
            System.out.println("Captain Started Fielding Practice");
            Thread.sleep(3000);
            System.out.println("Captain goes to Hotel");
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}

class BattingCoach extends Thread {
    @Override
    public void run() {
        try {
            for (;;) {
                System.out.println("Batting Coach in the Ground");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}

class BowlingCoach extends Thread {
    @Override
    public void run() {
        try {
            for (;;) {
                System.out.println("Bowling Coach in the Ground");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        Captain obj = new Captain();
        obj.start();
    }
}
