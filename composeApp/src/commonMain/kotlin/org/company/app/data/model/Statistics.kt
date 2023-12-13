package org.company.app.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Statistics(
    @SerialName("commentCount")
    val commentCount: String?,
    @SerialName("favoriteCount")
    val favoriteCount: String,
    @SerialName("likeCount")
    val likeCount: String?,
    @SerialName("viewCount")
    val viewCount: String
)