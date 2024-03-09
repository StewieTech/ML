#include<iostream>
using namespace std;


// ​Example: Linked List
struct node
{
        int data;
        node* next;
};

//basic operations: insert, search, display, update and delete

class List
{
private:
        node* head;
public:
        List()
        {
                head = nullptr;
        }
        void InsertAtStart(int value)
        {
                //create a new isolated node
                node* temp = new node;
                temp->data = value;
                temp->next = nullptr;

                if (!head) //if head == NULL ==> list is empty
                {
                        head = temp;
                }
                else
                {
                        temp->next = head;
                        head = temp;
                }
        }
        void displayList() const
        {
                cout << "Displaying List Elements" << endl;
                for (node* p = head; p != nullptr; p = p->next)
                {
                        cout << p->data << " --> ";
                }
                cout << " NULL" << endl;
        }
        void InsertAtMiddle(int pos, int value)
        {
                node* after_me = head;

                for (int i = 1; i < pos && after_me != NULL; i++)
                {
                        after_me = after_me->next;
                }

                if (after_me != NULL) //enough nodes in the list to insert new node after pos
                {
                        node* temp = new node;
                        temp->data = value;
                        temp->next = nullptr;

                        temp->next = after_me->next;
                        after_me->next = temp;
                }
                else
                {
                        cout << "Invalid position for the current linked list" << endl;
                }
        }
        node* searchList(int value)
        {
                node* temp = head;

                while (temp != NULL)
                {
                        if (temp->data == value)
                        {
                                return temp;
                        }
                        temp = temp->next;
                }
                return NULL;
        }
        void updateElement(int old_data, int new_data)
        {
                node* temp = searchList(old_data);
                if (temp) //temp!=NULL
                {
                        temp->data = new_data;
                }
                else
                {
                        cout << old_data << " value does not exist in the current list" << endl;
                }
        }
        void deleteNode(int value)
        {
                if (searchList(value)) //searchList(value) != NULL
                {
                        cout << "Node found, deleting ...." << endl;
                }
                else
                {
                        cout << "Node doesn't exist, can't delete. " << endl;
                        return;
                }

                node* before, * discard;
                before = NULL;
                discard = head;
                while (discard != NULL)
                {
                        if (discard->data == value)
                        {
                                if (before)  //before != NULL //Node is not the first node; 
                                {
                                        before->next = discard->next;
                                        delete discard;
                                        discard = NULL;
                                        cout << "Node Deleted Successfully." << endl;
                                }
                                else  //Node is first node
                                {
                                        head = discard->next;
                                        delete discard;
                                        discard = NULL;
                                        cout << "Node Deleted Successfully" << endl;
                                }

                        }
                        else
                        {
                                before = discard;
                                discard = discard->next;
                        }
                }
        }
};

int menu()
{
        int ch;
        cout << "Menu Options\n--------------" << endl;
        cout << "1: Head Insert" << endl;
        cout << "2: Display List" << endl;
        cout << "3: Insert Node at Middle" << endl;
        cout << "4: Search List" << endl;
        cout << "5: Update a Data Element in a List" << endl;
        cout << "6: Delete a Node" << endl;

        cout << "0: Exit" << endl;
        cout << "Enter your choice: ";
        cin >> ch;

        return ch;
}

int main()
{
        List myList;

        int ch, value, pos, new_value;

        ch = menu();

        while (ch != 0)
        {
                switch (ch)
                {
                case 1:
                        cout << "Enter an Integer: ";
                        cin >> value;
                        myList.InsertAtStart(value);
                        break;
                case 2:
                        myList.displayList();
                        break;
                case 3:
                        cout << "Enter a position after which you want to insert a new node: ";
                        cin >> pos;
                        cout << "Enter an Integer: ";
                        cin >> value;
                        myList.InsertAtMiddle(pos, value);
                        break;
                case 4:
                        cout << "Enter an Integer to search in the list: ";
                        cin >> value;
                        if (myList.searchList(value)) //return is not null -- value found
                        {
                                cout << value << " exist in the list." << endl;
                        }
                        else
                        {
                                cout << value << " doesn't exist in the list" << endl;
                        }
                        break;
                case 5:
                        cout << "Enter an Integer to update in the list: ";
                        cin >> value;
                        cout << "Enter a new value: ";
                        cin >> new_value;
                        myList.updateElement(value, new_value);
                        break;
                case 6:
                        cout << "Enter Data to Delete a Node: ";
                        cin >> value;
                        myList.deleteNode(value);
                        break;
                case 0:
                        cout << "Thanks for using my Linked List" << endl;
                        break;
                default:
                        cout << "Make a valid choice" << endl;
                }
                ch = menu();
        }

        return 0;
}



