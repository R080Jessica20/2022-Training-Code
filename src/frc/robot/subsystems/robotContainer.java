public class robotContainer{

 private final Subsystem rc_subsystem= new Subsystem();

 private final Command autoCommand= new Command(rc_subsystem);
 SpeedController leftTop,leftBot, rightTop, rightBot;
 SpeedControllerGroup left, right;
 DifferentialDrive drive;
 DriveTrain driveTrain;



public robotContainer(){





configureButtonBindings();
    }
    public Drivetrain getDrive(){
        return driveTrain;
    }
}