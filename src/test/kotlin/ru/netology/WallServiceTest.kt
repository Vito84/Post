package ru.netology

import org.junit.Test

import org.junit.Assert.*

internal class WallServiceTest {


    @Test
    fun test_add() {
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")


        val post1 = Post(
            1, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place())
            , emptyArray())


        val post2 = Post(
            1, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())



        val ws = WallService(111)

        ws.add(post1)

        assertEquals(1, ws.nextID)

        ws.add(post2)

        assertEquals(2, ws.nextID)

    }


    @Test
    fun updateRemoveTest() {

        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")


        val post1 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())


        val ws = WallService(111)
        ws.add(post1)


        val post2 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()),emptyArray())


        assertEquals(ws.update(post2), true)
    }



    @Test
    fun updateRemoveTest2() {

        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")


        val ws = WallService(111)


        val post1 = Post(
            5, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())

        assertEquals(ws.update(post1), false)
    }
    @Test
    fun createComment (){
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")


        val post0 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())

        val post1 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())


        val newComment = Comment(1,1,1,"new comment",
            null,null, null, null)


        val ws = WallService(111)

        ws.add(post0)
        ws.add(post1)


    }



    @Test
    fun test_Audio(){
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")

        val audio = AudioAttachment()


        val post1 = Post(
            1, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place())
            , Array(1){ audio } )



        assertEquals((post1.attechments?.get(0)  as AudioAttachment ).audio.id , 1)

    }

    @Test
    fun test_Video(){
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")

        val video = VideoAttachment()


        val post1 = Post(
            1, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place())
            , Array(1){video} )


        assertEquals((post1.attechments?.get(0)  as VideoAttachment ).video.id , 1)

    }
}


