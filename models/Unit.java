package models;

import control.*;

// 動かす駒
public class Unit extends Cell {

    public boolean isDead = false;
    public String type;

    public Unit(int y, int x, char character, String type) {
        setCoordinate(y, x);
        this.character = character;
        this.type = type;
    }

    // ユニットが死んだとき (暫定実装)
    public void death() {
        decrementBombs();
        Field.fieldmap[y][x] = new Flatland(this.surroundingBombs);
        this.isDead = true;
        if(type.equals("ally"))
            Information.allies_count--;
        else
            Information.enemies_count--;
    }
}
