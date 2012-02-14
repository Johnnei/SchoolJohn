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
  delay(5000);
  //Orange 1 Sec
  digitalWrite(8, LOW);
  digitalWrite(9, HIGH);
  delay(1000);
  //Red 5 sec
  digitalWrite(9, LOW);
  digitalWrite(10, HIGH);
  delay(5000);
}

void voetgangerStoplicht() {
  //Turn on both
  digitalWrite(7, LOW);
  digitalWrite(6, HIGH);
  //30 Sec Delay
  delay(30000);
  for(int i = 0; i < 7; i++) {
    digitalWrite(6, LOW);
    delay(500);
    digitalWrite(6, HIGH);
    delay(500);
  }
  digitalWrite(6, LOW);
  digitalWrite(7, HIGH);
}

void loop() {
 stoplicht();
 voetgangerStoplicht();
}
