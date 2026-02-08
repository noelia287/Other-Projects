import random

print("🔐 Generador de contrasenyes")

llista_caracters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*?"
longitud = int(input("Quants caràcters vols que tingui la contrasenya? "))

contrasenya = ""
i = 0
while i < longitud:
    contrasenya = contrasenya + random.choice(llista_caracters)
    i = i + 1

print("La teva nova contrasenya és:", contrasenya)
