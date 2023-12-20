public class Lab07 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("0");
        set.add("1");
        System.out.println("Set: " + set);

        HashSet<String> newSet = new HashSet<>();
        newSet.add("3");
        newSet.add("2");
        set.addAll(newSet);
        System.out.println("After addAll: " + set);

        newSet.clear();
        newSet.add("1");
        newSet.add("3");
        set.removeAll(newSet);
        System.out.println("After removeAll: " + set);

        newSet.clear();
        newSet.add("0");
        newSet.add("2");
        boolean containsAll = set.containsAll(newSet);
        System.out.println("ContainsAll: " + containsAll);

        newSet.clear();
        newSet.add("2");
        newSet.add("3");
        set.retainAll(newSet);
        System.out.println("After retainAll: " + set);
    }
}
