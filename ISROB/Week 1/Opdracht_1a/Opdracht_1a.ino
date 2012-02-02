/*
  Blink
  Turns on an LED on for one second, then off for one second, repeatedly.
 
  This example code is in the public domain.
 */

void setup() {                
  // initialize the digital pin as an output.
  // Pin 13 has an LED connected on most Arduino boards:
  pinMode(9, OUTPUT);     
  pinMode(13, OUTPUT);
}

void loop() {
  digitalWrite(9, LOW);   // set the LED on
  digitalWrite(13, HIGH);
  delay(1000);              // wait for a second
  digitalWrite(9, HIGH);    // set the LED off
  digitalWrite(13, LOW);
  delay(1000);              // wait for a second
}
