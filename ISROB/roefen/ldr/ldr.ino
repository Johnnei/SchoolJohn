int sensorPin = A5;

/*
5V -> LDR -> Analog In -> 10K Ohm -> Ground
*/

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(sensorPin, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly: 
  int ldrVal = analogRead(sensorPin);
  Serial.println(ldrVal);
  delay(100);
}
