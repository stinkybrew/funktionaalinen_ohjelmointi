//import "\kalevala.txt";

var fso = new ActiveXObject("Scripting.FileSystemObject");
var fh = fso.OpenTextFile("C:\Users\wille\tmp\funktionaalinen_ohjelmointi\w2\01\kalevala.txt", 1, false, 0);
var output = fh.ReadAll();

console.log(output);