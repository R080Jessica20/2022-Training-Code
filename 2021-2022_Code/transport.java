  
package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class transport extends subsystem{
    SpeedController transport;

    public isTransport(SpeedController transport){
        this.transport=transport;
    }
    public void moveTransport(double speed){
        transport.set(speed);
    }
    
    public void stop(){
        transport.stopMotor();
    }
}
