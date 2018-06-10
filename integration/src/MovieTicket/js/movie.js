$.ajax({
   url:'http://127.0.0.1:8080/integration/allMovies',
   type:'GET',
    dataType:'json',
   success:function (data) {
      var moviename=GetQueryString("movieName");
      for( d in data){
         if(moviename===data[d].movie_Name){
           $("#movieName").html(data[d].movie_Name);
           $("#movieEnglishName").html(data[d].movie_English_Name);
           $("#movieImage").attr('src',data[d].movie_Pic);
           $("#movieType").html(data[d].types);
           $("#movieTime").html(data[d].lasting_Time);
           $("#movieAddress").html(data[d].shooting_Place);
           $("#movieDate").html(data[d].show_Time);
           $("#movieArea").html(data[d].shooting_Place);
           $("#score").html(data[d].user_Score);
           $("#director").html(data[d].director);
           $("#simpleDescribe").html(data[d].introduction);
         }
      }
   }
});


$.ajax({
    url:'http://127.0.0.1:8080/integration/allTheatres',
    type:'GET',
    dataType:'json',
    success:function (data) {
       var html='<li class="item">\n' +
           '\t\t\t\t\t <a class="pic"><img class="theaterImage" src="../images/cont/main_img6.jpg" alt="#"></a>\n' +
           '\t\t\t\t\t <div class="info">\n' +
           '\t\t\t\t\t\t <button class="theaterName" onclick="getTheater(this)" class="title"></button>\n' +
           '\t\t\t\t\t </div>\n' +
           '\t\t\t\t </li>';
       for( i in data ){
          $("#theaterList").append(html);
       }
       $(".theaterImage").each(function (a) {
           $(this).attr('src',data[a].theare_Image);
       });
       $(".theaterName").each(function (b) {
           $(this).html(data[b].theatre_Name);
           $(this).attr('id',data[b].theatre_Name);
       });
    }
});

function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if(r != null) return decodeURI(r[2]);
    return null;
}

function getTheater(data) {
    var url='theater.html?movieName='+GetQueryString("movieName")+'&theatre='+data.id;
    $(location).attr('href',url);
}