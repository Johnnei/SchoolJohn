<!--
  var formSubmitted = false;

// function to open LU in new window
    function newLessonStatus(href, status) {
        strFeatures = "minimize=1,resizable=1,dependent=0,menubar=0,directories=0, location=0,status=" + status + ",scrollbars=1,toolbar=0,left=300,top=20,height=800,width=600,screenY=20, screenX =300";
        // strFeatures = "menubar=0,toolbar=0,resizable=1";
        if      (!window.lesson)       lesson=window.open(href,"lesson",strFeatures);
        else if (window.lesson.closed) lesson=window.open(href,"lesson",strFeatures);
        else window.lesson.focus();
    }

function newLesson(href) {
         newLessonStatus(href,0)
}

function confirmAssessment(bIsNewWindow, myHref, msg)
{
    if (window.confirm(msg))
    {
      if (bIsNewWindow) 
      {
        newLessonStatus(myHref, 1)
      }
      else
      {
        this.location.href = myHref
      } 
    }
}

function openWin(ppage) {
		var winX =420;
		var winY =500;
		// only set new values if 4.0 browser
		if (parseInt(navigator.appVersion) >= 4) {
			winX = (screen.availWidth - 500);
			winY = (screen.availHeight - 600); 
			}
	strFeatures='minimize=0,maximize=0,resizable=0,dependent,scrollbars,left='+winX+',top='+winY+',height=500,width=420';
		if ((!window.newwin) || (window.newwin.closed)) {
			newwin = window.open(ppage,'notepad',strFeatures);
		} else {
		 	window.newwin.focus();
		}
}

// -->

