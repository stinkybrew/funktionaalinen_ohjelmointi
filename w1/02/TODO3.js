//w1 02 TODO3
'use strict'
const offset = [1,2];
const zoom = 2;
const rotate = Math.PI;
const p = { x: 1, y: 1};
const pipeline  = [  
    function translate(p){
        return { x: p.x + offset[0], y: p.y + offset[1] };
    },
    function scale(p){
        return { x: p.x * zoom, y: p.y * zoom};
    },
    function rotation(p){
        return { x: p.x*Math.cos(rotate) - p.y*Math.sin(rotate), y: p.x*Math.sin(rotate) + p.y*Math.cos(rotate) };
    },
];
function changer(p){
     for(let i=0; i<pipeline.length; i++){   
        pt = pipeline[i](p);
    }
    return p;
}
console.log(p);
console.log(muunnos(p));