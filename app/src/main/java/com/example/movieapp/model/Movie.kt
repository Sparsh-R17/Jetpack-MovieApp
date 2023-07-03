package com.example.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actor: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String,
)

fun getMovies(): List<Movie>{
    return listOf(
        Movie(
            id = "ttfffjka123nnloadsf455",
            title = "Avatar",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actor = "Sam Worthington, Zoe Saldana, Sigourney Weaver",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
            poster = "https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
            images = listOf(
                "https://people.com/thmb/Gc2bEAXZusNxPVlhuK8IZRdgQX8=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():focal(1159x347:1161x349)/avatar-2-way-of-the-water-trailer-110222-3-7fcc8ab436204e46ab9ab7bb007b5fbe.jpg",
                "https://img.etimg.com/thumb/msid-96587748,width-650,height-488,imgsize-76684,,resizemode-75/avatar-2-canva.jpg",
                "https://i2-prod.mirror.co.uk/incoming/article27876678.ece/ALTERNATES/s1200c/2_THP_CHP_310822Slug_05227JPG.jpg"
            ),
            rating = "7.8"
        ),

        Movie(
            id = "nyksldf343efdjjzlk23",
            title = "Harry Potter",
            year = "2001",
            genre = "Adventure, Family, Fantasy",
            director = "Chris Columbus",
            actor = "Daniel Radcliffe, Emma Watson, Rupert Grint",
            plot = "An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family, and the terrible evil that haunts the magical world.",
            poster = "https://m.media-amazon.com/images/M/MV5BNmQ0ODBhMjUtNDRhOC00MGQzLTk5MTAtZDliODg5NmU5MjZhXkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://cdn.britannica.com/82/152982-050-11159CF4/Daniel-Radcliffe-Rupert-Grint-Emma-Watson-Harry.jpg",
                "https://veja.abril.com.br/wp-content/uploads/2020/05/harry-potter-pedra-fif426a.jpg.jpg?quality=90&strip=info&w=1280&h=720&crop=1",
                "https://m.media-amazon.com/images/M/MV5BZDY1YzQxYTktMzFmZi00ZTc2LWE5MzgtYWFmZTUxNTdjMTM0XkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UX500_CR0,0,500,281_.jpg"
            ),
            rating = "7.6"
        ),

        Movie(
            id = "mnz46ldjkl8df2jk4l",
            title = "300",
            year = "2006",
            genre = "Action, Drama, Fantasy",
            director = "Zack Snyder",
            actor = "Gerard Butler, Lena Headey, David Wenham",
            plot = "King Leonidas of Sparta and a force of 300 men fight the Persians at Thermopylae in 480 B.C.",
            poster = "https://m.media-amazon.com/images/M/MV5BMjc4OTc0ODgwNV5BMl5BanBnXkFtZTcwNjM1ODE0MQ@@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://irs.www.warnerbros.com/gallery-v2-jpeg/300_rise_of_an_empire_photo_13-468198381.jpg",
                "https://ranylt.files.wordpress.com/2010/06/300-xerxes.jpg",
                "https://1.bp.blogspot.com/-sfzb_Yrz43M/ToKck2ecf-I/AAAAAAAABj8/w4bLqz5CHEg/s1600/300-Wallpaper-rodrigo-santoro-583603_1024_768.jpg"
            ),
            rating = "7.6"
        ),

        Movie(
            id = "jiolkdsfjf13tugpoaei",
            title = "After Life",
            year = "1998",
            genre = "Drama, Fantasy",
            director = "Hirokazu Koreeda",
            actor = "Arata Iura, Erika Oda, Susumu Terajima",
            plot = "After death, people have just one week to choose only a memory to keep for eternity.",
            poster = "https://m.media-amazon.com/images/M/MV5BZjQ3MDI5ZWYtNmIzMC00OTY0LTk4MGYtMWViYzk5MWRhNTcyXkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_.jpg",
            images = listOf(
                "https://imgs.heart.co.uk/images/282497?crop=16_9&width=660&relax=1&format=webp&signature=xmhDm7eSuBgEIWpfLjknLUp0tjw=",
                "https://images.immediate.co.uk/production/volatile/sites/3/2020/04/After-Life-2_Ricky-Gervais-Mandeep-Dhillon-Tony-Way_Netflix-1-b01014e.jpg?quality=90&resize=980,654",
                "https://assets.telegraphindia.com/telegraph/2022/Jan/1643018853_1-1.jpg"
            ),
            rating = "7.7"
        )
    )
}