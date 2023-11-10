package LeeetCode2102;

import java.util.ArrayList;
import java.util.List;

public class SORTracker {

    private String name;
    private int score;

    public SORTracker() {
        list=new ArrayList<>();
    }

    public SORTracker(String name, int score) {
        this.name = name;
        this.score = score;
    }

    private List<SORTracker> list;
    private int index=0;


    void add(String name, int score){
        if (list==null)
            list.add(new SORTracker(name,score));
        for (int i=0;i<list.size();i++){
            if (score>list.get(i).getScore()){
                list.add(i,new SORTracker(name,score));
                return;
            }
            if (score==list.get(i).getScore()){
                if (name.compareTo(list.get(i).getName())<0){
                    list.add(i,new SORTracker(name,score));
                    return;
                }
            }
        }
        list.add(new SORTracker(name,score));
    }

    String get(){
        index++;
        return list.get(index-1).getName();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        SORTracker tracker = new SORTracker(); // 初始化系统
        tracker.add("bradford", 2); // 添加 name="bradford" 且 score=2 的景点。
        tracker.add("branford", 3); // 添加 name="branford" 且 score=3 的景点。
        System.out.println(tracker.get());              // 从好带坏的景点为：branford ，bradford 。
        // 注意到 branford 比 bradford 好，因为它的 评分更高 (3 > 2) 。
        // 这是第 1 次调用 get() ，所以返回最好的景点："branford" 。
        tracker.add("alps", 2);     // 添加 name="alps" 且 score=2 的景点。
        System.out.println(tracker.get());              // 从好到坏的景点为：branford, alps, bradford 。
        // 注意 alps 比 bradford 好，虽然它们评分相同，都为 2 。
        // 这是因为 "alps" 字典序 比 "bradford" 小。
        // 返回第 2 好的地点 "alps" ，因为当前为第 2 次调用 get() 。
        tracker.add("orland", 2);   // 添加 name="orland" 且 score=2 的景点。
        System.out.println(tracker.get());              // 从好到坏的景点为：branford, alps, bradford, orland 。
        // 返回 "bradford" ，因为当前为第 3 次调用 get() 。
        tracker.add("orlando", 3);  // 添加 name="orlando" 且 score=3 的景点。
        System.out.println(tracker.get());              // 从好到坏的景点为：branford, orlando, alps, bradford, orland 。
        // 返回 "bradford".
        tracker.add("alpine", 2);   // 添加 name="alpine" 且 score=2 的景点。
        System.out.println(tracker.get());              // 从好到坏的景点为：branford, orlando, alpine, alps, bradford, orland 。
        // 返回 "bradford" 。
        System.out.println(tracker.get());              // 从好到坏的景点为：branford, orlando, alpine, alps, bradford, orland 。
        // 返回 "orland" 。
    }
}


