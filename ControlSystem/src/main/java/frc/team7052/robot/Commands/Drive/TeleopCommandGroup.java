package frc.team7052.robot.Commands.Drive;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.team7052.robot.Commands.LiftElevator;
import frc.team7052.robot.Systems.OI;

public class TeleopCommandGroup extends CommandGroup {
    private OI oi;
    public TeleopCommandGroup(OI oi) {
        this.oi = oi;
        addParallel(new DriveRobot(oi));
        addParallel(new LiftElevator(oi));
    }
}
