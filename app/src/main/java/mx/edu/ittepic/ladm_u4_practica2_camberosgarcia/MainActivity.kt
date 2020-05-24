package mx.edu.ittepic.ladm_u4_practica2_camberosgarcia

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SensorEventListener {

    var lienzo  : Lienzo ?= null
    lateinit var sensorManager : SensorManager //declaración perezosa, lo que significa que no se asigna ni memoria ni en null
    var oyenteProximidad : OyenteProximidad ?= null
    var proximidad = 0f
    var x = 0f
    var y = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager //convertimos el objeto genérico en objeto sensormanager
        sensorManager.registerListener(this,
            sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_NORMAL)

        oyenteProximidad = OyenteProximidad(this)
        sensorManager?.registerListener(oyenteProximidad, sensorManager?.getDefaultSensor(Sensor.TYPE_PROXIMITY),
            SensorManager.SENSOR_DELAY_UI)

        lienzo = Lienzo(this)
        setContentView(lienzo!!)
        HiloAnimacion(this).start()
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        x = event!!.values[0]
        y = event!!.values[1]
    }

}
