
var hh=0;
var inter;

//we show the box by setting the visibility of the element and incrementing the height smoothly
function ShowBox(nDe)
{

//Depending on the amount of text, set the maximum height here in pixels
	if(hh==500)
	{
	hh=0;
	clearInterval(inter);
	window.document.location = "#contactform"+nDe;
	return;
	}

	obj = document.getElementById("cover"+nDe);
	obj.style.visibility = 'visible';
	hh+=10;
	obj.style.height = hh + 'px';
}

//same way as above but reversed
function HideBox(nDe)
{
	obj = document.getElementById("cover"+nDe);

	if(hh==2)
	{
	obj.style.visibility = 'hidden';
	obj.style.height = '0.1em';
	clearInterval(inter);
	return;
	}
	hh-=2;
	obj.style.height = hh + 'px';
}

function checkInputContactform(nDe){
	frm = document.form[nDe];
	if(frm.email_from.value == ""){
		frm.email_from.focus();
		alert("Vul s.v.p. uw email adres in.");
		return false;
	}
	return true;
}
