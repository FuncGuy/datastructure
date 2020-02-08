package BinaryTree;

class NthNode
{
    static int count =0;
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;

        return (node);
    }


    /* Given a binary tree, print its nth nodes of inorder*/
    static void NthInorder( Node node, int n)
    {
      if(node == null){
          return;
      }

      if(count <= n){
          NthInorder(node.left, n);
          count++;
          if(count == n){
              System.out.println(node.data);
          }
          NthInorder(node.right, n);
      }


    }

    /* Driver program to test above functions*/
    public static void main(String args[])
    {
        Node root = newNode(10);
        root.left = newNode(20);
        root.right = newNode(30);
        root.left.left = newNode(40);
        root.left.right = newNode(50);

        int n = 4;

        NthInorder(root, n);
    }
}

// This code is contributed
// by Arnab Kundu