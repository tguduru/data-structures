package org.tguduru.data.structures.tree;

import org.tguduru.data.structures.linkedlists.Position;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 6/23/16.
 */
public interface BinaryTree<E> extends Tree<E> {
    Position<E> left(Position<E> position);
    Position<E> right(Position<E> position);
    Position<E> sibling(Position<E> position);
}
