#include<iostream>
#include"hashtable.h"

using namespace std;

void print_menu()
{
    cout << "\n The following choices are available " << endl;
    cout << "I insert a new record or update an existing record " << endl;
    cout << "S get the number of records(size) " << endl;
    cout << "F find a record " << endl;
    cout << "D delete a record " << endl;
    cout << "Q quit the program " << endl << endl;
    
    } 

    int main() {
        char choice;
        RecordType rec;
        int key, size = 0;
        bool found = false;
        Table dataTable;

        do {
            print_menu();
            cout << " Enter choice: " ;
            cin >> choice;
            choice = toupper(choice);

            switch (choice) {
                case 'I': 
                cout << "Enter key (interger >=) for a record: ";
                cin >> rec.key;
                cout<< "Enter other data (double) for a record: ";
                cin >> rec.otherData;
                cout<< "Enter important data (integer) for a record: ";
                cin >> rec.importantData;

                dataTable.insert(rec);
                cout<< "Record is inserted in the hast table "<< endl;
                break;
            case 'F':
            cout << " Enter key(interger> 0) to search for: " << endl;
            cin >> key;
            dataTable.find(key, found, rec);
            if (found) {
                cout << "Record was found. " << endl;
                cout << "Key    = " << rec.key<< endl;
                cout <<" Other Data" << rec.otherData << endl;
                cout << "Important Data    " << rec.importantData << endl;
            }
            else {
                cout << " Record with key " << key << " not found " << endl;
            }
            break;
            case 'S' :
                size = dataTable.size();
                cout << "There are " << size << " records in the hash table. " << endl;
                cout << "There are " << CAPACITY - size << " empty spots left in the table. " <<  endl;
                break;
            case 'D':
                cout << "You have to implement the delete functionality " << endl;
                break;
            case 'Q':
                cout << "Thank you for using my Hash Table." << endl;
                break;
            default:
                cout << choice << " is an invalid choice. " << endl;

            }
        }
        while (choice != 'Q');
    }