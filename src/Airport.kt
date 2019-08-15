//class Airport {
//    private String name;
//    private String code;
//    private String city;
//}

data class Airport(val name: String, val code: String, val city: String) {
    override fun toString(): String {
        return name
    }
}
