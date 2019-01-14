package algorithm;

import java.lang.Math;
import models.*;
import control.*;

public class Opponent extends Algorithm {

    public Opponent() {
        super();
    }

    public void start() {
        for(Unit enemy:Information.enemies) {
            if(enemy.dead)
                continue;
            if(moveToClosestAlly(enemy))
                System.out.println("");
        }
    }

    // 敵ユニットの動き(暫定実装)
    private boolean moveToClosestAlly(Unit enemy) {
        int disy = Information.MAX_Y;
        int disx = Information.MAX_X;
        Unit closest;
        UnitAction action = new UnitAction(enemy);

        // 一番近いユニットとその距離を計算
        for(Unit ally:Information.allies) {
            if(ally.dead)
                continue;

            int disy2 = ally.y - enemy.y;
            int disx2 = ally.x - enemy.x;
            if(Math.abs(disy2) + Math.abs(disx2) < Math.abs(disy) + Math.abs(disx)) {
                closest = ally;
                disy = disy2;
                disx = disx2;
            }
        }

        // closestに向かって移動
        String direction;
        if(disy > disx) {
            if(disx > 0)
                direction = "r";
            else
                direction = "l";
        } else {
            if(disy > 0)
                direction = "d";
            else
                direction = "u";
        }

        return action.move(direction);
    }
}
