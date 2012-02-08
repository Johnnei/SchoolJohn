/*
  Blink
  Turns on an LED on for one second, then off for one second, repeatedly.
 
  This example code is in the public domain.
 */

void setup() {                
  // initialize the digital pin as an output.
  // Pin 13 has an LED connected on most Arduino boards:
  pinMode(7, OUTPUT); //Red
  pinMode(6, OUTPUT); //Green
}

void loop() {
  //Reset pins
  digitalWrite(7, HIGH); //Red
  digitalWrite(6, LOW); //Green
  //20 Sec Delay
  delay(20000);
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
}
