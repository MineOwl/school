$(function(){
    var scale = 0.5;
    var canvas = document.createElement('canvas');
    var ctx = canvas.getContext('2d');
    var image = new Image();
    var reader = new FileReader();
    image.src = "lena_std.png";
    image.onload = function(event){
        var dstWidth = this.width * scale;
        var dstHeight = this.height * scale
        canvas.width = dstWidth;
        canvas.height = dstHeight;
        ctx.drawImage(this,0,0,this.width, this.height,0,0,dstWidth,dstHeight);
        $("#dst").attr('src', canvas.toDataURL());
    }
});
