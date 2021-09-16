package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
public class intake extends subsystem {
    SpeedController intake;

public isIntake(SpeedController intake){
    this.intake=intake;
}
public void moveIntake(double speed){
    intake.set(speed);
}

public void stop(){
    intake.stopMotor();
}
}
