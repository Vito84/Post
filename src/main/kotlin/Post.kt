package ru.netology


data class Post(
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val repost: Repost,
    val views: Views,
    val postType: PostType,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int
) {

    data class Comments(
        val count: Int = 0,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = true,
        val canOpen: Boolean = true
    )

    data class Copyright(
        val id: Int = 0,
        val link: String = "",
        val name: String = "",
        val type: String = ""
    )

    data class Likes(
        val count: Int = 0,
        val userLikes: Boolean = true,
        val canLike: Boolean = true,
        val canPublish: Boolean = true
    )

    data class Repost(
        val count: Int = 0,
        val userReposted: Boolean = false
    )

    data class Views(
        val count: Int = 0
    )

    data class Donut(
        val isDonut: Boolean = true,
        val paidDuration: Int = 0,
        val placeholder: String = "",
        val canPublishFreeCopy: Boolean = false,
        val editMode: DonutEditMode = DonutEditMode.all
    )

    enum class DonutEditMode { all, duration }
    enum class PostType { post, copy, reply, postpone, suggest }

}
