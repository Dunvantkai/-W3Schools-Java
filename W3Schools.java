public class W3Schools {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        System.out.println("I am learning to code in java");
        System.out.println("It is awesome");
        System.out.print("Print on same line! "); //print vs println The only difference is that it does not insert a new line at the end of the output:
        System.out.println("I will be on the same line");
        System.out.println(6);
        System.out.println(4);
        System.out.println(17);
        System.out.println(3 + 3);
        System.out.println(3 * 3);
        /*over next line
         * still here
         * see
         */
        //type variableName = value;
        String name = "John";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);
        int myNum2;
        myNum2 = 13;
        System.out.println(myNum2);
        myNum2 = 20;
        System.out.println(myNum2);
        final int myNum3 = 15; //locks myNum3
        System.out.println(myNum3); 
        //myNum3 = 20; will not change due to myNum3 has been finalised
        //int myNum4 = 5;
        //float myFloatNum = 5.99f;
        //char myLetter = 'D';
        //boolean myBool = true;
        //String myText = "Hello";
        System.out.println("Hello " + name);
        String givenName = "Kai";
        String surName = "Hardman";
        String fullName = givenName + " " + surName;
        System.out.println(fullName);
        System.out.println(givenName.concat(surName));
        int x = 6;
        int y = 9;
        int z = 60;
        System.out.println(x + y);
        System.out.println(x + y + z);
        x = y = z = 50;
        System.out.println(x + y + z);
        System.out.println();
        byte myNum5 = 100; //The byte data type can store whole numbers from -128 to 127
        System.out.println(myNum5);
        short myNum6 = 5000; //The int data type can store whole numbers from -2147483648 to 2147483647
        System.out.println(myNum6);
        long myNum7 = 15000000000L; //The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807
        System.out.println(myNum7);
        float myNum8 = 5.75f; //float is only six or seven decimal
        double myNum9 = 19.99f; //double variables have a precision of about 15 digits
        System.out.println(myNum8 + "  " + myNum9);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        char myGrade = 'B'; //The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
        System.out.println(myGrade);
        System.out.println();
        char myVar1 = 65, myVar2 = 66, myVar3 = 67, myVar4 = 68;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(myVar4);
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum1;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(x >= y); // is X grater or equale to Y
        //&&    x < 5 &&  x < 10    Returns true if both statements are true
        //||    x < 5 || x < 4      Returns true if one of the statements is true
        //!     !(x < 5 && x < 10)  Reverse the result, returns false if the result is true
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt);
        System.out.println("The number of letters in the string is: "+ txt.length());
        txt = ("Hello World");
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        txt = ("find meine mann");
        System.out.println(txt.indexOf("mann"));
        int inx = 10;
        int iny = 20;
        int inz = inx + iny;
        
        String stx = "10";
        String sty = "20";
        String stz = stx + sty;
        System.out.println(inz);
        System.out.println(stz);
        //Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
        //\'	'	Single quote
        //\"	"	Double quote
        //\\	\	Backslash
        //\n	New Line
        //\r	Carriage Return
        //\t	Tab
        //\b	Backspace
        //\f	Form Feed
        System.out.println("Hello\tTab");
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);
        x = 10;
        y = 9;
        System.out.println(x > y);
        System.out.println(y > x);
        int myAge = 17;
        int vottingAge = 18;
        if (myAge >= vottingAge){
            System.out.println("You can vote");
        } else if (myAge == 17) {
            System.out.println("Only one more year till you can vote");
        } else {
            System.out.println("You can not vote");
        }
        if (myAge == vottingAge) {
            System.out.println("my age is equal to votting age");
        } else if (myAge < vottingAge){
            System.out.println("my age is less than voting");
        } else if (myAge > vottingAge){
            System.out.println(" my age is greater then the voting age");
        }
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening."; //short form
        System.out.println(result);

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not in list");
        }
        int i = 0;
        while (i <= 6) {
            System.out.println(i);
            i = i + 1;
        }

        i = 0;
        System.out.println(i);
        do {
            System.out.println(i);
            i = i + 1;
        }
        while (i <= 5);   
        
        for (int l = 1; l <= 3; l = l + 1) {
            System.out.println("Outer: " + l);
            for (int j = 1; j <= 3; j = j + 1) {
                System.out.println(" Inner: " + j);
            }
        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String carinfo : cars) {
            System.out.println("Das ist cool car: " + carinfo);
        }
        for (i = 0; i < 10; i = i + 1) {
            System.out.println("test if outing");//same
            if (i == 4) {
                break;
            }
            System.out.println(i); //same
        }
        for (i = 0; i < 10; i = i + 1) {
            if (i == 4) {
                System.out.println("prints the 4");
                continue;
            }
            System.out.println(i);
        }
    }
}
