#include<iostream>


using namespace std;

int main(){
   int a[] = {1, 2, 3, 4, 5};

   cout << "Address of a: " << a << endl;
   cout << "Address of a[0]: " << &a[0] << endl;
   cout << "Address of a[1]: " << &a[1] << endl;
   cout << "Address of a[2]: " << &a[2] << endl;
   cout << "Address of a[3]: " << &a[3] << endl;
   cout << "Address of a[4]: " << &a[4] << endl;
   cout << "Size of a: " << sizeof(a) << endl;
}