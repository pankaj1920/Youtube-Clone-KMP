package org.company.app.domain.model.relevance


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Default(
    @SerialName("height")
    val height: Int,
    @SerialName("url")
    val url: String,
    @SerialName("width")
    val width: Int
)