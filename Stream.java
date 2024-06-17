import java.util.List;
import java.util.Iterator;

public class Stream {
    public String name;
    private List<StudentGroup> groups;

    public Stream(String name, List<StudentGroup> groups)
    {
        this.name = name;
        this.groups = groups;
    }

    public void addGroup(StudentGroup group) {
        this.groups.add(group);
    }

    public Iterator<StudentGroup> iterator(){
        Iterator<StudentGroup> groupIterator = new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public StudentGroup next() {
                return groups.get(index++);
            }

            @Override
            public void remove() {
                if(index < groups.size()){
                    groups.remove(index);
                }
            }
        };
        return groupIterator;
    }

    public int getCountGroups() {
        return this.groups.size();
    }
}
