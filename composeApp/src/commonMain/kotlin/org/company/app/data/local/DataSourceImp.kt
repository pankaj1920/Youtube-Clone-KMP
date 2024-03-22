package org.company.app.data.local

import YouTubeDatabase.db.YoutubeDatabase
import sqldelight.db.YoutubeEntity

class DataSourceImp(
    db: YoutubeDatabase
) : DataSource {
    private val queries = db.youtubeEntityQueries
    override suspend fun getVideoById(id: Long): YoutubeEntity? {
        return queries.getVideoById(id).executeAsOneOrNull()
    }

    override fun getAllVideos(): List<YoutubeEntity> {
        return queries.getAllVideos().executeAsList()
    }

    override suspend fun deleteVideoById(id: Long) {
        return queries.deleteVideoById(id)
    }

    override suspend fun insertVideo(
        title: String,
        channelName: String,
        channelImage: String,
        views: String,
        pubDate: String,
        duration: String
    ) {
        return queries.insertVideos(id = null, title, channelName, channelImage, views, pubDate, duration)
    }
}