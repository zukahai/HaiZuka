var x = document.querySelectorAll(".radio > label");
var i;
for (i = 0; i < x.length; i++) {
    if ((i + 1) % 5 == 0)
        x[i].click();
}

var x = document.querySelectorAll("textarea");
var i;
for (i = 0; i < x.length; i++) {
    x[i].value = "Không có ý kiến";
}