package com.santiagocon.Actividad07.Realizacion;

public interface Motor {
    void encederMotor();
}
interface MotorDiesel extends Motor{
    void llenarTanque();
}
