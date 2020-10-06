package aj.intelligabble

// TODO: Define all the terms
object IntelligabbleDataSource {

    private val geekTermsAndDefinitions = mapOf(
        "Git" to "System used to maintain various versions of the code"
    )

    fun getData() = geekTermsAndDefinitions
}