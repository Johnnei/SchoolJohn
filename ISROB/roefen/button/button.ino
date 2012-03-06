int ledPin = 7;
int butPin = 2;

void setup() {
  // put your setup code here, to run once:
  pinMode(ledPin, OUTPUT);
  pinMode(butPin, INPUT);
  digitalWrite(butPin, HIGH);
}

void loop() {
  // put your main code here, to run repeatedly: 
  if(digitalRead(butPin) == HIGH)
    digitalWrite(ledPin, LOW);
  else
    digitalWrite(ledPin, HIGH);
}
