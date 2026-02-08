import random

numero_secret = random.randint(1, 20)
intents = 0
encertat = False

print("🎮 Joc: Endevina el número!")
print("He pensat un número entre 1 i 20.")

while encertat == False:
    numero = int(input("Escriu un número: "))
    intents = intents + 1

    if numero < numero_secret:
        print("📉 Massa baix!")
    elif numero > numero_secret:
        print("📈 Massa alt!")
    else:
        encertat = True
        print("🎉 Correcte! Has encertat!")
        print("Has necessitat", intents, "intents.")
