package com.example.unidad_2

fun main()
{
    //val corredor = Runner("400m con obstaculos", 200f)
    //corredor.estilo = "400m con obstaculos"
    //corredor.velocidad = 200f
    //corredor.competir()

    val triatonn = Triaton(100f, "100 millas","brazabraza","aogado")
    println("Triaton: ")
    triatonn.competir()
}

class Triaton(velocidad : Float, estilo_runer : String, Tipo_ciclista : String, Estilo_nadador : String) : Deportista(velocidad)
{
    private val corre = Runner(estilo_runer, velocidad)
    private val vici = Ciclista(Tipo_ciclista, velocidad)
    private val nada = Nadador(Estilo_nadador, velocidad)

    override fun competir()
    {
        corre.competir()
        vici.competir()
        nada.competir()
    }
}

open class Deportista(private val velocidad: Float)
{
    open fun competir()
    {
        println("voy a competir!!!. \n con una velocidad de $velocidad")
    }
}

class Runner (private var estilo: String, private var velocidad: Float) : Deportista(velocidad)
{
    override fun competir()
    {
        println("voy a correr!!!. con una Velocidad: $velocidad con un estilo: $estilo")
    }
}

class Ciclista(private var tipo_de_vici: String, private var velocidad: Float) : Deportista(velocidad)
{
    override fun competir()
    {
        println("voy a pedalear!!!. con una Velocidad: $velocidad con una vici: $tipo_de_vici")
    }
}

class Nadador(private var estilo: String, private var velocidad: Float) : Deportista(velocidad)
{
    override fun competir()
    {
        println("voy a nadar!!!. con una Velocidad: $velocidad con un estilo: $estilo")
    }
}