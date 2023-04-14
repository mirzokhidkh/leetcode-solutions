class MedianFinder {
private:
    priority_queue<int> pq;
public:
    vector<int> list;

    MedianFinder() {


    }

    void addNum(int num) {
        pq.push(num);

        list.push_back(pq.top());
        pq.pop();
    }

    double findMedian() {
        double medium;
        int n = list.size();
        if(n % 2 == 0){
            medium  = (double)(list[n/2-1] + list[n/2])/2;
        }else{
            medium = list[n/2];
        }
        return medium;
    }
};

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder* obj = new MedianFinder();
 * obj->addNum(num);
 * double param_2 = obj->findMedian();
 */