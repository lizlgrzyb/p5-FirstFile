var Counter = 0;

function setup() {
  createCanvas(600, 600);
  frameRate(40);
  angleMode(DEGREES);
}

function draw() {
  Counter = Counter+3;
  Counter = Counter%360;
  background(300)
  fill(0)
  
  var MoveCirc = 200*sin(Counter);
  ellipse(width/2 + MoveCirc, height/2, 20, 20)
  ellipse(width/2 + MoveCirc, height/2 + MoveCirc, 20, 20)
}