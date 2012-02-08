/*
  Blink
  Turns on an LED on for one second, then off for one second, repeatedly.
 
  This example code is in the public domain.
 */

void setup() {                
  // initialize the digital pin as an output.
  // Pin 13 has an LED connected on most Arduino boards:
  pinMode(10, OUTPUT); //Red
  pinMode(9, OUTPUT); //Orange
  pinMode(8, OUTPUT); //Green
}

void loop() {
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
