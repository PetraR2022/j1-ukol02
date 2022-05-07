package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setPenColor(Color.black);

        zofka.setLocation(150,150);
        zofka.turnLeft(90);

        // zmrzlina
        nakresliRovnostrannyTrojuhelnik(zofka, 100.0);
        zofka.turnLeft(70);
        nakresliKolecko(zofka, 18.0);

        // sněhulák
        zofka.penUp();
        zofka.setLocation(400,50);
        zofka.penDown();
        nakresliKolecko(zofka, 10.0);

        zofka.penUp();
        zofka.setLocation(420,130);
        zofka.penDown();
        nakresliKolecko(zofka, 20.0);

        zofka.penUp();
        zofka.setLocation(440,260);
        zofka.penDown();
        nakresliKolecko(zofka, 30.0);

        zofka.penUp();
        zofka.setLocation(310,110);
        zofka.penDown();
        nakresliKolecko(zofka, 10.0);
        zofka.penUp();

        zofka.penUp();
        zofka.setLocation(470,110);
        zofka.penDown();
        nakresliKolecko(zofka, 10.0);
        zofka.penUp();

        //mašinka
        zofka.setLocation(800,350);
        zofka.penDown();
        nakresliObdelnik(zofka, 200,100);

        zofka.turnRight(180);
        zofka.setLocation(900,350);

        nakresliObdelnik(zofka, 100,200);

        zofka.turnRight(200);
        nakresliKolecko(zofka, 18.0);

        zofka.penUp();
        zofka.setLocation(670,370);
        zofka.penDown();
        nakresliKolecko(zofka, 8.0);

        zofka.penUp();
        zofka.setLocation(750,370);
        zofka.penDown();
        nakresliKolecko(zofka, 8.0);

        zofka.penUp();
        zofka.turnRight(45);
        zofka.setLocation(600,300);
        zofka.penDown();
        nakresliRovnostrannyTrojuhelnik(zofka, 90);













    }
// upravený úhel na 360/17
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

    }

    private void nakresliCtverecek(Turtle turtle, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(90);
        }
    }


}


