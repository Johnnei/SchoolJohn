//Pin to Led Location
int pinTopLeft = 2;
int pinTopMiddle = 3;
int pinTopRight = 4;

int pinMiddle = 5;

int pinBotLeft = 6;
int pinBotMiddle = 7;
int pinBotRight = 8;

int pinButton = 9;

int randNumb = 0;
boolean butPres = LOW;

void setup() {
   pinMode(pinTopLeft, OUTPUT);
   pinMode(pinTopMiddle, OUTPUT);
   pinMode(pinTopRight, OUTPUT);
   pinMode(pinBotLeft, OUTPUT);
   pinMode(pinBotMiddle, OUTPUT);
   pinMode(pinBotRight, OUTPUT);
   pinMode(pinMiddle, OUTPUT);
}

void drawOne() {
  digitalWrite(pinMiddle, HIGH);
}

void drawTwo() {
  digitalWrite(pinTopLeft, HIGH);
  digitalWrite(pinBotRight, HIGH);
}

void drawThree() {
  drawOne();
  drawTwo();
}

void drawFour() {
  digitalWrite(pinTopLeft, HIGH);
  digitalWrite(pinTopRight, HIGH);
  digitalWrite(pinBotLeft, HIGH);
  digitalWrite(pinBotRight, HIGH);
}

void drawFive() {
  drawOne();
  drawFour();
}

void drawSix() {
  drawFour();
  digitalWrite(pinTopMiddle, HIGH);
  digitalWrite(pinBotMiddle, HIGH);
}

void resetPins() {
  digitalWrite(pinTopLeft, LOW);
  digitalWrite(pinTopMiddle, LOW);
  digitalWrite(pinTopRight, LOW);
  digitalWrite(pinMiddle, LOW);
  digitalWrite(pinBotLeft, LOW);
  digitalWrite(pinBotMiddle, LOW);
  digitalWrite(pinBotRight, LOW);
}

void light() {
  if(randNumb == 1) {
      drawOne(); }
    else if (randNumb == 2) {
      drawTwo(); }
    else if (randNumb == 3) {
      drawThree(); }
    else if (randNumb == 4) {
      drawFour(); }
    else if (randNumb == 5) {
      drawFive(); }
    else if (randNumb == 6) {
      drawSix(); }
    delay(500);
}

void loop() {
  if(digitalRead(pinButton) == HIGH) { 
    int nextNumb = random(1, 7);
    if(butPres == LOW) {
      butPres = HIGH;
      
      int delayTime = 100;
      
     for(int i = 0; i < 10; i++) {
       randNumb = random(1,7);
       light();
       delay(delayTime/2);
       if(i == 0)
         delayTime = 200;
       else if (i == 3)
         delayTime = 300;
       else if (i == 4)
         delayTime = 400;
       else if (i == 5)
         delayTime = 500;
       else if (i == 6)
         delayTime = 600;
       else if (i == 7)
         delayTime = 1000;
       else if (i == 8)
         delayTime = 1400;
       resetPins();
       delay(delayTime/2);
    }
    
    for ( int i = 0; i < 3; i++) {
      randNumb = nextNumb;
      light();
      delay(500);
      resetPins();
      delay(500);
    }
    }
    
  } else { butPres = LOW; resetPins(); }
}
