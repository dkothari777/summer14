var imgDatabase = 'helpers/img.html';

$.post(imgDatabase, function(data) {
    var results = $.parseJSON(data);
    console.log(results);
});
