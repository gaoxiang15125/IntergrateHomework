$.ajax({
    url:'http://127.0.0.1:8080/integration/allMovies',
    type:'GET',
    dataType:'json',
    success:function (data) {
        for(i=0;i<data.length;i++){
            var html='<li class="item">\n' +
                '                    <div class="pic"><img class="movieImage" src="../images/cont/main_img1.jpg" alt="#"></div>\n' +
                '                    <div class="info">\n' +
                '                        <button class="title" onclick="movieName(this)">电影名称</button>\n' +
                '                        <p class="area">地区</p>\n' +
                '                    </div>\n' +
                '                </li>';
            $("#movieList").append(html);
        }
        $(".movieImage").each(function (j) {
            $(this).attr('src',data[j].movie_Pic);
        });
        $(".title").each(function (k) {
            $(this).html(data[k].movie_Name);
            $(this).attr('id',data[k].movie_Name);
        });
        $(".area").each(function (l) {
           $(this).html(data[l].shoot_Place);
        });

    },
    fail:function (err) {
        console.log(err);
    }
});

function movieName(data) {
    // console.log(data.id);
    var url='movie.html?movieName='+data.id;
    $(location).attr('href',url);
}