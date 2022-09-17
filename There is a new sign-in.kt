fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}
fun displayAlertMessage(operatingSystem: String , emailId : String ) : String {
    return "There was a new sign-in from on $operatingSystem, from your Google Account $emailId "
}

fun displyAlertMessage(
    operatingSystem : String = "Unknown OS" ,
    emailId : String
) : String {
    return "There was a new sign-in from on $operatingSystem, from your Google Account $emailId."
}