#include<iostream>
#include<string>
using namespace std;

class WIFE;

class HUSBAND
{
    private: 
        string Husband_fname;
        string Husband_lname;
        int Husband_income;

public: 
    HUSBAND(string f1, string f2, int inc): Husband_fname(f1), Husband_lname(f2), Husband_income(inc) 
    {
            // defaultintializations of data members
    }
int get_income() ; 
friend class WIFE;

};

class WIFE
{
    private:
    string Wife_fname;
    string Wife_lname;
    int Wife_income;
    int tax_rate;

public: 
    WIFE(string f1, string f2, int inc, int tr): Wife_fname(f1), Wife_lname(f2), Wife_income(inc), tax_rate(tr)  
    // WIFE() ;
     {
        // Default initialations of private data members;
    }

    float calcTax(HUSBAND &f);
    float getTaxRate();
    int getIncome();
} ;

int HUSBAND::get_income() {
    return Husband_income;
}

float WIFE::calcTax(HUSBAND &f) {
    float tax_amount = (f.get_income() + Wife_income)  * ( static_cast<float>(tax_rate) / 100) ;
    return tax_amount ;
}

int WIFE::getIncome() {
    return Wife_income;
}

float WIFE::getTaxRate() {
    return tax_rate;
}


int main()
{
    HUSBAND obj1("Albert","John",55026);
    WIFE obj2("Mary","Chin",120000,5);

//Task1: Display the tax rate;
std::cout << "Tax Rate: " << obj2.getTaxRate() << "%" << endl; 

// Task2: Display income of HUSBAND;
cout << "Husband income: " << obj1.get_income() << endl;

// Task3: Display income of WIFE;

cout << "Wife Income: " << obj2.getIncome() << endl;
// Task4: Display total family income;

int totalIncome = obj1.get_income() + obj2.getIncome();
return totalIncome ;

// Task5: Display total Tax Amount;
cout << "Tax Amount: " << obj2.calcTax(obj1) << endl;


    system("pause");
    return 0;

}