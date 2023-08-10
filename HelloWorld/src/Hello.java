public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Anibal");

        boolean isAlien = false;
        if(isAlien == false)  {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("you got the high score");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90 || (secondTopScore <= 90))) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("this is an error");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen");
        }

        //ternary operator ex
        String makeOfCar = "Volkswagon";
        boolean isDomestic = makeOfCar =="Volkswagon"? false : true;

        if(isDomestic) {
            System.out.println("this car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double fistDouble = 20.00;
        double secondDouble = 80.00;
        double doubleTotal = (fistDouble + secondDouble) * 100.00;
        double remainderTotal = doubleTotal % 40.00;
        boolean remainderBool = (remainderTotal == 0.00) ? true : false;

        System.out.print(remainderBool);

        if(!remainderBool) {
            System.out.println("Got some remainder");
        }
    }

}
