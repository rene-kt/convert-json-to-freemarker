package models

class Color {

    var hex: String = ""

    constructor(){}
    constructor(hex: String){this.hex = hex}

    override fun toString(): String {
        return "Color(hex='$hex')"
    }


}