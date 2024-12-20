package multiThreading9;
import java.util.Scanner;

class Numbers extends Thread {
    @Override
    public void run() {
        System.out.println("Printing Numbers Started");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing Numbers Ended");
    }
}

class Letters extends Thread {
    @Override
    public void run() {
        System.out.println("Printing Alphabets Started");
        for (int i = 65; i <= 70; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing Alphabets Ended");
    }
}

class Sletters extends Thread {
    @Override
    public void run() {
        System.out.println("Printing Small Alphabets Started");
        for (int i = 97; i <= 100; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing Small Alphabets Ended");
    }
}

class Add extends Thread {
    @Override
    public void run() {
        
        try {
            System.out.println("Addition Started");
            int a = 23;
            int b = 1;
            int c = a + b;
            System.out.println(c);
            System.out.println("Addition Ended");
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}

class Sub extends Thread {
    @Override
    public void run() {
        System.out.println("Subtraction Started");
        int ab = 100;
        int bc = 50;
        int c = ab - bc;
        System.out.println(c);
        System.out.println("Subtraction Ended");
    }
}

class Mul extends Thread {
    @Override
    public void run() {
        System.out.println("Multiplication Started");
        int ab = 100;
        int bc = 50;
        int c = ab * bc;
        System.out.println(c);
        System.out.println("Multiplication Ended");
    }
}

class Div extends Thread {
    @Override
    public void run() {
        System.out.println("Division Started");
        int n1 = 100;
        int n2 = 50;
        int c = n1 / n2;
        System.out.println(c);
        System.out.println("Division Ended");
    }
}

class Even extends Thread {
    @Override
    public void run() {
        System.out.println("Even Numbers Printing Started");
        for (int i = 0; i <= 6; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even Numbers Printing Ended");
    }
}

class Odd extends Thread {
    @Override
    public void run() {
        System.out.println("Odd Numbers Printing Started");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd Numbers Printing Ended");
    }
}

class Printarray extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] arr = new int[] {1,3,4,5,6,7,8};
            System.out.println("ARRAY STARTED:");
          
            for (int i = 0; i < 7; i++) {
                System.out.println("ARRAY ELEMENT AT INDEX " + i + ": " + arr[i]);
            }
            System.out.println("ARRAY ENDED");
        } finally {
            scanner.close();
        }
    }
}

public class Multithreadiong10 {
    public static void main(String[] args) {
        Thread[] threads = {
            new Numbers(), new Letters(), new Sletters(),
            new Add(), new Sub(), new Mul(), new Div(),
            new Even(), new Odd(), new Printarray()
        };
        for (Thread thread : threads) {
            thread.start();
        }
    }
		
	}


