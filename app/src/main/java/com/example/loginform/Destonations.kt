package com.example.loginform

interface Destonations {
    val Route : String
}

object Home  : Destonations{
    override val  Route  = "Home"
}


object Second  : Destonations{
    override val  Route  = "Second"
}