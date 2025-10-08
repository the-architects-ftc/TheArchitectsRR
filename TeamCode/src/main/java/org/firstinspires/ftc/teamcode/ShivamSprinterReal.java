package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "ShivamSprinterReal")
public class ShivamSprinterReal extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(-12.26, -36.63, Math.PI / 2));

        waitForStart();

        if (opModeIsActive()) {
            Actions.runBlocking(
                    drive.actionBuilder(new Pose2d(-12.26, -36.63, Math.PI / 2))
                            .splineTo(new Vector2d(11.60, -25.95), Math.toRadians(90.00))
                            .splineTo(new Vector2d(13.27, -10.26), Math.toRadians(90.00))
                            .build()
            );

            sleep(10000000);
        }
    }
}