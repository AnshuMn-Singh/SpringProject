package module15Mockito;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int maximumFromAllData() {
        int[] data = dataService.retrieveAllData();
        int mx = Integer.MIN_VALUE;
        for(int i : data) {
            mx = Math.max(i, mx);
        }
        return mx;
    }
}

interface DataService {
    int[] retrieveAllData();
}