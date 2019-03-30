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

	function newmovies(item,index) {
		var newlist = [item.title,item.release];
		return newlist;
	}
	console.log(moviez.map(newmovies));

	
	/*var kiku = () => {
		return function (moviez) {
		delete data.result[1];
		var arr1 = [];
		//var l = arr1.map(moviez => {json.parse(moviez) + "X"});
		arr1.push(moviez);
		return arr1;
		}();
	};
	

	/*Array.prototype.map = function(f) {
		var res = [];
		this.forEach(function(itemInArray) {
		res.push(f(itemInArray));
		});
		return res;
	};
	console.log(moviez.map(i => i));
	//console.log([1, 2, 3].map(i => i * i));

	/*var total = shoppingCart.map((moviez) => {
		return prev + curr.qty * curr.price * 0.9;
	},0);
	*/