package models

class Component {

    var id: Int = 0
    var name: String = ""
    var location: Location = Location()
    var size: Size = Size()
    var type: String = ""
    var backgroundColor: Color? = Color()
    var backgroundImage: Image? = Image()
    var label: String? = ""
    var color: Color? = Color()
    var font: Font? = Font()



    constructor(){}

    override fun toString(): String {
        return "Component(id=$id, name='$name', location=$location, size=$size, type='$type', backgroundColor=$backgroundColor, backgroundImage=$backgroundImage)"
    }


}