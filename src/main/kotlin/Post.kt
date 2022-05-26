package ru.netology


data class Post constructor (
    var id: Int,
    var owner_id: Int,
    var from_id: Int,
    var created_by: Int,
    var date: Int,
    var text: String?,
    var replyOwnerId: Int,
    var replyPossId: Int,
    var friendsOnly: Boolean,
    var comments: Comments?,
    var copyright: Copyright?,
    var likes: Likes?,
    var reposts: Reposts?,
    var views: Views?,
    var postType: String,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    var isPinned: Boolean,
    var markedAsAds: Boolean,
    var isFavorite: Boolean?,
    var postponedId: Int,
    var donut: Donut,
    var signerId: Int,
    var geo: Geo,
    var attechments: Array<Attachment>?
)
