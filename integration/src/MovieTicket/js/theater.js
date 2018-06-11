function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if(r != null) return decodeURI(r[2]);
    return null;
}
var moviename=GetQueryString("movieName");
var theatre=GetQueryString("theatre");

$.ajax({
    url:'http://127.0.0.1:8080/integration/allTheatres',
    type:'GET',
    dataType:'json',
    success:function (data) {
        for(i in data ){
            if(theatre===data[i].theatre_Name){
                $("#theaterImage").attr('src', data[i].theare_Image);
                $("#theaterName").html(data[i].theatre_Name);
                $("#theaterAddress").html(data[i].theatre_Address);
                $("#theaterPhone").html(data[i].theatre_Phone);
                $("#theaterService").html(data[i].user_score);
            }
        }
    }

});

$.ajax({
    url:'http://127.0.0.1:8080/integration/allTickets',
    type:'GET',
    dataType:'json',
    timeout:'8000',
    data:{theatre:theatre,movieName:moviename},
    success:function (data) {
        // 处理返回的数据
        var html='\t <tr>\n' +
            '\t\t\t\t\t <td class="moviename"></td>\n' +
            '\t\t\t\t\t <td class="beginTime"></td>\n' +
            '\t\t\t\t\t <td class="endTime"></td>\n' +
            '\t\t\t\t\t <td class="language"></td>\n' +
            '\t\t\t\t\t <td class="hallNumber"></td>\n' +
            '\t\t\t\t\t <td class="price"></td>\n' +
            '\t\t\t\t\t <td class="ticketSource"></td>\n' +
            '\t\t\t\t </tr>';
        for( i in data){
            $("#ticketTable").append(html);
        }
        $(".moviename").each(function () {
            $(this).html(moviename);
        });
        $(".beginTime").each(function (a) {
            $(this).html(data[a].begin_Time);
        });
        $(".endTime").each(function (b) {
            $(this).html(data[b].end_Time);
        });
        $(".language").each(function (c) {
            $(this).html(data[c].movie_Langage);
        });
        $(".hallNumber").each(function (d) {
            $(this).html(data[d].video_Hall);
        });
        $(".price").each(function (e) {
            $(this).html(data[e].now_Money);
        });
        $(".ticketSource").each(function (f) {
            $(this).html(data[f].whichSite);
        });
    }
});