// Write your code here.
package com.example.player;
public class Player{
    private int id;
    private String playerName;
    private int jerseyNumber;
    private String role;
    public Player(int id,String playerName,int jerseyNumber,String role){
        this.id=id;
        this.playerName=playerName;
        this.jerseyNumber=jerseyNumber;
        this.role=role;
    }
       public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String playerName) {
        this.playerName = playerName;
    }
       public int getNumber() {
        return jerseyNumber;
    }

    public void setNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public String getrole() {
        return role;
    }

    public void setrole(String role) {
        this.role = role;
    }
    
}