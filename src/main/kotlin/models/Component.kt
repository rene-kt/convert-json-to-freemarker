package models

class Component {

    var id: Int = 0
    var name: String = ""
    //var location: Location = Location()
    var size: Size = Size()
    var type: String = ""
    // var backgroundColor: Color? = null



    constructor(){}
    constructor(id: Int, name: String, size: Size, type: String) {
        this.id = id
        this.name = name
        this.size = size
        this.type = type
    }


    override fun toString(): String {
        return "Component(id=$id, name='$name', size=$size, type='$type')"
    }


}