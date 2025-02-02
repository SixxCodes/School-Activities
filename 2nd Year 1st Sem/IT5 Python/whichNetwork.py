print("******")

while True:
    try:
        intNumInput = int(input("\nEnter your number: "))
        strNumInput = str(intNumInput)

        arrStrNum = list(strNumInput)
        arrStrNum.insert(0, "0")

        length = (len(arrStrNum))

        if length > 11 or length < 11:
            print("Please input 11 numbers and enter a number that starts with 09!")
        else:

            if arrStrNum[0] == "0" and arrStrNum[1] == "9":

                #SMART: 13, 14, 20, 21, 28, 29, 30
                if arrStrNum[2] == "1" and arrStrNum[3] == "3" \
                        or arrStrNum[2] == "1" and arrStrNum[3] == "4"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "0"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "1"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "8"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "9"\
                        or arrStrNum[2] == "3" and arrStrNum[3] == "0":
                    print("Your network is \"Smart\"!")
                    break

                #TNT: 08, 09, 10, 11, 12, 18, 19
                elif arrStrNum[2] == "0" and arrStrNum[3] == "8"\
                        or arrStrNum[2] == "0" and arrStrNum[3] == "9"\
                        or arrStrNum[2] == "1" and arrStrNum[3] == "0"\
                        or arrStrNum[2] == "1" and arrStrNum[3] == "1"\
                        or arrStrNum[2] == "1" and arrStrNum[3] == "2"\
                        or arrStrNum[2] == "1" and arrStrNum[3] == "8"\
                        or arrStrNum[2] == "1" and arrStrNum[3] == "9":
                    print("Your network is \"TNT\"!")
                    break

                #SUN: 22, 23, 32, 33
                elif arrStrNum[2] == "2" and arrStrNum[3] == "2"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "3"\
                        or arrStrNum[2] == "3" and arrStrNum[3] == "2"\
                        or arrStrNum[2] == "3" and arrStrNum[3] == "3":
                    print("Your network is \"Sun\"!")
                    break

                #GLOBE: 15, 16, 17. 25, 26, 27
                elif arrStrNum[2] == "1" and arrStrNum[3] == "5"\
                        or arrStrNum[2] == "1" and arrStrNum[3] == "6"\
                        or arrStrNum[2] == "1" and arrStrNum[3] == "7"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "5"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "6"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "7":
                    print("Your network is \"Globe\"!")
                    break

                #TM: 03, 04, 05, 06, 07
                elif arrStrNum[2] == "0" and arrStrNum[3] == "3"\
                        or arrStrNum[2] == "0" and arrStrNum[3] == "4"\
                        or arrStrNum[2] == "0" and arrStrNum[3] == "5"\
                        or arrStrNum[2] == "0" and arrStrNum[3] == "6"\
                        or arrStrNum[2] == "0" and arrStrNum[3] == "7":
                    print("Your network is \"TM\"!")
                    break

                #RED: 01, 02, 24
                elif arrStrNum[2] == "0" and arrStrNum[3] == "1"\
                        or arrStrNum[2] == "0" and arrStrNum[3] == "2"\
                        or arrStrNum[2] == "2" and arrStrNum[3] == "4":
                    print("Your network is \"Red\"!")
                    break

                else:
                    print("This network doesn't belong to any network!")
            else:
                print("Please enter number that starts with 09!")

    except ValueError:
        print("This is not a number!")