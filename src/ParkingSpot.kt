class ParkingSpot(
    val Name: String,
    var X: Int,
    var Y:Int,
    var isOccupied: Boolean= false
){
    fun occupy(){
        isOccupied= true
    }

    override fun toString(): String {
        var stringToReturn=""
        when(isOccupied){
            false-> stringToReturn= Name
            true-> stringToReturn= "@"
        }
        return stringToReturn
    }
}