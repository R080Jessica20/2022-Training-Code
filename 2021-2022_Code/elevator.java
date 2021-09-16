
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;

import java.lang.invoke.ClassSpecializer.SpeciesData;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotContainer;


public class elevator extends subsystem{
    //up
    SpeedController elevatorLeft;
    //down
    SpeedController elevatorRight;
   DigitalInput limitSwitch;
   Encoder limit;
   Encoder Up;

   public isElevator(SpeedController elevatorLeft, SpeedController elevatorRight, DigitalInput limitSwitch, Encoder limit,Encoder Up )
   {
this.elevatorLeft=elevatorLeft;
this.elevatorRight=elevatorRight;
this.limitSwitch=limitSwitch;
this.limit=limit;
//don't know what to do with other encoder. Instruction unclear
this.up=up;
int result;
}
public isElevatorUp(){
if(encoder.getDirection()>0 && encoder.getDirection()<1 ){
elevatorLeft.set(speed);
if(limit.get()){
    elevatorLeft.set(0);
}
}
}
public isElevatorDown(){
    if(encoder.getDirection()<0 && encoder.getDirection()<1 ){
    elevatorRight.set(-speed);
    }
    if(limitSwitch.get()){
elevatorRight.set(0);
    }
}

}


