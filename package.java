File 1 package cie;

import java.util.Scanner;

public class student { // rename the file as student.java make it public and execute
    String sname = new String();
    String usn = new String();
    int sem;

    public student() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name: ");
        sname = s.next();
        System.out.println("Enter your usn: ");
        usn = s.next();
        System.out.println("Enter your sem: ");
        sem = s.nextInt();
    }

}

package cie;
import java.util.Scanner;
import cie.student;

public class internal extends student { // when this is public, save the file as internal.java and save it

    protected float marks[] = new float[5];

    public internal() {
        Scanner ss = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Subject " + (i + 1) + " Internal marks");
            marks[i] = ss.nextInt();

        }
    }
}

package see;

import java.util.Scanner;
import cie.internal;
import cie.student;

public class external extends internal {
    float marks2[] = new float[5];

    public external() {
Scanner ss=new Scanner(System.in); for(int i=0;i<5;i++) {
System.out.println("Enter Subject " + (i+1) + " External
marks" );
marks2[i]=ss.nextFloat();
 
}
}

    public void calc() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Sum of Internal and External marks for Subject " + i + " is " + (marks[i] + marks2[i]));
        }
    }
}

import java.util.Scanner;
import cie.internal;
import cie.student;
import see.external;

class pmain {
    public static void main(String xx[]) {
        Scanner s = new Scanner(System.in);

        external b1 = new external();
        b1.calc();
    }
}
