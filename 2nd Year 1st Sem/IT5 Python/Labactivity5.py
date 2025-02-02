with open('kenny.txt') as fhand:
    counts = {}
    for line in fhand:
        words = line.split()
       
        for word in words:
            counts[word] = counts.get(word, 0) + 1

  
    lst = [(val, key) for key, val in counts.items()]

  
    lst.sort(reverse=True)

    for val, key in lst[:10]:
        print(key, val)