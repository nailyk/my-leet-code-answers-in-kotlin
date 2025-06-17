package org.example.binary_tree

import java.util.LinkedList
import java.util.Queue
import java.util.Stack

class MaximumDepth_104 {

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)

        return 1 + maxOf(leftDepth, rightDepth)
    }


    fun maxDepthBfs(root: TreeNode?): Int {
        if (root == null) return 0

        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        var depth = 0

        while (queue.isNotEmpty()) {
            val levelSizeWidth = queue.size
            (0 until levelSizeWidth).forEach { i ->
                val node = queue.poll()
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            depth++
        }

        return depth
    }

    fun maxDepthDfs(root: TreeNode?): Int {
        if (root == null) return 0

        var maxDepth = 0
        val stack = Stack<Pair<TreeNode, Int>>()
        stack.push(Pair(root, 1))

        while (stack.isNotEmpty()) {
            val (node, depth) = stack.pop()
            maxDepth = maxOf(maxDepth, depth)

            node.left?.let { stack.push(Pair(it, depth + 1)) }
            node.right?.let { stack.push(Pair(it, depth + 1)) }
        }

        return maxDepth
    }
}