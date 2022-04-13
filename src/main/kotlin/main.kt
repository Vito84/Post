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
        Post.Comments(),
        Post.Copyright(),
        Post.Likes(),
        Post.Repost(),
        Post.Views(),
        Post.PostType.post,
        1,
        false,
        false,
        false,
        false,
        false,
        false,
        Post.Donut(),
        1
    )


    val original1 = Post(
        0,
        1,
        1,
        1,
        13042022,
        "привет",
        1,
        1,
        false,
        Post.Comments(),
        Post.Copyright(),
        Post.Likes(),
        Post.Repost(),
        Post.Views(),
        Post.PostType.post,
        1,
        false,
        false,
        false,
        false,
        false,
        false,
        Post.Donut(),
        1
    )


    val original2 = Post(
        2,
        55555,
        1,
        1,
        22222222,
        "привет",
        1,
        1,
        false,
        Post.Comments(),
        Post.Copyright(),
        Post.Likes(),
        Post.Repost(),
        Post.Views(),
        Post.PostType.post,
        1,
        false,
        false,
        false,
        false,
        false,
        false,
        Post.Donut(),
        1
    )
    println(WallService.add(original))
    println(WallService.add(original1))
    println(WallService.update(original2))


}