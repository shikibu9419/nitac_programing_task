package ui;

import java.util.*;
import models.Unit;
import control.UnitAction;

// 入力受け付け
public class InputReceiver extends UI {

    private static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public boolean receive(Unit unit) {
        UnitAction action = new UnitAction(unit);
        String[] order = scan.next().split(" |　");

        // 入力命令の解釈
        switch(order[0]) {
            // r/l/u/d
            case "r":
            case "l":
            case "u":
            case "d":
                return action.move(order[0]);
            // bomb (x) (y)
            case "bomb":
                int y = Integer.parseInt(order[2]) - 1;
                int x = Integer.parseInt(order[1]) - 1;
                return action.detonate(y, x);
            // exit
            case "exit":
                exitGame();
            default:
                return false;
        }
    }
}
