import java.util.Random;

import enums.*;
import objects.*;

public class Main {
    public static void main(String[] args) {
            NoiseLevel noise = NoiseLevel.getInstance();
            noise.reset();

            Malish malish = new Malish("Малыш", Mood.TIRED, true);

            Random random = new Random();
            Mood[] moods = {Mood.HAPPY, Mood.SAD, Mood.ANGRY};
            Mood initialMood = moods[random.nextInt(moods.length)];
            FrekenBok frekenBok = new FrekenBok("Фрекен Бок", initialMood);

            Karlson karlson = new Karlson("Карлсон", Mood.HAPPY);
            UncleJulius julius = new UncleJulius("Дядя Юлиус", Mood.NORMAL);

            System.out.println("Малыш тоже долго спал в тот день" );

            if (frekenBok.getMood() == Mood.HAPPY) {
                System.out.println("Фрекен Бок сегодня в отличном настроении!");
                frekenBok.sing(); 
            } else {
                System.out.println("Фрекен Бок сегодня в плохом настроении. Она не поёт.");
            }

            
            karlson.flyIn();
     
           
            frekenBok.stopSinging();

            frekenBok.cook("эскалопы"); 

            Table table = new Table();
            if (malish.isAwake()) {
                table.addGuest(malish);
            } else {
                System.out.println("Малыш всё ещё спит.");
            }
            table.addGuest(karlson);
            table.addGuest(frekenBok);
            table.addGuest(julius);
            table.startDinner();
            karlson.speak();
    }
}