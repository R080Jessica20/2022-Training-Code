
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotContainer;

public class driveTrain extends subsystem {
    SpeedControllerGroup leftDrive;
    SpeedControllerGroup rightDrive;
    DifferentialDrive drive;
    
    public DriveTrain(SpeedControllerGroup left, SpeedControllerGroup right, DifferentialDrive drive) {
        this.leftDrive = leftDrive;
        this.rightDrive = rightDrive;
        this.drive = drive;
    }
    

    public void run(double speed) {
        leftDrive.set(speed);
        rightDrive.set(-speed);
    }


    public void joystickInputs(Joystick joysticks)
    {
        drive.arcadeDrive(joysticks.getY(),-joysticks.getZ()*Constant.Z_ROT_DAMPENING);
    }
    public double getAverageDis()
    {
        return (RobotContainer.getEncLeft().getDistance() + RobotContainer.getEncRight().getDistance() /2);
        
    }
    public double getAverageRate(){
        return (RobotContainer.getEncLeft().getRate() + RobotConatiner.getEncRight().getRate() /2);
    }
    public void stop() {
        leftDrive.set(0);
        rightDrive.set(0);
    }
    @Override
    protected void periodic() {

    }

    }

