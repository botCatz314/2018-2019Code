package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "TeleOp Test", group = "Default")
public class TeleOpTest extends LinearOpMode {

    private DcMotor left, right;
@Override
    public void runOpMode()
{

    left = hardwareMap.dcMotor.get("left");
    right = hardwareMap.dcMotor.get("right");

    waitForStart();
    while (opModeIsActive())
    {
        left.setPower(-gamepad1.left_stick_y);
        right.setPower(-gamepad1.right_stick_y);

        idle();
    }
}








}
