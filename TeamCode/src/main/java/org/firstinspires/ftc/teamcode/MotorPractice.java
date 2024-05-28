package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.concurrent.TimeUnit;


public class MotorPractice {
    public void runOpMode() throws InterruptedException {
        DcMotor motor = hardwareMap.dcMotor.get("motor1");
        waitForStart();
        if (isStopRequested()) return;
        while (opModeIsActive()) {
            if (gamepad1.a) {
                motor.setPower(1);
                TimeUnit.MILLISECONDS.sleep(350);
            } else if (gamepad1.b) {
                motor.setPower(0);
                TimeUnit.MILLISECONDS.sleep(350);
            }
        }
    }
}
