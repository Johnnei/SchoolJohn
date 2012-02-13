preload = new Array();

for (i=1; i<10; i++) {
	preload[i] = new Image();
	preload[i].src = 'images/button'+i+'x.gif';
}
function over(i) {
	document['up'+i].src = '/images/naarboven-on.gif';
} 
function out(i) {
	document['up'+i].src = '/images/naarboven-off.gif';
} 

function overNaarBoven(n) {
	document[n].src = '/images/naarboven-on.gif';
} 
function outNaarBoven(n) {
	document[n].src = '/images/naarboven-off.gif';
} 