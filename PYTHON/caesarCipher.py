def encrypt(text, shift):
    result = ""
    for i in range(len(text)):
        char = text[i]
        if (char.isupper()):
            result += chr((ord(char) + shift - 65) % 26 + 65)
        else:
            result += chr((ord(char) + shift - 97) % 26 + 97)
    return result

def decrypt(text, shift):
    result = ""
    for i in range(len(text)):
        char = text[i]
        if (char.isupper()):
            result += chr((ord(char) - shift - 65) % 26 + 65)
        else:
            result += chr((ord(char) - shift - 97) % 26 + 97)
    return result

def help():
    print("Usage: caesarCipher.py -e|d <text> <shift>")
    print("-e | --encrypt <text> <shift> - encrypt text")
    print("-d | --decrypt <text> <shift> - decrypt text")
    print("Example: caesarCipher.py -e \"Hello World\" 5 # encrypt text")
    print("Example: caesarCipher.py -d \"Mjqqt%Btwqi\" 5 # decrypt text")




def main():
    import argparse
    parser = argparse.ArgumentParser()

    parser.add_argument("-e", "--encrypt", help="encrypt text", nargs=2)
    parser.add_argument("-d", "--decrypt", help="decrypt text", nargs=2)

    args = parser.parse_args()

    if args.encrypt:
        print(encrypt(args.encrypt[0], int(args.encrypt[1])))
    elif args.decrypt:
        print(decrypt(args.decrypt[0], int(args.decrypt[1])))
    else:
        help()

if __name__ == "__main__":
    main()

# this code is contributed by @ahmedheltaher
