package mx.edu.ittepic.ladm_u4_practica2_camberosgarcia

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(10)
            puntero.runOnUiThread {
                puntero.lienzo!!.caminar()
            }
        }
    }
}