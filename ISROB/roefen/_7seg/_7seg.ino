
int pinBotRight = 2;
int pinBotMiddle = 3;
int pinBotLeft = 4;
int pinTopRight = 5;
int pinTopMiddle = 6;
int pinTopLeft = 7;
int pinMiddle = 8;

void setup() {
  for(int i = 2; i <= 8; i++) {
    pinMode(i, OUTPUT);
  }

}

void reset() {
      for(int i = 2; i <= 8; i++) {
          digitalWrite(i, LOW);
      }
}

void showNul() {
    digitalWrite(pinTopLeft, HIGH);
    digitalWrite(pinBotLeft, HIGH);
    digitalWrite(pinTopMiddle, HIGH);
    digitalWrite(pinBotRight, HIGH);
    digitalWrite(pinTopRight, HIGH);
    digitalWrite(pinBotMiddle, HIGH);
}

void showOne() {
    digitalWrite(pinBotRight, HIGH);
    digitalWrite(pinTopRight, HIGH);
}

void showTwo() {
    digitalWrite(pinTopMiddle, HIGH);
    digitalWrite(pinTopRight, HIGH);
    digitalWrite(pinMiddle, HIGH);
    digitalWrite(pinBotLeft, HIGH);
    digitalWrite(pinBotMiddle, HIGH);
}

void showThree() {
    digitalWrite(pinTopMiddle, HIGH);
    digitalWrite(pinTopRight, HIGH);
    digitalWrite(pinMiddle, HIGH);
    digitalWrite(pinBotRight, HIGH);
    digitalWrite(pinBotMiddle, HIGH);
}

void showFour() {
    digitalWrite(pinTopLeft, HIGH);
    digitalWrite(pinTopRight, HIGH);
    digitalWrite(pinMiddle, HIGH);
    digitalWrite(pinBotRight, HIGH);
}

void showFive() {
    digitalWrite(pinTopMiddle, HIGH);
    digitalWrite(pinTopLeft, HIGH);
    digitalWrite(pinMiddle, HIGH);
    digitalWrite(pinBotRight, HIGH);
    digitalWrite(pinBotMiddle, HIGH);
}

void showSix() {
    showFive();
    digitalWrite(pinBotLeft, HIGH);
}

void showSeven() {
    digitalWrite(pinTopMiddle, HIGH);
    digitalWrite(pinTopRight, HIGH);
    digitalWrite(pinBotRight, HIGH);
}

void showEight() {
    showSix();
    digitalWrite(pinTopRight, HIGH);
}

void showNine() {
    showFive();
    digitalWrite(pinTopRight, HIGH);
}

void loop() {
     for(int numb = 0; numb < 10; numb++) {
         for(int i = 0; i < 200; i++) {
             if(numb == 0)
               showNul();
             else if(numb == 1)
               showOne();
             else if(numb == 2)
               showTwo();
             else if(numb == 3)
               showThree();
             else if(numb == 4)
               showFour();
             else if(numb == 5)
               showFive();
             else if(numb == 6)
               showSix();
             else if(numb == 7)
               showSeven();
             else if(numb == 8)
               showEight();
             else if(numb == 9)
               showNine();
             delay(5);
             reset();
         }
     }
}
