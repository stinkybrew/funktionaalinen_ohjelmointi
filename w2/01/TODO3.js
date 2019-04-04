
	 //11
let moviez = require("./movies")
var mlist = [];
for (let i = 0; i < moviez.length; i += 1) {
	let l = " " + moviez.map(nmovies).slice(i, i + 1);  // This in normal strings type
	mlist.push(l); // push to mlist
}
console.log(mlist);
console.log(" ");

function nmovies(item) {
	let newlist = [item.title,item.release]; // Here i sepereate title and release from whole list
	return newlist;
}
let nmlist = [];
let o = " " + moviez.map(nmovies); //  and another list testing
nmlist.push(o);
console.log(nmlist);
console.log(" ");

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