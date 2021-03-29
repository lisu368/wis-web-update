	var counter = 6;
	var interval = setInterval(function() {
	    counter--;
	    document.getElementById("countdowntimer").innerHTML = counter.toString();
	    // Display 'counter' wherever you want to display it.
	    if (counter == 0) {
	        // Display a login box
	        clearInterval(interval);
	        window.location.href = 'invalidate.jsp';
	    }
	}, 1000);