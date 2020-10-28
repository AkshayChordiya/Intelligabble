package aj.intelligabble

// TODO: Define all the terms
object IntelligabbleDataSource {

    private val geekTermsAndDefinitions = mapOf(
        "Git" to "System used to maintain various versions of the code.",
        "Front end" to "Front end generally refers to the various sections of the website that are interacted with by the users.",
        "Back end" to "Back end generally refers to the elements which make the website run. It is not visible/interacted by the user.",
        "API" to "Application Programming Interface are the building blocks for applications. For example, Google Maps API can be used to add Google Maps to a web page ",
        "Bugs" to "Mistakes in coding which prevent applications to work as expected.",
        "Frameworks" to "It is a universally accepted, reusable software environment which provides a particular functionality. ",
        "Server" to "It is a centralized resource/computer that provides data to other computers.",
        "Deploy" to "An action taken to host our piece of software on the server.",
        "Database" to "A storage unit for all the data typically hosted on the server.",
        "Emulator" to "A virtual Android mobile device",
        "Simulator" to "A virtual iOS mobile device"
    )

    fun getData() = geekTermsAndDefinitions
}