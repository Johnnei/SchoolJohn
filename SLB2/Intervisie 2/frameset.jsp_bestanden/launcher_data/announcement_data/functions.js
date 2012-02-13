
$(document).ready(function(){
	$(".tooltip").simpletooltip();

	// SUPERFISH
	$('ul.sf-menu, ul.sf-ecMenu').superfish({
		delay:			250,
		animation:		{opacity:'show',height:'show'},
		pathClass:		'current',
		pathLevels:		0,
		speed:			'fast',
		autoArrows:		false,
		dropShadows:	false
	});
	// END SUPERFISH

});