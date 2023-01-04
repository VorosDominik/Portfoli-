def van_e_G(rendeles):
    for i in range(len(rendeles)):
        if rendeles[i]=='G' or rendeles[i]=='g':
            return True

    else:
        return False
def amig_nemGg():
    rendeles=input("Kérem a rendelését: ")
    while van_e_G(rendeles)== False:
        rendeles=input("kerek egy olyan rendelést amiben van Garfildos Palacsinta: ")
    else:
        print("a rendelése megfelelö!")
        return rendeles
def gG_lista(szam):
    harmas=[]
    for i in range(szam):
        harmas.append(amig_nemGg())
    return harmas

def osszegzes(lista):
    a=0
    for i in range (len(lista)):
        szo=lista[i]
        for x in range(len(szo)):
            if szo[x] == 'G' or szo[x] == 'g':
                a+=1
    print()
    print(a ,"Gárfildos palacsintát csinál a szakács")