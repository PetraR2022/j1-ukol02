package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setPenColor(Color.black);


        nakresliCtverecek(zofka, 100.0);

        zofka.setLocation(200,200);

        nakresliObdelnik(zofka, 200.0, 100.0 );

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(600);
        zofka.penDown();
        zofka.turnLeft(90);


        nakresliRovnostrannyTrojuhelnik(zofka, 100.0);

        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        nakresliKolecko(zofka, 5.0);

        zofka.setLocation(100,100);
        nakresliKolecko(zofka, 20.0);



    }

    private void nakresliKolecko(Turtle turtle, double velikostStrany) {
        for (int i = 0; i < 17 ; i++) {
            turtle.move(velikostStrany);
            turtle.turnRight(360/17);

        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle turtle, double velikostStrany) {
        for (int i = 0; i < 3; i++) {
            turtle.move(velikostStrany);
            turtle.turnLeft(120.0);
        }
    }

    private void nakresliObdelnik(Turtle turtle, double delkaStrany, double sirkaStrany) {
        turtle.turnRight(90);
        turtle.move(delkaStrany);
        turtle.turnRight(90);
        turtle.move(sirkaStrany);
        turtle.turnRight(90);
        turtle.move(delkaStrany);
        turtle.turnRight(90);
        turtle.move(sirkaStrany);
        turtle.turnRight(180);
        turtle.penUp();
        turtle.move(100);
        turtle.turnRight(180);
    }

    private void nakresliCtverecek(Turtle turtle, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(90);
        }
    }


}


