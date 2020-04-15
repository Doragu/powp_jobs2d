package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private int x;
    private int y;

    public OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void execute(Job2dDriver driver) {
        driver.operateTo(x, y);
    }
}
