package com.me.githubmanager.core.model.api

import com.squareup.moshi.JsonClass

typealias GetUsersResponse = ArrayList<User>

@JsonClass(generateAdapter = true)
data class User (
    val login: String,
    val id: Long,
    val nodeID: String,
    val avatarURL: String,
    val gravatarID: String,
    val url: String,
    val htmlURL: String,
    val followersURL: String,
    val followingURL: String,
    val gistsURL: String,
    val starredURL: String,
    val subscriptionsURL: String,
    val organizationsURL: String,
    val reposURL: String,
    val eventsURL: String,
    val receivedEventsURL: String,
    val type: String,
    val userViewType: String,
    val siteAdmin: Boolean
)