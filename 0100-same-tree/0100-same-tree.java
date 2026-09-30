class Solution {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    void preorder(TreeNode p, List<Integer> list) {
        if(p == null) {
            list.add(null);
            return;
        }

        list.add(p.val);
        preorder(p.left, list);
        preorder(p.right, list);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        preorder(p, list1);
        preorder(q, list2);

        if(list1.size() != list2.size()) {
            return false;
        }

        for(int i = 0; i < list1.size(); i++) {
            if(!Objects.equals(list1.get(i), list2.get(i))) {
                return false;
            }
        }

        return true;
    }
}