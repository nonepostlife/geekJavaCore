package ru.postlife.java2.homework1;

public class Team {
    private String teamName;
    private Character[] characters;

    public Team(String teamName, String firstPlayerName, String secondPlayerName, String thirdPlayerName, String fourthPlayerName) {
        this.teamName = teamName;
        characters = new Character[4];
        characters[0] = new Human(firstPlayerName);
        characters[1] = new Human(secondPlayerName);
        characters[2] = new Human(thirdPlayerName);
        characters[3] = new Human(fourthPlayerName);
    }

    public Character[] getCharacters() {
        return characters;
    }

    public void info(){
        System.out.println("Участники команды " + teamName + ":");
        for (Character c : characters) {
            System.out.println(((Human)c).getName());
        }
    }
    public void showResult(){
        for (Character c : characters) {
            System.out.printf("%s - прошел дистанцию %b \n",((Human)c).getName(), ((Human)c).isOvercome());
        }
    }
}
