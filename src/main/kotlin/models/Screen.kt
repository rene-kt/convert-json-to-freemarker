package models

class Screen {

    var id: Int = 0
    var name: String = ""
    var size: Size = Size()
    // var backgroundColor: Color? = null
    val startScreen: Boolean = true

    // val backgroundImage: Image? = null
    var components: Collection<Component>? = null
    override fun toString(): String {
        return "Screen(id=$id, name='$name', size=$size, startScreen=$startScreen, components=$components)"
    }


}