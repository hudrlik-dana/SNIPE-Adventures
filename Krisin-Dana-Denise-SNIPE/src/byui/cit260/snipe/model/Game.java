/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class Game implements Serializable{
    
    //class instance variables
    private Player player;
    private Map map;
    private boolean gameComplete;
    private boolean totalPlayerHealth;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public boolean isGameComplete() {
        return gameComplete;
    }

    public void setGameComplete(boolean gameComplete) {
        this.gameComplete = gameComplete;
    }

    public boolean isTotalPlayerHealth() {
        return totalPlayerHealth;
    }

    public void setTotalPlayerHealth(boolean totalPlayerHealth) {
        this.totalPlayerHealth = totalPlayerHealth;
    }

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.player);
        hash = 53 * hash + Objects.hashCode(this.map);
        hash = 53 * hash + (this.gameComplete ? 1 : 0);
        hash = 53 * hash + (this.totalPlayerHealth ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.gameComplete != other.gameComplete) {
            return false;
        }
        if (this.totalPlayerHealth != other.totalPlayerHealth) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", map=" + map + ", gameComplete=" + gameComplete + ", totalPlayerHealth=" + totalPlayerHealth + '}';
    }
    
    
    
    

}
