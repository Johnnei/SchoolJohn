int NOTE_C4 = 262;

void setup() {                
  // initialize the digital pin as an output.
  // Pin 13 has an LED connected on most Arduino boards:
  pinMode(10, OUTPUT); //Red
  pinMode(9, OUTPUT); //Orange
  pinMode(8, OUTPUT); //Green
  pinMode(7, OUTPUT);
  pinMode(6, OUTPUT);
}

void stoplicht() {
  //Reset pins
  digitalWrite(8, LOW); //Green
  digitalWrite(9, LOW); //Orange
  digitalWrite(10, LOW); //Red
  //Green 5 Sec
  digitalWrite(8, HIGH);
  delay(2000);
  tone(4, NOTE_C4, 500);
  delay(2500);
  tone(4, NOTE_C4, 500);
  delay(500);
  //Orange 1 Sec
  digitalWrite(8, LOW);
  digitalWrite(9, HIGH);
  delay(1000);
  //Red 5 sec
  digitalWrite(9, LOW);
  digitalWrite(10, HIGH);
  delay(1000);
  tone(4, NOTE_C4, 500);
  delay(2500);
  tone(4, NOTE_C4, 500);
  delay(500);
}

void voetgangerStoplicht() {
  //Turn on both
  digitalWrite(6, HIGH);
  digitalWrite(7, LOW);
  //30 Sec Delay
  for(int i = 0; i < 30; i++) {
    tone(4, NOTE_C4, 500);
    delay(500);
    noTone(4);
    delay(500);
  }
  for(int i = 0; i < 7; i++) {
    tone(4, NOTE_C4, 250);
    digitalWrite(6, LOW);
    delay(250);
    noTone(4);
    delay(250);
    tone(4, NOTE_C4, 250);
    digitalWrite(6, HIGH);
    delay(250);
    noTone(4);
    delay(250);
  }
  digitalWrite(6, LOW);
  digitalWrite(7, HIGH);
}

void loop() {
 stoplicht();
 int buttonState = digitalRead(5);
 if(buttonState == HIGH) {
   voetgangerStoplicht();
 }
}
