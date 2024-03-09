//HashTable.h

#pragma once
const int CAPACITY = 31;

struct RecordType
{
        int key;
        double otherData;
        int importantData;
};

class Table
{
private:
        RecordType data[CAPACITY];
        int used;
public:
        Table();
        void insert(const RecordType& entry);
        void find(int key, bool& found, RecordType& result);
        int hash(int key) const;
        void findIndex(int key, bool& found, int& i);
        int size() const;
};



//HashTable.cpp
​#include<iostream>
#include<cassert>
#include"HashTable.h"

using namespace std;
int idx = 0;
Table::Table()
{
        used = 0;
        for (int i = 0; i < CAPACITY; i++)
        {
                data[i].key = -1; //originally empty spot
        }
}
void Table::insert(const RecordType& entry)
{
        //convert entry.key to index
        // find if index is empty or not (linear probing)

        bool alreadyThere;
        int index = 0;

        findIndex(entry.key, alreadyThere, index);
        if (!alreadyThere)
        {
                assert(size() < CAPACITY);
                used++;
        }
        data[index] = entry;

}
void Table::find(int key, bool& found, RecordType & result)
{
        cout << "Key to find: " << key << endl;
        findIndex(key, found, idx);
        if (found)
        {
                result = data[idx];
        }
}
int Table::hash(int key) const
{
        return key % CAPACITY;
}
void Table::findIndex(int key, bool &found, int& i)
{
        int count = 0; //loop counter
        i = hash(key);

        //linear probing
        while (count < CAPACITY && data[i].key != -1 && data[i].key != key)
        {
                cout << "data[" << i << "].key= " << data[i].key << endl;
                count++;
                i = (i + 1) % CAPACITY;  //will ensure we are not stepping out of array's range
        }
        found = data[i].key == key;   //record already exist
        cout << "found = " << found << endl;
}
int Table::size() const
{
        return used;
}

//Source.cpp
#include<iostream>
#include"HashTable.h"

using namespace std;

void print_menu()
{
        cout << "\nThe following choices are available: " << endl;
        cout << "I insert a new record or update an existing record" << endl;
        cout << "F find a record" << endl;
        cout << "S get the number of records(size)" << endl;
        cout << "D delete a record" << endl;
        cout << "Q quit the program" << endl << endl;
}

int main()
{
        char choice;
        RecordType rec;
        int key, size = 0;
        bool found = false;
        Table dataTable;

        do {
                print_menu();
                cout << "Enter choice: ";
                cin >> choice;
                choice = toupper(choice);

                switch (choice)
                {
                case 'I':
                        cout << "Enter key (integer >=0) for a record: ";
                        cin >> rec.key;
                        cout << "Enter other data (double) for a record: ";
                        cin >> rec.otherData;
                        cout << "Enter important data (integer) for a record: ";
                        cin >> rec.importantData;

                        dataTable.insert(rec);
                        cout << "Record is inserted in the hash table. " << endl;
                        break;
                case 'F':
                        cout << "Enter key(integer>0) to search for: ";
                        cin >> key;
                        dataTable.find(key, found, rec);
                        if (found)
                        {
                                cout << "Record was found." << endl;
                                cout << "Key                =" << rec.key << endl;
                                cout << "Other Data         =" << rec.otherData << endl;
                                cout << "Important Data     =" << rec.importantData << endl;
                        }
                        else
                        {
                                cout << "Record with key " << key << " not found" << endl;
                        }
                        break;
                case 'S':
                        size = dataTable.size();
                        cout << "There are " << size << " records in the hash table." << endl;
                        cout << "There are " << CAPACITY - size << " empty spots left in the table." << endl;
                        break;
                case'D':
                        cout << "You have to implement the delete functionality" << endl;
                        break;
                case 'Q':
                        cout << "Thank you for using my Hash Table." << endl;
                        break;
                default:
                        cout << choice << " is an invalid choice." << endl;
                }
        } while (choice != 'Q');



        return 0;
}