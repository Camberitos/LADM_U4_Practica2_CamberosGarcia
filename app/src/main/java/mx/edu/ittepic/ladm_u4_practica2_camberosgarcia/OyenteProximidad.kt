package mx.edu.ittepic.ladm_u4_practica2_camberosgarcia

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener

class OyenteProximidad(p:MainActivity): SensorEventListener {
    var puntero = p
    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }
    override fun onSensorChanged(p0: SensorEvent?) {
        puntero.proximidad = p0!!.values[0]
    }
}