package ru.netology


fun main() {
    val original = Post(
        0,
        1,
        1,
        1,
        13042022,
        "привет",
        1,
        1,
        false,
        Post.Comments(11),
        Post.Copyright(4, "jj", "jj", "kkk"),
        Post.Likes(),
        Post.Repost(),
        Post.Views(),
        Post.PostType.Post,
        Post.Attachment("video"),
        1,
        false,
        false,
        false,
        false,
        false,
        Post.Donut(false, 1, "Stop", false, "all"),
        1
    )


    val original1 = Post(
        1,
        1,
        1,
        1,
        13042022,
        "привет",
        1,
        1,
        false,
        Post.Comments(11),
        Post.Copyright(4, "jj", "jj", "kkk"),
        Post.Likes(),
        Post.Repost(),
        Post.Views(),
        Post.PostType.Post,
        Post.Attachment("video"),
        1,
        false,
        false,
        false,
        false,
        false,
        Post.Donut(false, 1, "Stop", false, "all"),
        1
    )


    val original2 = Post(
        2,
        1,
        1,
        1,
        13042022,
        "привет",
        1,
        1,
        false,
        Post.Comments(11),
        Post.Copyright(4, "jj", "jj", "kkk"),
        Post.Likes(),
        Post.Repost(),
        Post.Views(),
        Post.PostType.Post,
        Post.Attachment("video"),
        1,
        false,
        false,
        false,
        false,
        false,
        Post.Donut(false, 1, "Stop", false, "all"),
        1

        )
    println(WallService.add(original))
    println(WallService.add(original1))
    println(WallService.update(original2))


}