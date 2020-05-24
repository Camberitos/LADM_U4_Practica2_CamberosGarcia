package mx.edu.ittepic.ladm_u4_practica2_camberosgarcia

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent
import mx.edu.ittepic.ladm_u4_practica2_camberosgarcia.R

class FiguraGeometrica () {
    var puntero = MainActivity()
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5
    var incY = 5
    var img : Bitmap ?= null

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        //dando valor a ancho y alto para tratar circulo como cuadrado

        ancho = this.radio*2
        alto = ancho
    }

    constructor(x:Int, y:Int, ancho:Int, alto:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2
    }


    constructor(bitmap:Bitmap, x:Int, y:Int) : this(){
        img = bitmap
        this.x = x.toFloat()
        this.y = y.toFloat()
        tipo = 3
        ancho = img!!.width.toFloat()
        alto = img!!.height.toFloat()
    }

    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x+radio,y+radio,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
            3->{
                c.drawBitmap(img!!,x,y,p)
            }
        }
    }

    fun caminar(equis:Float){
        x+= (equis*2)
    }
}