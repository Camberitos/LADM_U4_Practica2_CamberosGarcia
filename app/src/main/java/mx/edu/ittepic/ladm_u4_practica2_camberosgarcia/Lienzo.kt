package mx.edu.ittepic.ladm_u4_practica2_camberosgarcia

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View
import mx.edu.ittepic.ladm_u4_practica2_camberosgarcia.MainActivity
import mx.edu.ittepic.ladm_u4_practica2_camberosgarcia.R
import java.net.CookiePolicy

class Lienzo(p:MainActivity) : View(p) {
    // se requiere p para que view sepa cual activity va a trabajar
    var puntero = p
    var sol = FiguraGeometrica(820, 50, 40)
    var burbuja_1 = FiguraGeometrica(120, 130, 30)
    var burbuja_2 = FiguraGeometrica(20, 180, 20)
    var burbuja_3 = FiguraGeometrica(820, 230, 10)
    var burbuja_4 = FiguraGeometrica(420, 280, 30)
    var burbuja_5 = FiguraGeometrica(520, 580, 10)
    var burbuja_6 = FiguraGeometrica(620, 160, 5)
    var burbuja_7 = FiguraGeometrica(400, 200, 10)
    var burbuja_8 = FiguraGeometrica(100, 780, 5)
    var burbuja_9 = FiguraGeometrica(70, 1080, 5)
    var burbuja_10 = FiguraGeometrica(680, 380, 10)
    var burbuja_11 = FiguraGeometrica(120, 1280, 30)
    var burbuja_12 = FiguraGeometrica(900, 1180, 40)
    var burbuja_13 = FiguraGeometrica(820, 1380, 20)
    var burbuja_14 = FiguraGeometrica(460, 180, 30)
    var burbuja_15 = FiguraGeometrica(520, 580, 10)
    var burbuja_16 = FiguraGeometrica(620, 160, 30)
    var burbuja_17 = FiguraGeometrica(400, 200, 10)
    var burbuja_18 = FiguraGeometrica(200, 860, 50)
    var burbuja_19 = FiguraGeometrica(700, 1080, 50)
    var burbuja_20 = FiguraGeometrica(680, 1280, 10)
    var cielo = FiguraGeometrica(0, 0, 1100, 750)
    var icono = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.pinguino_),200,1500)
    var p1 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.pinguino_1),200,800)
    var p2 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.pinguino_2),600,900)


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.WHITE)

        //Dibujando cielo
        paint.color = Color.CYAN
        cielo.pintar(canvas, paint)

        //Dibujando sol
        paint.color = Color.YELLOW
        sol.pintar(canvas, paint)

        p1.pintar(canvas,paint)
        p2.pintar(canvas,paint)

        icono.pintar(canvas,paint)

        //COLOREAR SEGÚN APROXIMIDAD
        if(puntero.proximidad == 0f){
            canvas.drawColor(Color.BLUE)
            //Dibujando burbujas
            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_1.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_2.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_3.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_4.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_5.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_6.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_7.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_8.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_9.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_10.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_11.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_12.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_13.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_14.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_15.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_16.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_17.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_18.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_19.pintar(canvas, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.WHITE
            burbuja_20.pintar(canvas, paint)

            icono.pintar(canvas,paint)
        }
    }

    fun caminar() {
        icono.caminar((puntero.x)*-1) //al multilpicar por -1 cambiamos el valor de X
        //icono.rebote(width,height)
        invalidate()
    }

}