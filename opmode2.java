package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by brayden on 11/22/17.
 */

public class opmode2 {


    @TeleOp(name="Tele op 2017-18 2 person", group="NHRHS Robotics")

    public class opMode extends LinearOpMode {

        Hardware robot = new Hardware();         // Uses Robot's Hardware

        @Override
        public void runOpMode() throws InterruptedException {


            // Init Hardware Map
            robot.init(hardwareMap);

            // Initialize Robot
            telemetry.addData("Status: ", "Its Alive!");
            telemetry.update();





//Robot is waiting to start
            waitForStart();

            while (opModeIsActive()) {
//Show imput

                //buttons gp1
                telemetry.addData("a: ",gamepad1.a);
                telemetry.addData("b: ",gamepad1.b);
                telemetry.addData("y: ",gamepad1.y);
                telemetry.addData("x: ",gamepad1.x);

                //right stick
                telemetry.addData("right stick Y: ",(gamepad1.right_stick_y));
                telemetry.addData("right stick X: ",(gamepad1.right_stick_x));

                //left stick
                telemetry.addData("left stick Y: ",(gamepad1.left_stick_y));
                telemetry.addData("left stick X: ",(gamepad1.left_stick_x));

                //d pad
                telemetry.addData("d pad up:",gamepad1.dpad_up);
                telemetry.addData("d pad down:",gamepad1.dpad_down);
                telemetry.addData("d pad left:",gamepad1.dpad_left);
                telemetry.addData("d pad right:",gamepad1.dpad_right);

                //trigger
                telemetry.addData("right trigger:",gamepad1.right_trigger);
                telemetry.addData("left trigger:",gamepad1.left_trigger);

                //bumper
                telemetry.addData("right bumper:",gamepad1.right_bumper);
                telemetry.addData("left bumper:",gamepad1.left_bumper);

                //buttons gp2
                telemetry.addData("a: ",gamepad2.a);
                telemetry.addData("b: ",gamepad2.b);
                telemetry.addData("y: ",gamepad2.y);
                telemetry.addData("x: ",gamepad2.x);

                //right stick
                telemetry.addData("right stick Y: ",(gamepad2.right_stick_y));
                telemetry.addData("right stick X: ",(gamepad2.right_stick_x));

                //left stick
                telemetry.addData("left stick Y: ",(gamepad2.left_stick_y));
                telemetry.addData("left stick X: ",(gamepad2.left_stick_x));

                //d pad
                telemetry.addData("d pad up:",gamepad2.dpad_up);
                telemetry.addData("d pad down:",gamepad2.dpad_down);
                telemetry.addData("d pad left:",gamepad2.dpad_left);
                telemetry.addData("d pad right:",gamepad2.dpad_right);

                //trigger
                telemetry.addData("right trigger:",gamepad2.right_trigger);
                telemetry.addData("left trigger:",gamepad2.left_trigger);

                //bumper
                telemetry.addData("right bumper:",gamepad2.right_bumper);
                telemetry.addData("left bumper:",gamepad2.left_bumper);


                //update
                telemetry.update();

//Start code for moving

                // Drive train
                robot.motorBackRight.setPower(-gamepad2.right_stick_y/2);
                robot.motorFrontRight.setPower(-gamepad2.right_stick_y/2);
                robot.motorBackLeft.setPower(gamepad2.left_stick_y/2);
                robot.motorFrontLeft.setPower(gamepad2.left_stick_y/2);

                //v drawer slide
                if (gamepad1.dpad_down)
                {
                    robot.drawer.setPower(-.25);
                }

                else if (gamepad1.dpad_up)
                {
                    robot.drawer.setPower(1);
                }

                else
                {
                    robot.drawer.setPower(0);
                }
                //clamps
                //CHECK SIGNS

                    robot.clampR.setPower(gamepad1.left_stick_x/4);
                    robot.clampL.setPower(gamepad1.left_stick_x/4);

                }


            }
        }
    }