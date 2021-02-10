package Player;


import java.util.Scanner;

public class Player {
    private String name;
    private int lvl = 1;
    private int characterPoints = 5; //Skill Points
    private int endr = 1; //Endurance - HP
    private int intl = 1; //Intelligence - MP
    private int str = 1; //Strength
    private int dex = 1; //Dexterity
    private int agl = 1; //Agility

    Scanner scanner = new Scanner(System.in);

    public Player() {
        char confirm;
        String name;
        do {
            System.out.print("Podaj nazwę gracza: ");
            name = scanner.nextLine();
            System.out.println("A więc " + name + "?");
            System.out.println("[Q] TAK  |  [E] NIE");
            confirm = scanner.nextLine().toLowerCase().charAt(0);
        } while (confirm != 'q');
        if (name.isEmpty()){
            throw new IllegalArgumentException("Nie podano Imienia");
        }
        this.name = name;
    }

    public void profile() {
        boolean viewProfile = true;
        do {
        System.out.println("====================================");
        System.out.println("               " + getName().toUpperCase());
        System.out.println("Poziom " + getLvl());
        System.out.println("Dostępnę punkty: " + getcharacterPoints());
        System.out.println("------------------------------------");
        System.out.println("Endurance: " + getEndr());
        System.out.println("Strength: " + getStr());
        System.out.println("Intelligence: " + getIntl());
        System.out.println("Dexterity: " + getDex());
        System.out.println("Agility: " +getAgl());
        System.out.println("------------------------------------");
        System.out.println("Ulepsz:");
        System.out.println("[1] Endurance [2] Strength [3] Intelligence");
        System.out.println("[4] Dexterity [5] Agility  [Q] Powrót");
        char controller =  scanner.nextLine().toLowerCase().charAt(0);
        if (controller == 'q') {
            viewProfile = false;
        }
        switch (controller) {
            case '1' -> endrUp();
            case '2' -> strUp();
            case '3' -> intlUp();
            case '4' -> dexUp();
            case '5' -> aglUp();
        }
        } while (viewProfile);
    }

    public void assignPoints(){
        System.out.println("Przypisz Punkty");
        System.out.println("------------------------------------");
        do {
            System.out.println("Dostępne punkty: " + getcharacterPoints());
            System.out.println("[1] Endurance - " +  getEndr());
            System.out.println("[2] Strength - " + getStr());
            System.out.println("[3] Intelligence - " + getIntl());
            System.out.println("[4] Dexterity - " + getDex());
            System.out.println("[5] Agility - " +getAgl());
            System.out.println("[Q] Wyjście");

            System.out.print("Zwiększ: ");

        } while (characterPoints > 0);
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public void lvlUp() {
        lvl++;
        characterPoints++;
    }

    public int getcharacterPoints() {
        return characterPoints;
    }

    public void setcharacterPoints(int characterPoints) {
        this.characterPoints = characterPoints;
    }

    public int getEndr() {
        return endr;
    }

    public void endrUp() {
        if(characterPoints > 0) {
            characterPoints--;
            endr++;
        }
    }

    public int getStr() {
        return str;
    }

    public void strUp() {
        if(characterPoints > 0) {
            characterPoints--;
            str++;
        }
    }

    public int getIntl() {
        return intl;
    }

    public void intlUp() {
        if(characterPoints > 0) {
            characterPoints--;
            intl++;
        }
    }

    public int getDex() {
        return dex;
    }

    public void dexUp() {
        if(characterPoints > 0) {
            characterPoints--;
            dex++;
        }
    }

    public int getAgl() {
        return agl;
    }

    public void aglUp() {
        if(characterPoints > 0) {
            characterPoints--;
            agl++;
        }
    }
}
