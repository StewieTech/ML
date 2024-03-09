#include<iostream>
#include<string>

class WIFE;

class HUSBAND
{
private: 
    std::string Husband_fname;
    std::string Husband_lname;
    int Husband_income;

public: 
    HUSBAND(std::string f1, std::string f2, int inc): Husband_fname(f1), Husband_lname(f2), Husband_income(inc) {}
    int get_income();
    friend class WIFE;
};

class WIFE
{
private:
    std::string Wife_fname;
    std::string Wife_lname;
    int Wife_income;
    int tax_rate;

public: 
    WIFE(std::string f1, std::string f2, int inc, int tr): Wife_fname(f1), Wife_lname(f2), Wife_income(inc), tax_rate(tr) {}
    float calcTax(HUSBAND &f);
    float getTaxRate();
    int getIncome();
};

int HUSBAND::get_income()
{
    return Husband_income;
}

float WIFE::calcTax(HUSBAND &f)
{
    float taxAmount = (f.get_income() + Wife_income) * (static_cast<float>(tax_rate) / 100);
    return taxAmount;
}

float WIFE::getTaxRate()
{
    return static_cast<float>(tax_rate);
}

int WIFE::getIncome()
{
    return Wife_income;
}

int main()
{
    HUSBAND obj1("Albert","John",55026);
    WIFE obj2("Mary","Chin",120000,5);

    // Task1: Display the tax rate;
    std::cout << "Tax Rate: " << obj2.getTaxRate() << std::endl;

    // Task2: Display income of HUSBAND;
    std::cout << "Husband's Income: " << obj1.get_income() << std::endl;

    // Task3: Display income of WIFE;
    std::cout << "Wife's Income: " << obj2.getIncome() << std::endl;

    // Task4: Display total family income;
    int totalIncome = obj1.get_income() + obj2.getIncome();
    std::cout << "Total Family Income: " << totalIncome << std::endl;

    // Task5: Display total Tax Amount;
    float taxAmount = obj2.calcTax(obj1);
    std::cout << "Total Tax Amount: " << taxAmount << std::endl;

    system("pause");
    return 0;
}