# Sets in Python

primaryColors = set(["blue", "red", "yellow"])

color = "violet"

if color.lower in primaryColors:
    print(color + " is a primary color")
else:
    print(color + " is not a primary color")

# adding items to a set
letters = set(["a", "b"])
letters.add("c")
print(letters)