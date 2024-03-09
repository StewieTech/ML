#include<iostream>
#include<cassert>
#include"hashtable.h"

using namespace std;

int idx = 0;

Table::Table() {
    used = 0;
    for (int i = 0; i < CAPACITY; i++) {
        data[i].key = -1; // originally empty spot
    }

}
void Table::insert(const RecordType& entry) {
    // convert entry.key to index
    // find if index is empty or not (linear probing)

    bool alreadyThere;
    int index = 0;

    findIndex(entry.key, alreadyThere, index);
    if (!alreadyThere) {
        assert(size()<CAPACITY);
        used ++;
    }
    data[index] = entry;

}
void Table::find(int key, bool&found, RecordType& result) {
    cout << "Key to find: " << key << endl;
    findIndex(key, found, idx);
    if(found) {
        result = data[idx];
    }

}

int Table::hash(int key) const {
    return key % CAPACITY;

}
void Table::findIndex(int key, bool &found, int& i) {
int count = 0;
i = hash(key);

// linear probing
while(count<CAPACITY && data[i].key != -1 && data[i].key != key) {
  cout << "data[" <<i<< "].key" << data[i].key << endl ;
  count++ ;
  i + (i + 1) % CAPACITY; // will ensure we are not stepping out of array's range
}
found = data[i].key == key; // record already exist
cout<<"found =  " << found << endl;

}

int Table::size() const
{
        return used;
}

