package Models;

public class StreamComporator {
    public static int compare(FlowOfGroups flowOfGroups1, FlowOfGroups flowOfGroups2){
        int count1 = flowOfGroups1.getFlowofgroups().size();
        int count2 = flowOfGroups2.getFlowofgroups().size();
        return Integer.compare(count1,count2);
    }
}
