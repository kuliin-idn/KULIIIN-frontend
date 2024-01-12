package ray.kotlin.kuliin.data.api.model

data class KuliDataItem(
    val Description: String,
    val ImageBanner: String,
    val ImageProfile: String,
    val Name: String,
    val ProfessionTags: List<String>,
    val Rating: Double,
    val RentalCount: Int
)