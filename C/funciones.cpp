#include <iostream>
using namespace std;

int multiplos(string var1, string var2){
    int total = 100;
    for(int i = 1; i<=100; i++){
        if(i%3==0 && i%5==0){
            cout<<var1+var2<<endl;
            total--;
        } else if (i%3==0){
            cout<<var1<<endl;
            total--;
        } else if (i%5==0){
            cout<<var2<<endl;
            total--;
        } else {
            cout<<i<<endl;
        }
    }
    return total;
}



int main(){
    cout << "El total es: " << multiplos("Hola","Mundo") << endl;
}