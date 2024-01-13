// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.generated;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveData extends SubsystemBase {
  /** Creates a new SwerveData. */
  private TalonFX fl = new TalonFX(1);
  private TalonFX fr = new TalonFX(2);
  private TalonFX bl = new TalonFX(3);
  private TalonFX br = new TalonFX(4);

  public SwerveData() {}

  @Override
  public void periodic() {
    SmartDashboard.putNumber("fl velocity", fl.getVelocity().getValueAsDouble());
    SmartDashboard.putNumber("fr velocity", fr.getVelocity().getValueAsDouble());
    SmartDashboard.putNumber("bl velocity", bl.getVelocity().getValueAsDouble());
    SmartDashboard.putNumber("br velocity", br.getVelocity().getValueAsDouble());
    // This method will be called once per scheduler run
  }
}
