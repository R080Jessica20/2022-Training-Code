

public class shooter extends subsystem {
    SpeedController topShooter; 
    SpeedController botShooter;
public shooter(SpeedController topShooter, SpeedController botShooter){
    this.topShooter=topShooter;
    this.botShooter=botShooter;
}
public void moveShooter(double speed){
    topShooter.set(speed);
    botShooter.set(-speed);


}
public SpeedController topShooter(){
    return topShooter;
}
public SpeedController botShooter(){
    return botShooter;
}
@Override
public void stop(){
    topShooter.set(0);
    botShooter.set(0);
}
}
