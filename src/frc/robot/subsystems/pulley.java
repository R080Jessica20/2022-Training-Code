  
package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class pulley extends subsystem{
    SpeedController pulley;

    public isTransport(SpeedController transport){
        this.pulley=pulley;
    }
    public void moveTransport(double speed){
        pulley.set(speed);
        transport transporting = new transport();
        transport.moveTransport();
        shooter shooting = new shooter();
        shooter.moveShooter();

    }

    @Override
    public void stop(){
        pulley.stopMotor();
    }
}
