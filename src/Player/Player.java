package Player;


import java.util.Scanner;

public class Player {
    private String name;
    private int lvl = 1;
    private int skillPoints = 5; //Skill Points
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
        System.out.println("====================================");
        System.out.println("               " + getName().toUpperCase());
        System.out.println("Poziom " + getLvl());
        System.out.println("Dostępnę punkty: " + getSkillPoints());
        System.out.println("------------------------------------");
        System.out.println("Endurance: " + getEndr());
        System.out.println("Intelligence: " + getIntl());
        System.out.println("Strength: " + getStr());
        System.out.println("Dexterity: " + getDex());
        System.out.println("Agility: " +getAgl());
        System.out.println("====================================");
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public void lvlUp() {
        lvl++;
        skillPoints++;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public int getEndr() {
        return endr;
    }

    public void endrUp() {
        if(skillPoints != 0) {
            skillPoints--;
            endr++;
        }
    }

    public int getStr() {
        return str;
    }

    public void strUp() {
        if(skillPoints != 0) {
            skillPoints--;
            str++;
        }
    }

    public int getIntl() {
        return intl;
    }

    public void intlUp() {
        if(skillPoints != 0) {
            skillPoints--;
            intl++;
        }
    }

    public int getDex() {
        return dex;
    }

    public void dexUp() {
        if(skillPoints != 0) {
            skillPoints--;
            dex++;
        }
    }

    public int getAgl() {
        return agl;
    }

    public void aglUp() {
        if(skillPoints != 0) {
            skillPoints--;
            agl++;
        }
    }
}
