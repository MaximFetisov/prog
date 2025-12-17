package objects;

import java.util.ArrayList;
import java.util.List;

import enums.*;
import interfaces.*;

public class Table {
    private List<Person> guests = new ArrayList<>();

    public void addGuest(Person person) {
        guests.add(person);
        System.out.println(person.getName() + " садится за стол.");
    }

    public void startDinner() {
        System.out.println("Все сидят вместе и обсуждают события этой ночи.");

        boolean malishAwake = false;
        for (Person p : guests) {
            if (p instanceof Malish && ((Malish) p).isAwake()) {
                malishAwake = true;
                break;
            }
        }

        if (!malishAwake) {
            System.out.println("Малыш всё ещё спит. Все чувствуют себя грустно.");
            for (Person p : guests) {
                p.setMood(Mood.SAD);
            }
        }

        for (Person p : guests) {
            p.speak();
            p.eat();
        }
    }
}