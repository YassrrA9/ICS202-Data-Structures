package lab6package;

import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class BinaryTree<T extends Comparable<? super T>> {
	BTNode root;

	public BinaryTree() {
		root = null;
	}

	public void purge() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(T key) {
		if (root == null) {
			root = new BTNode(key);
			return;
		}

		BTNode temp;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);

		// Do level order traversal until we find the first empty left or right child.
		while (!q.isEmpty()) {
			temp = q.poll();

			if (temp.left == null) {
				temp.left = new BTNode(key);
				break;
			} else
				q.add(temp.left);

			if (temp.right == null) {
				temp.right = new BTNode(key);
				break;
			} else
				q.add(temp.right);
		}
	}

	public void deleteByCopying(T data) {
		if (root == null)
			throw new UnsupportedOperationException("Tree is empty!");
		else if (root.left == null && root.right == null) {
			if (root.data.equals(data))
				root = null;
			else
				throw new NoSuchElementException(data + " not in the tree.");
			return;
		}

		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		BTNode keyNode = null;
		BTNode currentNode = null;
		BTNode parentNode = root;
		boolean found = false;
		while (!queue.isEmpty()) {
			currentNode = queue.poll();

			if (currentNode.data.equals(data)) {
				if (!found) {
					keyNode = currentNode;
					found = true;
				}
			}

			if (currentNode.left != null) {
				queue.add(currentNode.left);
				parentNode = currentNode;
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
				parentNode = currentNode;
			}
		}

		if (!found)
			throw new NoSuchElementException(data + " not in tree.");

		while (!queue.isEmpty()) {
			currentNode = queue.poll();
			System.out.print(currentNode.data + "  ");
			if (currentNode.left != null) {
				queue.add(currentNode.left);
				parentNode = currentNode;
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
				parentNode = currentNode;
			}
		}

		keyNode.data = currentNode.data;
		if (parentNode.left == currentNode)
			parentNode.left = null;
		else if (parentNode.right == currentNode)
			parentNode.right = null;
	}

	public void levelOrderTraversal() { // BreadthFirstTraversal
		levelOrderTraversal(root);
	}

	private void levelOrderTraversal(BTNode root) {
		if (root == null)
			return;
		Queue<BTNode> queue = new LinkedList<BTNode>();
		BTNode node = root;
		queue.add(node);
		while (!queue.isEmpty()) {
			node = queue.poll();
			System.out.print(node.data + "  ");
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}
	}

	public void inorderTraversal() {
		inorderTraversal(root);
	}

	protected void inorderTraversal(BTNode node) {
		if (node == null)
			return;

		inorderTraversal(node.left);
		System.out.print(node.data + " ");
		inorderTraversal(node.right);
	}

	public void postorderTraversal() {
		postorderTraversal(root);
	}

	private void postorderTraversal(BTNode node) {
		if (node == null)
			return;

		postorderTraversal(node.left);
		postorderTraversal(node.right);

		System.out.print(node.data + " ");
	}

	public void preorderTraversal() {
		preorderTraversal(root);
	}

	private void preorderTraversal(BTNode node) {
		if (node == null)
			return;

		System.out.print(node.data + " ");

		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}

	public boolean search(T key) {
		if (root == null)
			return false;
		Queue<BTNode> queue = new LinkedList<BTNode>();
		BTNode node = root;
		queue.add(node);
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (key.equals(node.data))
				return true;
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}
		return false;
	}

	public void printTree() {
		printTree(root, "", true);
	}

	// Print the tree
	private void printTree(BTNode currPtr, String indent, boolean last) {
		if (currPtr != null) {
			System.out.print(indent);
			if (last) {
				System.out.print("R----");
				indent += "   ";
			} else {
				System.out.print("L----");
				indent += "|  ";
			}
			System.out.println(currPtr.data);
			printTree(currPtr.left, indent, false);
			printTree(currPtr.right, indent, true);
		}
	}

	int counter = 0;

	public int countAux(BTNode root) {
		if (root == null)
			return 0;
		counter++;
		int summation = countAux(root.left) + countAux(root.right) + 1;
		return summation;

	}

	public int count() {
		return countAux(this.root);

	}

	private boolean isLeaf(BTNode node) {
		if (node == null) {
			return false;
		}
		if ((node.left == null) && (node.right == null)) {
			return true;
		}
		return false;
	}

	public int countLeaves() {
		return countLeaves(this.root);

	}

	private int countLeaves(BTNode node) {
		if (node == null) {
			return 0;
		}
		if ((node.right == null) && (node.left == null)) {
			return 1;
		} else {
			return countLeaves(node.left) + countLeaves(node.right);
		}
	}

	private int getLevel(BTNode root, T key, int level) {
		if (root == null) {
			return 0;
		}
		if (root.data == key) {
			return level;
		}

		int endResult = getLevel(root.left, key, level + 1);
		if (endResult != 0) {
			return endResult;
		}
		endResult = getLevel(root.right, key, level + 1);

		return endResult;
	}

	public int getLevel(T data) {
		if (search(data)) {
			return getLevel(this.root, data, 0);
		} else {
			throw new NoSuchElementException("Key not in tree !");
		}
	}
}