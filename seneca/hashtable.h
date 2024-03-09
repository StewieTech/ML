const int CAPACITY = 31;
// int idx = 0;

struct RecordType {
    int key;
    double otherData;
    int importantData;
} ;

class Table {
    private:
        RecordType data[CAPACITY];
        int used;
    public:
        Table();
        void insert(const RecordType& entry);
        void find(int key, bool&found, RecordType& result);
        int hash(int key) const;
        void findIndex(int key, bool &found, int& i);
        int size() const;

};