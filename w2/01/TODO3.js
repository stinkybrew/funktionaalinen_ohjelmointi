var moviez = [ 
		{ 
 			title: 'Harry Potter and the Deathly Hallows: Part 2', 
 			director: 'David Yates', 
 			release: 2011  
 		},
 		{ 
 			title: 'The Lord of the Rings: The Fellowship of the Ring', 
 			director: 'Peter Jackson', 
 			release: 2001  
 		}, 
 		{ 
 			title: 'Titanic', 
 			director: 'James Cameron', 
 			release: 1997 
 		}, 
 		{ 
 			title: 'Avatar', 
 			director: 'James Cameron', 
 			release: 2009 
 		}, 
 		{ 
 			title: 'The Hobbit: An Unexpected Journey', 
 			director: 'Peter Jackson', 
 			release: 2012 
 		}, 
 		{ 
 			title: 'The Matrix', 
 			director: 'Andy Wachowski', 
 			release: 1999 
 		}, 
 		{ 
 			title: 'Inception', 
 			director: 'Christopher Nolan', 
 			release: 2010 
 		}, 
 		{ 
 			title: 'The Town', 
 			director: 'Ben Affleck', 
 			release: 2010 
 		}, 
 		{ 
 			title: 'The Dark Knight Rises', 
 			director: 'Christopher Nolan', 
 			release: 2012 
 		}, 
 		{ 
 			title: 'My Neighbor Totoro', 
 			director: 'Hayao Miyazaki', 
 			release: 1988 
 		}, 
 		{ 
 			title: 'Spirited Away', 
 			director: 'Hayao Miyazaki', 
 			release: 2001 
 		} 
 	];	 

	 //11

var mlist = [];
for (var i = 0; i < moviez.length; i += 1) {
	var l = " " + moviez.map(nmovies).slice(i, i + 1);  // This in normal strings type
	mlist.push(l); // push to mlist
}
console.log(mlist);
console.log(" ");

function nmovies(item) {
	var newlist = [item.title,item.release]; // Here i sepereate title and release from whole list
	return newlist;
}
let nmlist = [];
var o = " " + moviez.map(nmovies); //  and another list testing
nmlist.push(o);
console.log(nmlist);
console.log(" ");

let baalist = [];
const result2 = moviez.filter(moviez => moviez.release > 2011);  // here we seperate older movies from list.
//console.log(result2); // prints object's
var lizt = [];
for (var i = 0; i < result2.length; i+=1) {
	var l = " " + result2.map(nmovies).slice(i, i+1);  // This in normal strings type
	lizt.push(l); // push to lizt
}
console.log(lizt);
console.log(" ");



/*
// TESTING'S ! ! !
var baa = JSON.stringify(result2[0]);
baalist.push(baa);
console.log(baa);
console.log(baalist); // test print's
console.log(" ");
*/